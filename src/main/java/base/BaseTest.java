package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    public String url;
    public WebDriver driver;

    @BeforeClass
    public void preCond() {
        url = System.getProperty("user.dir") + "\\src\\main\\resources\\Cadastro.html";
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    protected WebDriver getDriver() {
        return driver;
    }

}
