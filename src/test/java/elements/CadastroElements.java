package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.CommonPage;

public class CadastroElements extends CommonPage {

	@FindBy(css = "[data-qa='signup-name']")
	protected WebElement txtNome;

	@FindBy(css = "[data-qa='signup-email']")
	protected WebElement txtEmail;

	@FindBy(css = "[data-qa='signup-button']")
	protected WebElement btnSignUp;

	@FindBy(id = "uniform-id_gender1")
	protected WebElement rdoMr;

	@FindBy(css = "[data-qa='password']")
	protected WebElement txtPassword;

	@FindBy(css = "[data-qa='days']")
	protected WebElement slcDia;

	@FindBy(css = "[data-qa='months']")
	protected WebElement slcMes;

	@FindBy(css = "[data-qa='years']")
	protected WebElement slcAno;

	@FindBy(css = "[data-qa='first_name']")
	protected WebElement txtPrimeiroNome;

	@FindBy(css = "[data-qa='last_name']")
	protected WebElement txtUltimoNome;

	@FindBy(css = "[data-qa='company']")
	protected WebElement txtEmpresa;

	@FindBy(css = "[data-qa='address']")
	protected WebElement txtEndereco;

	@FindBy(css = "[data-qa='country']")
	protected WebElement slcPais;

	@FindBy(css = "[data-qa='state']")
	protected WebElement txtEstado;

	@FindBy(css = "[data-qa='city']")
	protected WebElement txtCidade;

	@FindBy(css = "[data-qa='zipcode']")
	protected WebElement txtCEP;

	@FindBy(css = "[data-qa='mobile_number']")
	protected WebElement txtCelular;

	@FindBy(css = "[data-qa='create-account']")
	protected WebElement btnCriarConta;

	@FindBy(css = "[data-qa='account-created']")
	protected WebElement msgContaCriada;

	@FindBy(css = "[data-qa='login-email']")
	protected WebElement txtLogin;

	@FindBy(css = "[data-qa='login-password']")
	protected WebElement txtPasswordLogin;
	
	@FindBy(css = "[data-qa='login-button']")
	protected WebElement btnLogin;
}
