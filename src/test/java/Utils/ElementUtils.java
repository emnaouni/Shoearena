package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class ElementUtils {

    WebDriver driver;
    public ElementUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void Test (String Url ){
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, Url);
    }
    public void Exist ( String word){
        String pageContent=driver.findElement(By.tagName("html")).getText();
        List<String> motRecherche= new ArrayList<>();
        motRecherche.add(word);
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
