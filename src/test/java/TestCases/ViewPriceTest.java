package TestCases;

import PageObjects.SearchProduct;
import PageObjects.ViewPrice;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ViewPriceTest {

    private WebDriver driver;
    ViewPrice viewPrice;

    @BeforeMethod
    public void setUp() throws Exception{
        viewPrice = new ViewPrice(driver);
        driver = viewPrice.chromeDriverConnection();
        viewPrice.visit("https://demo.opencart.com/index.php?route=common/home");

    }

    @AfterMethod
    public void tearDown() throws Exception{
        //driver.quit();

    }

    @Test(groups = {"sanity"})
    public void viewPrice(){
        viewPrice.ViewPrice();

    }
}
