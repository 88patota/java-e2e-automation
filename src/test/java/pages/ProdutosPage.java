package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import elements.ProdutosElements;

public class ProdutosPage extends ProdutosElements {

	public ProdutosPage() {
		PageFactory.initElements(driver, this);
	}

	public void acessaProduto(String produto_um, String qtd_produto_um, String produto_dois, String qtd_produto_dois,
			String produto_tres, String qtd_produto_tres) {
		driver.navigate().to("https://automationexercise.com/product_details/4");
		txtQuantidade.clear();
		txtQuantidade.sendKeys(qtd_produto_um);
		btnAdicionaCarrinho.click();

		driver.navigate().to("https://automationexercise.com/product_details/41");
		txtQuantidade.clear();
		txtQuantidade.sendKeys(qtd_produto_dois);
		btnAdicionaCarrinho.click();

		driver.navigate().to("https://automationexercise.com/product_details/2");
		txtQuantidade.clear();
		txtQuantidade.sendKeys(qtd_produto_tres);
		btnAdicionaCarrinho.click();
	}

	public void acessaCarrinho() {
		driver.navigate().to("https://automationexercise.com/view_cart");
		btnCheckout.click();
	}
	
	public void forceTimeout(int timeout) {
		try {
			Thread.sleep(timeout);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void finalizaCompra() {

		String zoomJS;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		zoomJS = "document.body.style.zoom='0.5'";
		js.executeScript(zoomJS);
		forceTimeout(3000);
	
		btnPlaceOrder.click();

		txtNomeCartao.sendKeys("Test test");
		txtNumeroCartao.sendKeys("5200433270637424");
		txtCvv.sendKeys("830");
		txtValidadeMes.sendKeys("07");
		txtValidadeAno.sendKeys("2023");
		btnPagar.click();

		String msgPagamentoSucesso = msgSucesso.getText();

		assertEquals(msgPagamentoSucesso, "ORDER PLACED!");
	}
}
