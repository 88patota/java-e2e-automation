package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pages.ProdutosPage;

public class ProdutosSteps {

	@Dado("que o cliente esteja com os produtos {string}, {string}, {string}, {string}, {string}, {string} quantidade no carrinho")
	public void que_o_cliente_esteja_com_os_produtos_quantidade_no_carrinho(String produto_um, String qtd_produto_um,
			String produto_dois, String qtd_produto_dois, String produto_tres, String qtd_produto_tres) {
		ProdutosPage pP = new ProdutosPage();
		pP.acessaProduto(produto_um, qtd_produto_um, produto_dois, qtd_produto_dois, produto_tres, qtd_produto_tres);
		pP.acessaCarrinho();
	}

	@Entao("realizar pagamento com sucesso")
	public void realizar_pagamento_com_sucesso() {
		ProdutosPage pP = new ProdutosPage();
		pP.finalizaCompra();
	}
}
