package steps;


import io.cucumber.java.pt.Dado;
import util.TestBase;

public class CommonSteps {

    @Dado("que acesso o ecommerce")
    public void acessarEcommerce(){
        String url = "https://automationexercise.com/";
        TestBase.abrirNavegador(url);
    }
}
