package pages;

import DAO.MysqlConected;
import atributes.CartAtributes;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import utils.TestRule;

import java.util.Map;

public class CartPage extends CartAtributes {
    public CartPage(){
        PageFactory.initElements(TestRule.getDriver(), this);
    }

    public void checkCart() throws Exception {
        waitForElementToBeClickable(btnCart, 10);
        btnCart.click();
        waitElement(colorProduct,10);
        MysqlConected mysqlConected = new MysqlConected();
        Map<String, String> results = mysqlConected.serchMassa();
        Assert.assertEquals(colorProduct.getAttribute("title"),LaptopPage.selectedColor);
        Assert.assertEquals(nameProduct.getText(),results.get("NAME_PRODUCT") );
        log("Validou produto no carrinho");
    }

    public void clickCart() {
        waitForElementToBeClickable(btnCart, 10);
        btnCart.click();
        log("Clico no Cart");
    }

    public void removeProductCart() {
        waitForElementToBeClickable(btnRemoveProduct,10);
        btnRemoveProduct.click();
        log("Removo produtos do carrinho");
    }

    public void checkCartIsEmpty() {
        waitElement(msgCartIsEmpty,10);
        Assert.assertEquals("Your shopping cart is empty", msgCartIsEmpty.getText());
        log("Valido carrinho vazio");
    }
}
