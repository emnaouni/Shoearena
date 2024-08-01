package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver Driver ;

    @FindBy (xpath = "//a[@title='تسجيل الدخول / تسجيل ']")
    WebElement navLoginRegister;

    @FindBy (xpath = "//*[@id=\"clsLoginregister\"]/div[2]/div[1]/a[3]")
    WebElement ButonRegister;

    @FindBy (xpath = "/html/body/div[2]/header/div[1]/div/div[2]/p[2]/a")
    WebElement ButtonLogout;

    public  void ClickLogout(){
        ButtonLogout.click();
    }

    @FindBy( xpath="//a[@href='https://www.shoearena.sa/men']")
    WebElement Men;

    public  void ClickMen(){
        Men.click();
    }

    @FindBy (xpath = "/html/body/div[2]/header/div[2]/div/div/div[2]/ul/li[3]/a")
    WebElement Kids;
    public  void ClickKids(){
        Kids.click();
    }
    public HomePage(WebDriver driver){
        this.Driver= driver;
        PageFactory.initElements(driver,this);
    }

    public void clickButonRegister() throws InterruptedException {
        Thread.sleep(3000);
        ButonRegister.click();
    }
    public void clickNavLoginRegister() throws InterruptedException {

        Thread.sleep(3000);
        navLoginRegister.click();
    }


}
