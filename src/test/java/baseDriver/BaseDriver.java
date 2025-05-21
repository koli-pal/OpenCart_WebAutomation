package baseDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseDriver {
    WebDriver driver;
    public BaseDriver(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
}
