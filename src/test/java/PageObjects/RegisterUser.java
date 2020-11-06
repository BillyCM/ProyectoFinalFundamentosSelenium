package PageObjects;

import POM.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utilities.*;

public class RegisterUser extends Base {

    public RegisterUser(WebDriver driver) {
        super(driver);
    }

    By registerAccountLocator = By.xpath("//div[@id=\"content\" ]");
    By nameLocator = By.name("firstname");
    By lastNameLocator = By.name("lastname");
    By emailLocator = By.name("email");
    By telephoneLocator = By.name("telephone");
    By passwordLocator = By.name("password");
    By passConfirmLocator = By.name("confirm");
    By subscribeNoLocator = By.xpath("//input[@value=\"0\"]");
    By privacyLocator = By.name("agree");
    By registerBtnLocator = By.xpath("//input[@value=\"Continue\"]");
    By registerSuccesfullLocator = By.xpath("//div[@id=\"content\"]/h1");

    public void registerUser(){

        RandomEmail randomEmail = new RandomEmail();

        if(isDisplayed(registerAccountLocator)){
            type("Karla",nameLocator);
            type("Cedeno",lastNameLocator);
            type(randomEmail.generateEmail(),emailLocator);
            type("22554875",telephoneLocator);
            type("123456",passwordLocator);
            type("123456",passConfirmLocator);
            click(subscribeNoLocator);
            click(privacyLocator);

            click(registerBtnLocator);

        }else{
            System.out.println("Sorry!! Register page was not found");
        }

    }

    public void registerMsg(){
        if(isDisplayed(registerSuccesfullLocator)){
            System.out.println("Registered user successfully");
        }else{
            System.out.println("The user could not be registered");
        }
    }
}
