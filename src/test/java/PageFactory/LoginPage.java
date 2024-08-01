package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy (id ="notifyemail")
    WebElement username;

    @FindBy(id = "notifypassword")
    WebElement password;

    @FindBy (xpath = "//input[@style='margin-bottom:10px;']")
    WebElement loginButton;
    public void  SetUsername (String username) {
        this.username.sendKeys(username);
    }
    public void  SetPassword (String password) {
        this.password.sendKeys(password);
    }

    public void  ClickLoginButton () {
        this.loginButton.click();
    }





    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
