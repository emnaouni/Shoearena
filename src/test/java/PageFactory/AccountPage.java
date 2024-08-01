package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
    WebDriver driver;
    public AccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "/html/body/div[2]/main/div[1]/div/aside/div/ul/ul/li[2]/a")
    WebElement EditButton;

    public  void  ClickEditButton() {
        EditButton.click();
    }


}
