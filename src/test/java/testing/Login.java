package testing;
import pages.LoginPage;

public class Login {

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        loginPage.setBrowser("firefox");
        loginPage.navigateToUrl();
        loginPage.addText("standard_user","secret_sauce");
        loginPage.clickOnLogIn();
        loginPage.selectProduct();
        loginPage.openShoppingCart();
        loginPage.getTitle();
        loginPage.getCurrentURL();
        loginPage.getTextElement();
        loginPage.clickOnCheckout();
        loginPage.fillPersonalData("ThisIsMyFirstName", "ThisIsMyLastName", "400400");
        loginPage.clickContinue();
        loginPage.clickFinish();
        loginPage.close();

    }
}
