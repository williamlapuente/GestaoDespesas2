package page;

import base.BasePage;
import org.awaitility.Awaitility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MonitoraGoogle extends BasePage {
    @FindBy(id = "APjFqb")
    private WebElement txBuscar;

    @FindBy(name = "btnK")
    private WebElement btBuscar;

    public MonitoraGoogle PreencherBusca(String nome){
        txBuscar.sendKeys(nome);
        txBuscar.sendKeys(Keys.ENTER);
        return this;
    }

    public MonitoraGoogle clicarBuscar(){
        btBuscar.click();
        return this;
    }

    public String clicarGoogle() {
        driver.findElement(By.linkText("Google")).click();
        return driver.getCurrentUrl();
    }

    public String clicarGzh() {
        driver.findElement(By.linkText("GZH")).click();
        return driver.getTitle();
    }

    public String buscarResultadoPesquisa() {
        return driver.getPageSource();
    }

    public MonitoraGoogle(WebDriver driver) {
        super(driver);
    }
}
