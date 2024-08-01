package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    Properties prop;
    public ConfigReader() {

    }
    public Properties ConfigurationManager() throws FileNotFoundException {
        prop = new Properties();
        File file = new File("src/test/resources/Config/ConfigFile.properties");

        try {
            FileInputStream fis = new FileInputStream(file);
            this.prop.load(fis);
        } catch (IOException e) {
           e.printStackTrace();
        }
        return this.prop;


    }
    public  String GetUrl(){
        String Url=this.prop.getProperty("Url");
        return Url;
    }
    public  String GetUsername(){
        String Username=this.prop.getProperty("login");
        return Username;
    }
    public  String GetPassword(){
        String Password=this.prop.getProperty("password");
        return Password;
    }

}
