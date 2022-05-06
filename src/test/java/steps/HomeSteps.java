package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.HomePage;
import utils.TestRule;

public class HomeSteps {

    @Dado("que acesso o sistema no ambiente de {string} com o browser {string}")
    public void startAdvantageonlineshopping(String url, String browser){
        TestRule.openApplication(browser, url);
    }

    @E("no menu, clicar na opção “Special Offer”")
    public void clickMenuSpecialOffer(){
        new HomePage().clickMenuSpecialOffer();
    }

    @Quando("clico no botão “See offer”")
    public void clickBtnSeeOffer(){
        new HomePage().clickBtnSeeOffer();
    }

    @E("pesquiso o produto clicando no ícone de lupa Seguir o nome do produto do banco de automação")
    public void seachProduct() throws Exception {
        new HomePage().seachProduct();
    }

    @E("seleciono o produto pesquisado")
    public void selectProduct(){
        new HomePage().selectProduct();
    }


}
