package StepsDefinition;

import PageFactory.CartPage;
import PageFactory.CheckOutPage;
import PageFactory.HomePage;
import PageFactory.LoginPage;
import Utils.ConfigReader;
import Utils.ElementUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileNotFoundException;
import java.util.Properties;

public class CheckOut {
    WebDriver Driver = new EdgeDriver();
    HomePage homePage= new HomePage(Driver);
    LoginPage loginPage= new LoginPage(Driver);
    Properties prop;
    ConfigReader configReader;
    ElementUtils elementUtils;
    CartPage cartPage= new CartPage(Driver);

    CheckOutPage checkOut= new CheckOutPage(Driver);
    @When("je clique sur le bouton login Ou register")
    public void je_clique_sur_le_bouton_login_ou_register() throws FileNotFoundException, InterruptedException {

        configReader = new ConfigReader();
        prop = configReader.ConfigurationManager();

        Driver.manage().window().maximize();
        Driver.get(configReader.GetUrl());
        Thread.sleep(3000);
        homePage.clickNavLoginRegister();

    }
    @When("je saisi login et password")
    public void je_saisi_login_et_password() throws InterruptedException {
        Thread.sleep(3000);
        loginPage.SetUsername(configReader.GetUsername());
        loginPage.SetPassword(configReader.GetPassword());
        Thread.sleep(3000);
        loginPage.ClickLoginButton();
    }
    @Then("Redirection vers page Account")
    public void redirection_vers_page_account() throws InterruptedException {
        Thread.sleep(3000);
        ElementUtils elementUtils = new ElementUtils(Driver);
        elementUtils.Exist("لوحة التحكم");
    }
    @When("Je clique sur le bouton Kids")
    public void je_clique_sur_le_bouton_kids() throws InterruptedException {
        Thread.sleep(3000);
        homePage.ClickKids();

    }
    @When("Je clique sur le bouton Add to cart du produit Kids")
    public void je_clique_sur_le_bouton_add_to_cart_du_produit_kids() throws InterruptedException {
        Thread.sleep(2000);
        cartPage.clickAddToCartKids();

    }
    @When("je clique sur la taille souhaitée")
    public void je_clique_sur_la_taille_souhaitée() throws InterruptedException {
        Thread.sleep(3000);
        cartPage.ClickTaille();
        cartPage.AddToCart();

    }
    @When("je clique sur continuer Shoping")
    public void je_clique_sur_continuer_shoping() throws InterruptedException {
        Thread.sleep(3000);
        cartPage.ContinueShop();

    }
    @When("Je clique sur le bouton Men")
    public void je_clique_sur_le_bouton_men() {
        homePage.ClickMen();


    }
    @When("Je clique sur le bouton Add to cart du produit Men")
    public void je_clique_sur_le_bouton_add_to_cart_du_produit_men() throws InterruptedException {
        Thread.sleep(3000);
        cartPage.ClickAddtoCartMen();

    }
    @When("je clique sur la pointure souhaitée")
    public void je_clique_sur_la_pointure_souhaitée() throws InterruptedException {

        Thread.sleep(2000);
        cartPage.ClickPointureMEN();
        cartPage.AddToCart();

    }
    @Then("Les produit s ajoutent dans le panier")
    public void les_produit_s_ajoutent_dans_le_panier() throws InterruptedException {
        elementUtils=new ElementUtils(Driver);
        Thread.sleep(3000);
     elementUtils.Exist("تمت اضافة المنتج الى الحقيبة");

    }
    @When("Je clique sur l icone panier")
    public void je_clique_sur_l_icone_panier() throws InterruptedException {
        Thread.sleep(3000);
        cartPage.CheckOutCart();
    }
    @When("Je clique sur le bouton checkout")
    public void je_clique_sur_le_bouton_checkout() throws InterruptedException {
        Thread.sleep(3000);
      checkOut.CheckOutButton();
    }
    @When("Je rempli le username")
    public void je_rempli_le_username() throws InterruptedException {
        Thread.sleep(3000);

       checkOut.setFirstname("Louey");
    }
    @When("Je saisie le lastname")
    public void je_saisie_le_lastname() {
        checkOut.setLastname("louey");
    }
    @When("je saisie le numero Tel")
    public void je_saisie_le_numero_tel() {
       checkOut.setPhone("444153266");
    }
    @When("je saisi l'adresse")
    public void je_saisi_l_adresse() {
       checkOut.setAdress1e("adresse22 jjjjj");
    }
    @When("je selectionne le pays")
    public void je_selectionne_le_pays() {
       checkOut.setCity("Abha");
    }
    @When("je saisie prof")
    public void je_saisie_prof() {
        checkOut.setAdresse2("progeeee jjjjj");
    }
    @When("Je saisie le code postal")
    public void je_saisie_le_code_postal() {
       checkOut.setProf("12542");
    }
    @When("je clique sur le bouton continue")
    public void je_clique_sur_le_bouton_continue() throws InterruptedException {
        Thread.sleep(3000);
       checkOut.CheckoutButton();
    }
    @Then("une page overview s affiche")
    public void une_page_overview_s_affiche() throws InterruptedException {
        Thread.sleep(3000);
elementUtils.Exist("تفاصيل الفاتورة");
    }
    @When("je clique sur payer à la livraison")
    public void je_clique_sur_payer_à_la_livraison() throws InterruptedException {
        Thread.sleep(3000);
      checkOut.CheckLivraion();
    }
    @When("je clique sur bouton finish")
    public void je_clique_sur_bouton_finish() throws InterruptedException {
        Thread.sleep(2000);
      checkOut.PayedButton();
    }
    @Then("une page Checkout:Complete s affiche")
    public void une_page_checkout_complete_s_affiche() {
        elementUtils = new ElementUtils(Driver);
       elementUtils.Exist("شكرا لتسوقك معنا");
    }


    //Delete produit

    @When("Je clique sur le bouton remove")
    public void je_clique_sur_le_bouton_remove() throws InterruptedException {
        Thread.sleep(3000);
     cartPage.ClickDeleteProduct();
    }
    @Then("Le produit sera supprimé du panier")
    public void le_produit_sera_supprimé_du_panier() throws InterruptedException {
        Thread.sleep(3000);
     elementUtils.Exist("بيك حذاء رياضي رجالي");
    }

    // Add wishlist


    @When("je clique sur le bouton Add")
    public void je_clique_sur_le_bouton_add() {
        cartPage.ClickAddwishList();
    }
    @Then("le produit sera ajouter au Wishlist et supprimé du panier")
    public void le_produit_sera_ajouter_au_wishlist_et_supprimé_du_panier() throws InterruptedException {
        Thread.sleep(3000);
        elementUtils.Exist("بيك حذاء رياضي رجالي");
    }

    //Modifier produit

    @When("je clique sur le bouton modifier")
    public void je_clique_sur_le_bouton_modifier() throws InterruptedException {
        Thread.sleep(3000);
        cartPage.ClickmodificationProduct();
    }
    @Then("redirection vers page produit")
    public void redirection_vers_page_produit() {
      String actualUrl="https://www.shoearena.sa/ET42667H-WHTGRN.html?&update=783412";
        elementUtils.Test(actualUrl);
    }

    @When("je clique sur bouton Taille")
    public void je_clique_sur_bouton_taille() throws InterruptedException {
        Thread.sleep(3000);
        cartPage.ModifierPointure();

    }

    @When("je clique sur bouton modifer")
    public void je_clique_sur_bouton_modifer() throws InterruptedException {

        Thread.sleep(2000);
        cartPage.AddToCart();
    }

    @Then("redirection vers page produit et le produit sera modifier")
    public void redirection_vers_page_produit_et_le_produit_sera_modifier() {

        elementUtils.Exist("45");
        elementUtils.Test("https://www.shoearena.sa/cart");

    }






}
