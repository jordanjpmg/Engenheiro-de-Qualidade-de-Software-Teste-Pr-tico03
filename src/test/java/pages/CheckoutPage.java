package pages;

import DAO.MysqlConected;
import atributes.CheckoutAtributes;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import utils.TestRule;

import java.util.Map;

public class CheckoutPage extends CheckoutAtributes {
    public CheckoutPage(){
        PageFactory.initElements(TestRule.getDriver(), this);
    }

    public void checkValueProduct() {
        waitElement(qtdProduct, 20);
        int qtd = Integer.parseInt(qtdProduct.getText().split(":")[1].split(" ")[1]);
        String total = String.valueOf(LaptopPage.valueProduct * qtd);
        Assert.assertEquals(totalProduct.getText().split("\\$")[1],total);
        log("Validou preço");
    }

    public void updateColorDB() throws Exception {
        String color = colorProduct.getText();
        MysqlConected mysqlConected = new MysqlConected();
        mysqlConected.updateColorMassa(color);
        wait(2);
        Map<String, String> results =mysqlConected.serchMassa();
        Assert.assertEquals(color,results.get("COLOR"));
        log("Atualido cor do produto para "+color+" no banco de dados");
    }
}
