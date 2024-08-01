package StepsDefinition;

import PageFactory.HomePage;
import PageFactory.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.util.Properties;

public class Register {
    HomePage home;
    RegisterPage register;

    WebDriver Driver= new EdgeDriver();

    @Given("je me rends sur le site ShoeArena")
    public void je_me_rends_sur_le_site_shoe_arena() {
        home=new HomePage(Driver);
        register = new RegisterPage(Driver);

        Driver.manage().window().maximize();
        Driver.get("https://www.shoearena.sa/");

    }
    @When("je clique sur le bouton login register")
    public void je_clique_sur_le_bouton_login_register() throws InterruptedException {
      home.clickNavLoginRegister();
      home.clickButonRegister();
    }
    @When("je saisie le Firstname")
    public void je_saisie_le_firstname() {
       register.setChampfirstname("emnaaa");
    }
    @When("je saisie lastname")
    public void je_saisie_lastname() {
        register.setChamplastname("emna");
    }
    @When("je saisie Email")
    public void je_saisie_email() {
        register.setChampemail("emnaaa11@gmail.com");
    }
    @When("je saisie le password")
    public void je_saisie_le_password() {
        register.setChamppassword("emnaa123456");
    }
    @When("je selectionne le genre")
    public void je_selectionne_le_genre() {
        register.setChampgenre();
    }
    @When("je clique sur le bouton Submit")
    public void je_clique_sur_le_bouton_submit() {
     register.clickRegisterbutton();
    }
    @Then("une page mon compte sera affiché")
    public void une_page_mon_compte_sera_affiché() {
       String UrlCurrent= Driver.getCurrentUrl();
        Assert.assertEquals(UrlCurrent,"https://www.shoearena.sa/account");
    }

}
