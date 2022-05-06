package steps;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CheckoutPage;

public class CheckoutSteps {

    @Quando("valido que a soma dos preços corresponde ao total apresentado na página de checkout")
    public void checkValueProduct(){
        new CheckoutPage().checkValueProduct();
    }

    @Entao("realizo um update no banco de automação alterar a cor existente no banco para a cor selecionada no teste.")
    public void updateColorDB() throws Exception {
        new CheckoutPage().updateColorDB();
    }
}
