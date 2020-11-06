package TestCases;

import PageObjects.RegisterUser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterUserTestCase {

    private WebDriver driver;
    RegisterUser registerUser;

    @BeforeMethod
    public void setUp() throws Exception{
        registerUser = new RegisterUser(driver);
        driver = registerUser.chromeDriverConnection();
        registerUser.visit("https://demo.opencart.com/index.php?route=account/register");

    }

    @AfterMethod
    public void tearDown() throws Exception{
        //driver.quit();

    }

    @Test (groups = {"sanity"})
    public void registerUser(){
        registerUser.registerUser();
        registerUser.registerMsg();

    }
}
