package pages;

import baseDriver.BaseDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseDriver {
    public HomePage (WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement myAccount;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement register;

    public void clickMYaccount(){
       myAccount.click();
    }

    public void clickRegister(){
        register.click();
    }


}
