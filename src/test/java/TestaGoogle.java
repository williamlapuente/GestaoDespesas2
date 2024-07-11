import base.BaseTest2;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.MonitoraGoogle;


public class TestaGoogle extends BaseTest2 {
    @Test
    public void EncontraInfo() {
        MonitoraGoogle page2 = new MonitoraGoogle(getDriver());
        page2.PreencherBusca("fadergs");
        //page2.clicarGoogle();
        String resultadoFinal = page2.buscarResultadoPesquisa();
        System.out.println(resultadoFinal);
        Assert.assertTrue(resultadoFinal.contains("Aproximadamente"));
    }
}
