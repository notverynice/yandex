package by.local.yandex;

import by.local.yandex.site.YandexSite;
import io.qameta.atlas.core.Atlas;
import io.qameta.atlas.webdriver.WebDriverConfiguration;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class YandexMail {

    private Atlas atlas;
    private WebDriver driver;

    @BeforeTest
    public void startDriver() {
        String driverPath = System.getProperty("user.dir") + "\\src\\main\\resources\\webdrivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        atlas = new Atlas(new WebDriverConfiguration(driver, "https://yandex.by"));
    }

    private void login() throws InterruptedException {
        //begin вот такой код перегружал страницу 3 раза
        /*onSite().onLoginPage();
        onSite().onLoginPage();
        onSite().onLoginPage();*/
        //end
        onSite().onLoginPage().open("https://passport.yandex.by");
        onSite().onLoginPage().loginForm().input("login").sendKeys("ltd-107");
        onSite().onLoginPage().loginForm().submit();
        onSite().onLoginPage().loginForm().input("passwd").sendKeys("gbplTW107");
        onSite().onLoginPage().loginForm().submit();
        Thread.sleep(3000);
    }

    private void sendNewMail() {
        onSite().onMailPage().open();
        onSite().onMailPage().leftSideBar().writeNewMailButton().click();
        onSite().onMailPage().mail().to().sendKeys("LTD-107@yandex.ru");
        onSite().onMailPage().mail().subject().sendKeys("test subject");
        onSite().onMailPage().mail().message().sendKeys("test message");
        onSite().onMailPage().mail().send().click();
    }

    @Test
    public void firstTest() throws InterruptedException {
        login();
        sendNewMail();
    }

    private YandexSite onSite() {
        return atlas.create(driver, YandexSite.class);
    }

    @AfterTest
    public void stopDriver() {
        driver.quit();
    }
}
