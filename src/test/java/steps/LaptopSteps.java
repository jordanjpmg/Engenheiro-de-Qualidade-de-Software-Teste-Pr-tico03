package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.LaptopPage;

public class LaptopSteps {

    @Entao("valido que as especificações do produto de acordo com as informações retornadas do banco de automação")
    public void checkProductSpecifications() throws Exception {
        new LaptopPage().checkProductSpecifications();
    }

    @E("altero a cor do produto de acordo com a cor informada no banco de automação")
    public void clickAlterColor() throws Exception {
        new LaptopPage().selectColor();
    }

    @Quando("clico no botão “Add to cart”")
    public void clickAddToCart(){
        new LaptopPage().clickAddToCart();
    }

    @E("altero a cor do produto para uma diferente da existente no banco de automação")
    public void changeExistingColor() throws Exception {
        new LaptopPage().changeExistingColor();
    }

    @E("altero a quantidade de produtos que deseja comprar")
    public void changeAmount(){
        new LaptopPage().changeAmount();
    }

    @E("acesso a página de checkout")
    public void accessCheckout(){
        new LaptopPage().accessCheckout();
    }
}
