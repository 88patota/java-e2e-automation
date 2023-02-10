package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

import elements.CadastroElements;

public class CadastroPage extends CadastroElements {

	public CadastroPage() {
		PageFactory.initElements(driver, this);
	}

	Faker faker = new Faker();

	public void acessaPaginaCadastro() {
		driver.navigate().to("https://automationexercise.com/login");
	}

	public void preencheFormCadastroInicial() {
		String nome = faker.name().firstName();

		txtNome.sendKeys(nome);
		txtEmail.sendKeys("teste_cliente" + faker.number().randomNumber() + "@test.com");
		btnSignUp.click();
	}

	public void preencheInformacoesConta(String senha, String dia, String mes, String ano) {
		rdoMr.click();
		txtPassword.sendKeys(senha);
		slcDia.sendKeys(dia);
		slcMes.sendKeys(mes);
		slcAno.sendKeys(ano);
	}

	public void preencheInformacoesEndereco(String empresa, String endereco, String pais, String estado, String cidade,
			String cep, String celular, String msg) {
		
		String nome = faker.name().firstName();
		String ultimoNome = faker.name().lastName();
		
		txtPrimeiroNome.sendKeys(nome);
		txtUltimoNome.sendKeys(ultimoNome);
		txtEmpresa.sendKeys(empresa);
		txtEndereco.sendKeys(endereco);
		Select select = new Select(slcPais);
		select.selectByValue(pais);
		txtEstado.sendKeys(estado);
		txtCidade.sendKeys(cidade);
		txtCEP.sendKeys(cep);
		txtCelular.sendKeys(celular);
		btnCriarConta.click();
		
		String msgSucesso = msgContaCriada.getText();
		
		assertEquals(msgSucesso, msg);
	}
	
	public void realizaLogin(String login, String senha) {
		driver.navigate().to("https://automationexercise.com/login");
		txtLogin.sendKeys(login);
		txtPasswordLogin.sendKeys(senha);
		btnLogin.click();
	}
	
}
