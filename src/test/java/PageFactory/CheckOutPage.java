package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage {
WebDriver driver;
     public CheckOutPage(WebDriver driver) {
        this.driver=driver ;
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath="/html/body/div[2]/main/div[1]/div/div[4]/div[1]/div[4]/a")
    WebElement checkOutButton;

    @FindBy (id = "button-payment-method")
    WebElement PayedButton;

    @FindBy (id = "input-payment-firstname")
    WebElement Firstname;

    @FindBy(id = "input-payment-lastname")
    WebElement Lastname;




    @FindBy(id = "input-payment-telephone")
    WebElement Phone;

    @FindBy (id = "input-payment-address-1")
    WebElement Adresse1;

    @FindBy (id ="input-payment-address-2")
    WebElement Adresse2;

    @FindBy (id = "input-payment-city")
    WebElement City;

    @FindBy (id = "input-payment-postcode")
    WebElement Prof;
    @FindBy (id = "button-payment-address")
    WebElement ButonCheckContinue;

    @FindBy (xpath = "//*[@id=\"cod\"]")
    WebElement livraison;
    public void setAdress1e(String adresse) {
        Adresse1.sendKeys(adresse);
    }
    public void setAdresse2(String adresse22) {
        Adresse2.sendKeys(adresse22);
    }

    public void setCity(String city) {
        Select selection;
        selection= new Select(City);
        selection.selectByValue(city);
    }

    public void setPhone(String phone) {
        Phone.sendKeys(phone);
    }
    public void setProf(String prof) {
        Prof.sendKeys(prof);
    }

    public  void  setFirstname (String Firstname){
        this.Firstname.sendKeys(Firstname);
    }

    public  void  setLastname (String Lastname){
        this.Lastname.sendKeys(Lastname);
    }

    public void CheckLivraion(){
        livraison.click();
    }
    public void CheckOutButton() {
        checkOutButton.click();
    }
    public  void CheckoutButton() {
        ButonCheckContinue.click();
    }
    public void PayedButton() {
        PayedButton.click();
    }

}
