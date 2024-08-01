package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class RegisterPage {
    @FindBy (id= "registerfirst")
    WebElement champfirstname;

    @FindBy(id="registerlast")
    WebElement champlastname;

    @FindBy (id = "registeremail")
    WebElement champemail;

    @FindBy(id = "registerpassword")
    WebElement champpassword;

    @FindBy ( xpath="//*[@id='clsNotifyRegisterForm']/table/tbody/tr[5]/td/span[3]/input")
    WebElement champgenre;
    WebDriver Driver;

    @FindBy (xpath = "//input[@style='margin-bottom:20px;']")
    WebElement registerbutton;
    public RegisterPage(WebDriver driver){
        this.Driver= driver;
        PageFactory.initElements(driver,this);
    }

    public void setChampfirstname(String firstname) {
        champfirstname.sendKeys(firstname);
    }
    public void setChamplastname(String lastname) {
        champlastname.sendKeys(lastname);
    }
    public void setChampemail(String email) {
        champemail.sendKeys(email);
    }
    public void setChamppassword(String password) {
        champpassword.sendKeys(password);
    }
    public void setChampgenre() {
        champgenre.click();
    }
    public void clickRegisterbutton() {
        registerbutton.click();
    }

}
