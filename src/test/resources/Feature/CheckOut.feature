Feature: Tester CheckOut de site ShoeArena
  En tant que utilisateur je veux tester le site ShoeArena
  Background: : je veux tester la connexion et l'ajout produit au pannier
    When je clique sur le bouton login Ou register
    And je saisi login et password
    Then Redirection vers page Account
    When Je clique sur le bouton Kids
    And Je clique sur le bouton Add to cart du produit Kids
    And je clique sur la taille souhaitée
    And je clique sur continuer Shoping
    And Je clique sur le bouton Men
    And Je clique sur le bouton Add to cart du produit Men
    And je clique sur la pointure souhaitée
    Then Les produit s ajoutent dans le panier

    @SuppressionDuPanier
      Scenario: je souhaite supprimer un produit du pannier
      When Je clique sur l icone panier
      And Je clique sur le bouton remove
      Then Le produit sera supprimé du panier

      @AjouterWishList
        Scenario: je souhaite ajouter un produit au wishlist
        When Je clique sur l icone panier
        And je clique sur le bouton Add
        Then le produit sera ajouter au Wishlist et supprimé du panier

        @ModificationProduit
          Scenario: je souhaite modifier un produit
          When Je clique sur l icone panier
          And je clique sur le bouton modifier
          Then redirection vers page produit
          When je clique sur bouton Taille
          And je clique sur bouton modifer
          And Je clique sur l icone panier
          Then redirection vers page produit et le produit sera modifier

  @CheckOut
    Scenario: Je souhaite tester la checkout des données personnels
      When Je clique sur l icone panier
      And Je clique sur le bouton checkout
      When Je rempli le username
      And Je saisie le lastname
      And je saisie le numero Tel
      And je saisi l'adresse
      And je selectionne le pays
      And je saisie prof
      And Je saisie le code postal
      And je clique sur le bouton continue
      Then une page overview s affiche
      When je clique sur payer à la livraison
      And je clique sur bouton finish
      Then une page Checkout:Complete s affiche




