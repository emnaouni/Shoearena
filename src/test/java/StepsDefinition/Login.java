package StepsDefinition;

import PageFactory.HomePage;
import PageFactory.LoginPage;
import Utils.ConfigReader;
import Utils.ElementUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Login {
    WebDriver Driver = new EdgeDriver();
    HomePage homePage= new HomePage(Driver);
    LoginPage loginPage= new LoginPage(Driver);
    Properties prop;
    ConfigReader configReader;
    ElementUtils elementUtils;



    @Given("je suis sur la page ShoeArena")
    public void je_suis_sur_la_page_shoe_arena() throws FileNotFoundException {


        configReader = new ConfigReader();
        prop = configReader.ConfigurationManager();

        Driver.manage().window().maximize();
        Driver.get(configReader.GetUrl());
    }
    @When("je clique sur le bouton login Or register")
    public void je_clique_sur_le_bouton_login_or_register() throws InterruptedException {
        Thread.sleep(3000);
        homePage.clickNavLoginRegister();
    }
    @When("je saisie login et password")
    public void je_saisie_login_et_password() throws InterruptedException {
        Thread.sleep(3000);
      loginPage.SetUsername(configReader.GetUsername());
      loginPage.SetPassword(configReader.GetPassword());
      Thread.sleep(3000);
      loginPage.ClickLoginButton();
    }
    @Then("redirection vers page d'acceuil")
    public void redirection_vers_page_d_acceuil() throws InterruptedException {
        Thread.sleep(3000);
        ElementUtils elementUtils = new ElementUtils(Driver);
        elementUtils.Exist("لوحة التحكم");
    }

    @When("je saisi {string} et {string}")
    public void je_saisi(String username, String password) throws InterruptedException {
        Thread.sleep(3000);
        loginPage.SetUsername(username);

        Thread.sleep(3000);

        loginPage.SetPassword(password);

        Thread.sleep(3000);

        loginPage.ClickLoginButton();

        Thread.sleep(3000);

    }
    @Then("message d'erreur s'affiche")
    public void message_d_erreur_s_affiche() {
      String url= Driver.getCurrentUrl();
        Assert.assertEquals(url , "https://www.shoearena.sa/");
    }


}
