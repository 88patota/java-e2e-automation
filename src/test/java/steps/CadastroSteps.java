package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import pages.CadastroPage;

public class CadastroSteps {

	@Dado("que o cliente esteja na tela de cadastro")
	public void que_o_cliente_esteja_na_tela_de_cadastro() {
		CadastroPage cP = new CadastroPage();
		cP.acessaPaginaCadastro();
	}

	@E("preencher o pre-cadastro")
	public void preencher_o_pre_cadastro() {
		CadastroPage cP = new CadastroPage();
		cP.preencheFormCadastroInicial();
	}

	@E("preencher informacoes da conta do cliente {string}, {string}, {string}, {string}")
	public void preencher_informacoes_da_conta_do_cliente(String senha, String dia, String mes, String ano) {
		CadastroPage cP = new CadastroPage();
		cP.preencheInformacoesConta(senha, dia, mes, ano);
	}

	@E("preencher informacoes do endereco {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
	public void preencher_informacoes_do_endereco(String empresa, String endereco, String pais, String estado,
			String cidade, String cep, String celular, String msg) {
		CadastroPage cP = new CadastroPage();
		cP.preencheInformacoesEndereco(empresa, endereco, pais, estado, cidade, cep, celular, msg);
	}

	@Dado("que o cliente realizou login {string} {string}")
	public void que_o_cliente_realizou_login(String login, String senha) {
		CadastroPage cP = new CadastroPage();
		cP.realizaLogin(login, senha);
	}

}
