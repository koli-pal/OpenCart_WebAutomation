package pages;

import baseDriver.BaseDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegisterPage extends BaseDriver {
    public AccountRegisterPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//input[@id='input-firstname']")
    WebElement txtfirstname;

    @FindBy(xpath = "//input[@id='input-lastname']")
    WebElement txtlastname;

    @FindBy(xpath = "//input[@id='input-email']")
    WebElement txtemail;

    @FindBy(xpath = "//input[@id='input-password']")
    WebElement txtpassword;

    @FindBy(xpath = "//input[@id='input-newsletter']")
    WebElement btnsubscribe;

    @FindBy(xpath = "//input[@name='agree']")
    WebElement btnprivacy;

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement btncontinue;

    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement msgConfirmation;

    public void Firstname(String fname){
        txtfirstname.sendKeys(fname);
    }
    public void Lastname(String lname){
        txtlastname.sendKeys(lname);
    }
    public void Email(String email){
        txtemail.sendKeys(email);
    }
    public void Password(String pass){
       txtpassword.sendKeys(pass);
    }
    public void subscribe(){
        btnsubscribe.click();
    }
    public void privacy(){
        btnprivacy.click();
    }
    public void clivkContinue(){
        btncontinue.click();
    }
    public String getconfirmationmsg(){
        try{
            return (msgConfirmation.getText());
        } catch (Exception e) {
            return (e.getMessage());
        }
    }








}
