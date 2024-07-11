import base.BaseTest;
import lombok.extern.java.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.Cadastro;
import page.RelatorioDespesasPeriodo;

import static org.testng.AssertJUnit.assertEquals;

@Log
public class Teste extends BaseTest {

    @Test
    public void testeCamposCadastroCompleto() {
        Cadastro page = new Cadastro(getDriver());
        page.informarCadastro("Robson", "584059445", "willim@gmail.com", "123", "123");
        String resultadoFinal = page.getResultadoLogin();
        Assert.assertTrue(resultadoFinal.contains("Status: Usuário cadastrado com sucesso!"));
    }


    @Test
    public void testeCamposCadastroIncompleto() {
        Cadastro page = new Cadastro(getDriver());
        page.informarCadastroIncompleto("Robson", "123", "123");
        String resultadoFinal = page.getResultadoLogin();
        Assert.assertTrue(resultadoFinal.contains("Status: Todos os campos são obrigatórios!"));
    }

    @Test
    public void testeRelatorioData() {
        WebDriver driver = getDriver(); // Certifique-se de que este método está definido
        RelatorioDespesasPeriodo page = new RelatorioDespesasPeriodo(driver);
        page.preencherBusca("01012024", "01012025", "tipo");
    }


}
