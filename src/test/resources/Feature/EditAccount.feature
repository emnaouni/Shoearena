Feature: Tester Edit Compte
  Background:
    Given  je Cliqur sur button Login
    When je Saisie login et mot de passe
    Then direction vers page Home
    @Logout
  Scenario: tester Logout
    When je clique sur bouton Logout
    Then Redirection vers page logout avec succée
