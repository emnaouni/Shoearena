package StepsDefinition;

import PageFactory.AccountPage;
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

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class EditAccount {
    WebDriver driver = new EdgeDriver();
    LoginPage loginPage = new LoginPage(driver);
    AccountPage accountPage = new AccountPage(driver);
    HomePage homePage = new HomePage(driver);
    Properties prop ;
    ConfigReader config;
    ElementUtils element;

    @Given("je Cliqur sur button Login")
    public void je_cliqur_sur_button_login() throws InterruptedException, FileNotFoundException {
        config = new ConfigReader();
        prop= config.ConfigurationManager();
        driver.manage().window().maximize();
        driver.get(config.GetUrl());
        Thread.sleep(3000);
       homePage.clickNavLoginRegister();
    }
    @When("je Saisie login et mot de passe")
    public void je_saisie_login_et_mot_de_passe() throws InterruptedException {
        Thread.sleep(3000);
        loginPage.SetUsername(config.GetUsername());
        loginPage.SetPassword(config.GetPassword());
        Thread.sleep(3000);
        loginPage.ClickLoginButton();
    }
    @Then("direction vers page Home")
    public void direction_vers_page_home() throws InterruptedException {
        ElementUtils element = new ElementUtils(driver);
  Thread.sleep(3000);
        element.Exist("لوحة التحكم");

    }
    @When("je clique sur bouton Logout")
    public void je_clique_sur_bouton_logout() throws InterruptedException {
        Thread.sleep(3000);
       homePage.ClickLogout();
    }
    @Then("Redirection vers page logout avec succée")
    public void redirection_vers_page_logout_avec_succée() {
        String pageContent=driver.findElement(By.tagName("html")).getText();
        List<String> motRecherche= new ArrayList<>();
        motRecherche.add("مرحبا بك");
        for(String  mot : motRecherche){
            if (pageContent.contains(mot)) {
                System.out.println("le mot " + mot + "  existe sur la page");
            }
            else {
                System.out.println("le mot " + mot + "  n'existe sur la page");
            }
        }
    }

}
