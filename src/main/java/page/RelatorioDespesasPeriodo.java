package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class RelatorioDespesasPeriodo {

    @FindBy(id = "dataInicio")
    private WebElement dataInicio;

    @FindBy(id = "dataFim")
    private WebElement dataFim;

    @FindBy(name = "filtroDespesas")
    private List<WebElement> filtroDespesas;

    public RelatorioDespesasPeriodo(WebDriver driver) {
        // Inicializa os elementos localizados usando PageFactory
        PageFactory.initElements(driver, this);
    }

    public RelatorioDespesasPeriodo preencherBusca(String dataInicioText, String dataFimText,String checkBox) {
        dataInicio.sendKeys(dataInicioText);
        dataFim.sendKeys(dataFimText);

        // Seleciona o checkbox "Despesas por Tipo"
        for (WebElement checkbox : filtroDespesas) {
            if (checkbox.getAttribute("value").equals(checkBox)) {
                if (!checkbox.isSelected()) {
                    checkbox.click();
                }
                break;
            }
        }

        return this;
    }
}
