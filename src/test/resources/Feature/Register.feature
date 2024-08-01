Feature: tester la page register du site shoearena
  En tant qu'utilisateur je veux tester la page register du site shoearena
  Scenario: je souhaite tester la page register
    Given je me rends sur le site ShoeArena
    When je clique sur le bouton login register
    And je saisie le Firstname
    And je saisie lastname
    And je saisie Email
    And je saisie le password
    And je selectionne le genre
    And je clique sur le bouton Submit
    Then  une page mon compte sera affiché

