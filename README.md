# Teste Automação Web - Selenium, Java & Cucumber

Foi criado uma estrutura baseada em Page Objects para realização dos testes.
Foi pedido no mínimo 1 cenário de cada etapa do teste e optei por criar cenários de "caminho feliz".

## Arquitetura Projeto

```
├── README.md
├── pom.xml
└── src
    ├── main
    │   └── java
    └── test
        ├── java
        │   ├── elements
        │   │   ├── CadastroElements.java
        │   │   └── ProdutosElements.java
        │   ├── pages
        │   │   ├── CadastroPage.java
        │   │   ├── CommonPage.java
        │   │   └── ProdutosPage.java
        │   ├── steps
        │   │   ├── CadastroSteps.java
        │   │   ├── CommonSteps.java
        │   │   └── ProdutosSteps.java
        │   ├── tests
        │   │   └── RunTest.java
        │   └── util
        │       ├── TestBase.java
        │       └── Utils.java
        └── resources
            ├── cucumber.properties
            ├── drivers
            │   └── chromedriver
            ├── features
            │   ├── Cadastro.feature
            │   └── ComprarProduto.feature
            └── junit-plataform.properties
``` 

## Clone Repo
Realizar o clone/fork do projeto

`git clone git@github.com:88patota/java-e2e-automation.git`

### Instalação via IDE Eclipse
Importar projeto e selecionar `Existing Maven Project` e automaticamente ele irá baixar as dependências que estão no arquivo: `pom.xml`.

## Execução dos testes
### Execução de todos os cenários
Para executar todos os cenários de teste, basta clicar com o botão direito sobre o arquivo `RunTest.java` e em seguida `Run as -> Junit Test`

### Execução manual por cenário
Para executar qualquer teste do projeto, basta clicar com o botão direito sobre qualquer arquivo da pasta `resources/features` e em seguida `Run As -> Cucumber Feature`
