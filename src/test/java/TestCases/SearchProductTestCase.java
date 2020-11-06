package TestCases;

import PageObjects.SearchProduct;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchProductTestCase {
    private WebDriver driver;
    SearchProduct searchProduct;

    @BeforeMethod
    public void setUp() throws Exception{
        searchProduct = new SearchProduct(driver);
        driver = searchProduct.chromeDriverConnection();
        searchProduct.visit("https://demo.opencart.com/index.php?route=common/home");
    }

    @AfterMethod
    public void tearDown() throws Exception{
        //driver.quit();
    }

    @Test(groups = {"sanity"})
    public void searchProduct(){
        searchProduct.SearchProduct();

    }

}
