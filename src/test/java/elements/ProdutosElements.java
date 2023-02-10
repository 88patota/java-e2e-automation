package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.CommonPage;

public class ProdutosElements extends CommonPage {

	@FindBy(css = "#quantity")
	protected WebElement txtQuantidade;

	@FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")
	protected WebElement btnAdicionaCarrinho;

	@FindBy(xpath = "//*[@id=\"do_action\"]/div[1]/div/div/a")
	protected WebElement btnCheckout;
	
	@FindBy(xpath = "//*[@href='/payment' and text()='Place Order']")
	protected WebElement btnPlaceOrder;
	
	@FindBy(css = "[data-qa='name-on-card']")
	protected WebElement txtNomeCartao;
	
	@FindBy(css = "[data-qa='card-number']")
	protected WebElement txtNumeroCartao;
	
	@FindBy(css = "[data-qa='cvc']")
	protected WebElement txtCvv;
	
	@FindBy(css = "[data-qa='expiry-month']")
	protected WebElement txtValidadeMes;
	
	@FindBy(css = "[data-qa='expiry-year']")
	protected WebElement txtValidadeAno;
	
	@FindBy(css = "[data-qa='pay-button']")
	protected WebElement btnPagar;
	
	@FindBy(css = "[data-qa='order-placed']")
	protected WebElement msgSucesso;
	
	@FindBy(id = "id='cart_items'")
	protected WebElement html;
}
