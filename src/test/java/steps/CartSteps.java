package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CartPage;

public class CartSteps {
    @Entao("valido que produto foi adicionado ao carrinho com a cor selecionada")
    public void checkCart() throws Exception {
        new CartPage().checkCart();
    }

    @E("clico no carrinho de compras")
    public void clickCart(){
        new CartPage().clickCart();
    }

    @Quando("removo produto do carrinho de compras")
    public void removeProductCart(){
        new CartPage().removeProductCart();
    }

    @Entao("valido que o carrinho de compras está vazio")
    public void checkCartIsEmpty(){
        new CartPage().checkCartIsEmpty();
    }
}
