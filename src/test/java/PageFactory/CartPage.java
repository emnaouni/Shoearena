package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    WebDriver driver;
    @FindBy (xpath = "//*[@id=\"mfilter-content-container\"]/div[3]/div/div[2]/div[2]/figure/a")
    WebElement CheckProductKid;

    @FindBy(id = "253032")
    WebElement TailleKids;

    @FindBy (xpath = "//*[@id=\"mfilter-content-container\"]/div[3]/div/div[14]/div[2]/figure/a")
    WebElement AddToCartMen;

    @FindBy(xpath = "//*[@id=\"251755\"]")
    WebElement PointureMEN;

    @FindBy(id = "button-cart")
    WebElement AddToCart;

    @FindBy (xpath = "//*[@id='addCartModal']/div/div/div/div/a[2]/button")
    WebElement ContinueShop;


    @FindBy (xpath = "//*[@id=\"addCartModal\"]/div/div/div/div/a[1]/button")
    WebElement CheckOutCart;

    @FindBy (xpath = "//*[@id=\"clsViewCart\"]/table/tbody/tr[2]/td/div[1]/a")
    WebElement AddToWishlist;

    @FindBy(xpath = "//*[@id=\"clsViewCart\"]/table/tbody/tr[2]/td/div[2]/a[2]")
    WebElement DeleteProduct;

    @FindBy (xpath = "//*[@id=\"clsViewCart\"]/table/tbody/tr[2]/td/div[2]/a[1]")
    WebElement ModificationProduct;


    @FindBy (id = "251757")
    WebElement PointureModifier;
    public  void ClickAddwishList(){
        AddToWishlist.click();
    }
    public  void ClickDeleteProduct(){
        DeleteProduct.click();
    }
    public  void ClickmodificationProduct(){
        ModificationProduct.click();
    }
    public void CheckOutCart(){
        CheckOutCart.click();
    }
    public void  ContinueShop() {
        ContinueShop.click();
    }
    public void clickAddToCartKids(){
        CheckProductKid.click();
    }

    public void  AddToCart(){
        AddToCart.click();
    }

    public void ClickPointureMEN() {
        PointureMEN.click();
    }

    public void  ClickTaille(){
        TailleKids.click();
    }
    public CartPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }



    public  void ClickAddtoCartMen () {
       AddToCartMen.click();

    }

    public  void ModifierPointure() {
        PointureModifier.click();
    }


}
