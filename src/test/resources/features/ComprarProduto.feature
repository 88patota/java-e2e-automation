#language: pt
#Author: erikpatekoski@gmail.com

Funcionalidade: Realizar Compra

  Contexto:
    Dado que acesso o ecommerce

Esquema do Cenario: Realizar Compra com Sucesso
	Dado que o cliente realizou login "<login>" "<senha>"
	E que o cliente esteja com os produtos "<produto_um>", "<qtd_produto_um>", "<produto_dois>", "<qtd_produto_dois>", "<produto_tres>", "<qtd_produto_tres>" quantidade no carrinho
	Entao realizar pagamento com sucesso
	
	    
    
		Exemplos:
		|login				|senha		|produto_um		 |qtd_produto_um|produto_dois														  |qtd_produto_dois|produto_tres|qtd_produto_tres|
		|erik@test.com|10203040	|Stylish Dress |3							|Beautiful Peacock Blue Cotton Linen Saree|2   				     |Men Tshirt	|1							 |