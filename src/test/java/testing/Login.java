package testing;

import base.DriverConfiguration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;

public class Login {

    public static void main(String[] args) throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.setBrowser("firefox");
        loginPage.navigateToUrl();
//        loginPage.pressAcceptAllButton("chrome");
          loginPage.addText("standard_user","secret_sauce");
          loginPage.clickOnLogIn();
          loginPage.selectProduct();
          loginPage.openShoppingCart();
          loginPage.getTitle();
          loginPage.getCurrentURL();
          loginPage.getTextElement();
//        loginPage.getPageSourceURL();
//        loginPage.getTextElement();
//        loginPage.getAttributeElement();
//        loginPage.clearTextBox("bug mafia");
//        loginPage.clearFewCharacters("bug mafia");
//        loginPage.close();

    }
}
