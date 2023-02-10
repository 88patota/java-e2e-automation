#language: pt
#Author: erikpatekoski@gmail.com

Funcionalidade: Cadastra novo cliente

  Contexto:
    Dado que acesso o ecommerce

	@cadastro
Esquema do Cenario: Cadastrar cliente padrao
		Dado que o cliente esteja na tela de cadastro
		E preencher o pre-cadastro
		E preencher informacoes da conta do cliente "<senha>", "<dia>", "<mes>", "<ano>"
		E preencher informacoes do endereco "<empresa>", "<endereco>", "<pais>", "<estado>", "<cidade>", "<cep>", "<celular>", "<msg>"
		
		Exemplos:
		|senha	 |dia|mes|ano |empresa			|endereco	|pais	  |estado		 |cidade		|cep			|celular		|msg 						 |
		|10203040|01 |01 |1988|Empresa Teste|Rua Teste| India | São Paulo| São Paulo|07000-000|11900000000|ACCOUNT CREATED!|