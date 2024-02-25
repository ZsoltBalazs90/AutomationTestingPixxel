package pages;

import base.DriverConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    public void setBrowser(String browser)  {
        switch (browser.toLowerCase()) {
            case "chrome" -> driver = DriverConfiguration.driverInstanceChrome();
            case "firefox" -> driver = DriverConfiguration.driverInstanceFirefox();
            case "edge" -> driver = DriverConfiguration.driverInstanceEdge();
            default -> {
                try {
                    throw new Exception("Browser ul nu este ok");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

//    public void navigateToUrl() {
//        driver.get("https://www.youtube.com/@simplytechofficial/featured");
//    }

    public void navigateToUrl() {
        driver.get("https://www.saucedemo.com/");
    }

//    public void pressAcceptAllButton(String browser){
//        if(browser.equals("chrome") || browser.equals("edge")) {
//            WebElement acceptButton = driver.findElement(By.xpath("//span[contains(text(), 'Accept all')]"));
//            acceptButton.click();
////        driver.findElement(By.xpath("//span[contains(text(), 'Accept all')]")).click();
//        }else if(browser.equals("firefox")){
//            WebElement acceptButton = driver.findElement(By.xpath("//span[contains(text(), 'Acceptă tot')]"));
//            acceptButton.click();
//        }
//    }


    public void getTitle(){
        System.out.println(driver.getTitle());
    }

    public void getCurrentURL(){
        System.out.println(driver.getCurrentUrl());
    }
//
//    public void getPageSourceURL(){
//        System.out.println(driver.getPageSource());
//    }


//    public void addText(String text){
//        WebElement textBox = driver.findElement(By.xpath("//div[@id = 'search-input']//input"));
//        textBox.sendKeys(text);
//        WebElement clickSearch = driver.findElement(By.xpath("//button[@id = 'search-icon-legacy']"));
//        clickSearch.click();
//    }

        public void addText(String username, String password){
            WebElement textBox1 = driver.findElement(By.xpath("//input[@id='user-name']"));
            textBox1.sendKeys(username);
            WebElement textBox2 = driver.findElement(By.xpath("//input[@id='password']"));
            textBox2.sendKeys(password);

    }

        public void clickOnLogIn(){
            WebElement clickSearch = driver.findElement(By.xpath("//input[@id='login-button']"));
            clickSearch.click();

        }

        public void selectProduct(){
            WebElement addProduct= driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
            addProduct.click();
        }

        public void openShoppingCart(){
            WebElement shoppingCart= driver.findElement(By.xpath("//a[@ class= 'shopping_cart_link']"));
            shoppingCart.click();
        }

        public void getTextElement(){
            WebElement price= driver.findElement(By.xpath("//div[@class= 'inventory_item_price']"));
            System.out.println(" Pretul produsului selectat, folosind metoda getText(), este: "+ price.getText());
        }
//        primesc erroare la getAttribute("class")
//        public void getAttributeElement(){
//        String price= driver.findElements(By.xpath("//div[@class= 'inventory_item_price']")).getAttribute("class");
//            System.out.println(" Pretul produsului selectat, folosind metoda getAttribute(), este: "+ price);
//        }

        public void clickOnCheckout() {
            WebElement checkout= driver.findElement(By.xpath("//button[@id='checkout']"));
            checkout.click();
    }

    public void fillPersonalData(String firstName, String lastName, String zipCode) {
        WebElement textBox1= driver.findElement(By.xpath("//input[@ id= 'first-name']"));
        textBox1.sendKeys(firstName);
        WebElement textBox2= driver.findElement(By.xpath("//input[@ id= 'last-name']"));
        textBox2.sendKeys(lastName);
        WebElement textBox3= driver.findElement(By.xpath("//input[@ id= 'postal-code']"));
        textBox3.sendKeys(zipCode);

    }

        public void clickContinue() {
            WebElement clickcon= driver.findElement(By.xpath("//input[@ id= 'continue']"));
            clickcon.click();
        }

        public void clickFinish() {
            WebElement clickFinish= driver.findElement(By.xpath("//button[@id='finish']"));
            clickFinish.click();
        }


//    public void getTextElement(){
//        WebElement element = driver.findElement(By.xpath("//yt-formatted-string[@class = 'style-scope ytd-channel-name'][1]"));
//        System.out.println("preluare cu metoda getText(): " + element.getText());
//    }


//    public void getAttributeElement(){
//        String element =  driver.findElement(By.xpath("//div[@class = 'page-header-banner-image style-scope ytd-c4-tabbed-header-renderer']")).getAttribute("class");
//        System.out.println("s-a folosit metoda getAttribute(): "+ element);
//    }

//    protected void clear(WebElement locator, String typeOfRunning) {
//        click(locator);
//        if (typeOfRunning.equalsIgnoreCase("local")) {
//            if (getOperationSystem().contains("Windows")) {
//                System.out.println(getOperationSystem().toString());
//                locator.sendKeys(Keys.chord(Keys.CONTROL, "a"));
//            } else if (getOperationSystem().contains("Mac OS X")) {
//                locator.sendKeys(Keys.chord(Keys.COMMAND, "a"));
//            }
//        } else {
//            click(locator);
//            locator.clear();
//        }
//    }


//    public void clearFewCharacters(String text){
//        WebElement textBox = driver.findElement(By.xpath("//div[@id = 'search-input']//input"));
//        textBox.sendKeys(text.substring(0,3));
//        textBox.clear();
//        int i = text.length();
//        while(i>=5){
//            textBox.sendKeys(Keys.CONTROL + "a" + Keys.BACK_SPACE);
//            i--;
//        }
//    }


//    public void clearTextBox(String text){
//        driver.navigate().back();
//        WebElement textBox = driver.findElement(By.xpath("//div[@id = 'search-input']//input"));
//        textBox.sendKeys(text);
//        textBox.clear();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        textBox.sendKeys(text);
//
//    }


    public void close(){

        driver.quit();
    }


}
