package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest2 {

    public String url;
    public WebDriver driver;

    @BeforeClass
    public void preCond() {
        url = "https://www.google.com.br/";
        driver = new EdgeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    protected WebDriver getDriver() {
        return driver;
    }
}
