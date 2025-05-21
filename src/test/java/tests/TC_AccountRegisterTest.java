package tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AccountRegisterPage;
import pages.HomePage;

import java.time.Duration;

public class TC_AccountRegisterTest {

   public WebDriver driver;
    @BeforeClass
    public void setup(){
        driver=new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.opencart.com/");
    }
    @AfterClass
    public void tearDown(){
    driver.close();
    }

    @Test
    public void verify_account_registration(){
        HomePage HPobj= new HomePage(driver);
        HPobj.clickMYaccount();
        HPobj.clickRegister();

        AccountRegisterPage ARobj=new AccountRegisterPage(driver);
        ARobj.Firstname(randomstring().toUpperCase());
        ARobj.Lastname(randomstring().toUpperCase());
        ARobj.Email(randomstring()+"@domain.com");
        ARobj.Password(alphanumeric());
        ARobj.privacy();
        ARobj.subscribe();
        ARobj.clivkContinue();
        String confirmationmsg =ARobj.getconfirmationmsg();

        Assert.assertEquals(confirmationmsg ,"Your Account Has Been Created!");

    }

    public String randomstring(){
        String generatedstring =RandomStringUtils.randomAlphabetic(5);
        return generatedstring;
    }
     public String randomnumber(){
       String generatednumber= RandomStringUtils.randomAlphanumeric(11);
        return (generatednumber);
     }
     public String alphanumeric(){
         String generatedstring =RandomStringUtils.randomAlphabetic(5);
         String generatednumber= RandomStringUtils.randomAlphanumeric(3);
         return (generatednumber+"@"+generatedstring);
     }
}
