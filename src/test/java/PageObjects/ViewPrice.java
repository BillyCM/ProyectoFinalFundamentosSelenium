package PageObjects;
import POM.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class ViewPrice extends Base {

    public ViewPrice(WebDriver driver) {
        super(driver);
    }

    By searchBoxLocator = By.name("search");
    By searchIconLocator = By.xpath("//button[@class='btn btn-default btn-lg']");
    By selectItemLocator = By.xpath("//a[normalize-space()='MacBook']");
    By euroOptionLocator = By.name("EUR");
    By sterlingOptionLocator = By.name("GBP");
    By dolarOptionLocator = By.name("USD");
    By successSterlingLocator = By.xpath("//h2[contains(text(),'£')]");
    By successEuroLocator = By.xpath("//h2[contains(text(),'€')]");
    By successDolarLocator = By.xpath("//h2[contains(text(),'$')]");

    public void ViewPrice() {


        click(searchBoxLocator);
        type("Macbook",searchBoxLocator);
        click(searchIconLocator);
        click(selectItemLocator);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

        driver.findElement(By.xpath("//div[@class='pull-left']")).click();
        click(euroOptionLocator);
        Assert.assertTrue(isDisplayed(successEuroLocator));

        driver.findElement(By.xpath("//div[@class='pull-left']")).click();
        click(sterlingOptionLocator);
        Assert.assertTrue(isDisplayed(successSterlingLocator));

        driver.findElement(By.xpath("//div[@class='pull-left']")).click();
        click(dolarOptionLocator);
        Assert.assertTrue(isDisplayed(successDolarLocator));


    }
}
