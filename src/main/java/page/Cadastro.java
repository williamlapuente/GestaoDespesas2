package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Cadastro extends BasePage {
    @FindBy(id = "nomeUsuario")
    private WebElement txnomeUsuario;
    @FindBy(id = "emailUsuario")
    private WebElement txemailUsuario;
    @FindBy(id = "loginUsuario")
    private WebElement txloginUsuario;
    @FindBy(id = "senhaUsuario")
    private WebElement txsenhaUsuario;
    @FindBy(id = "resultadoCadastro")
    private WebElement txresultadoCadastro;
    @FindBy(id= "elementosForm:cadastrar")
    private  WebElement btnCadastrar;
    @FindBy(id= "cpf")
    private  WebElement txcpf;
    public Cadastro informarCadastro(String nome, String cpf, String email, String login, String senha){
        txnomeUsuario.sendKeys(nome);
        txcpf.sendKeys(cpf);
        txemailUsuario.sendKeys(email);
        txloginUsuario.sendKeys(login);
        txsenhaUsuario.sendKeys(senha);
        btnCadastrar.click();
        return this;
    }
    public Cadastro informarCadastroIncompleto(String nome, String email, String cpf, String login, String senha) {
        if (nome != null) {
            txnomeUsuario.sendKeys(nome);
        }
        if (email != null) {
            txemailUsuario.sendKeys(email);
        }
        if (login != null) {
            txloginUsuario.sendKeys(login);
        }
        if (senha != null) {
            txsenhaUsuario.sendKeys(senha);
        }
        if (cpf != null) {
            txcpf.sendKeys(cpf); // Corrigido para enviar o CPF
        }
        btnCadastrar.click();
        return this;
    }

    // Sobrecargas do método para diferentes combinações de argumentos
    public Cadastro informarCadastroIncompleto() {
        return informarCadastroIncompleto(null, null, null, null, null);
    }

    public Cadastro informarCadastroIncompleto(String nome) {
        return informarCadastroIncompleto(nome, null, null, null, null);
    }

    public Cadastro informarCadastroIncompleto(String nome, String email) {
        return informarCadastroIncompleto(nome, email, null, null, null);
    }

    public Cadastro informarCadastroIncompleto(String nome, String email, String login) {
        return informarCadastroIncompleto(nome, email, login, null, null);
    }



    public String getResultadoLogin() {
        return txresultadoCadastro.getText();
    }

    /*public Cadastro informarEstoqueMinimo(String estoqueMin){
        txEstoqueMinimo.sendKeys(estoqueMin);
        return this;
    }
    public Cadastro informarEstoqueMaximo(String estoqueMax){
        txEstoqueMaximo.sendKeys(estoqueMax);
        return this;
    }

    public Cadastro selecionarCategoria(String categoria) {
        Select dropdown = new Select(selCategoriaProduto);
        dropdown.selectByVisibleText(categoria);
        return this;
    }

    public Cadastro selecionarCanalVenda (String canal1, String canal2, String canal3){
        Select dropdown = new Select(selCanalVenda);
        dropdown.selectByVisibleText(canal1);
        dropdown.selectByVisibleText(canal2);
        dropdown.selectByVisibleText(canal3);
        return this;
    }

    public void acessarPagina() {
        driver.get("https://www.google.com.br/");
    }


*/

//    public String buscarLabelResultado() {
//        final WebElement[] labelResultado = {null}; // Declara a variável fora do bloco de espera
//
//        Awaitility.await().atMost(25, TimeUnit.SECONDS).until(() -> {
//            labelResultado[0] = driver.findElement(By.xpath("/html/body/div/div/span")); // Atribui o valor dentro da função lambda
//            return labelResultado[0].isDisplayed();
//        });
//
//        return labelResultado[0].getText(); // Retorna o valor da variável
//    }

    /*public String buscarResultadoCadastro() {
        return driver.getPageSource();
    }*/




    public Cadastro(WebDriver driver) {
        super(driver);
    }

}

