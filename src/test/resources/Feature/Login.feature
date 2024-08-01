Feature: Tester login
  @Login
  Scenario: Tester login avec donnée valide
    Given  je suis sur la page ShoeArena
    When je clique sur le bouton login Or register
    And je saisie login et password
    Then redirection vers page d'acceuil

    Scenario Outline: Tester login avec des données invalides
      Given je suis sur la page ShoeArena
      When je clique sur le bouton login Or register
      And  je saisi <login> et <password>
      Then message d'erreur s'affiche
      Examples:
      |login            |password    |
      |"emna"           |"Hela123456"|
      |"Helaa@gmail.com"| "emna"     |
      | " "             | "  "       |
      |"Helaa@gmail.com"| " "        |


