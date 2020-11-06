package PageObjects;

import POM.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchProduct extends Base {

    public SearchProduct(WebDriver driver) {
        super(driver);
    }

    By searchBoxLocator = By.name("search");
    By searchIconLocator = By.xpath("//button[@class='btn btn-default btn-lg']");
    By addProductLocator = By.xpath("//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[1]");
    By shoppingCartLocator = By.xpath("//body/nav[@id='top']/div[@class='container']/div[@id='top-links']/ul[@class='list-inline']/li[4]");
    By checkOutBtnLocator = By.xpath("//a[@class='btn btn-primary']");
    By msgAvailableLocator = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
    By correctPageLocator = By.cssSelector("h1:nth-child(1) > a");


    public void SearchProduct(){

        if(isDisplayed(correctPageLocator)){
            click(searchBoxLocator);
            type("Macbook",searchBoxLocator);
            click(searchIconLocator);
            click(addProductLocator);
            click(shoppingCartLocator);
            click(checkOutBtnLocator);
            Assert.assertTrue(isDisplayed(msgAvailableLocator));
        }

    }

}
