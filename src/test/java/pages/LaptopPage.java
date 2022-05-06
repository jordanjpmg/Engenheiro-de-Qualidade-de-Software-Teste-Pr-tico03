package pages;

import DAO.MysqlConected;
import atributes.CartAtributes;
import atributes.CartAtributes.*;
import atributes.LaptopAtributes;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.TestRule;

import java.util.Map;

public class LaptopPage extends LaptopAtributes {

    public static String selectedColor;
    public static double valueProduct;
    public LaptopPage(){
        PageFactory.initElements(TestRule.getDriver(), this);
    }

    public void checkProductSpecifications() throws Exception {
        waitElement(customization,10);
        MysqlConected mysqlConected = new MysqlConected();
        Map<String, String> results = mysqlConected.serchMassa();
        Assert.assertEquals(customization.getText(),results.get("CUSTOMIZATION") );
        Assert.assertEquals(display.getText(),results.get("DISPLAY") );
        Assert.assertEquals(displayResolution.getText(),results.get("DISPLAY_RESOLUTION") );
        Assert.assertEquals(displaySize.getText(),results.get("DISPLAY_SIZE") );
        Assert.assertEquals(memory.getText(),results.get("MEMORY") );
        Assert.assertEquals(operatingSystem.getText(),results.get("OPERATING_SYSTEM") );
        Assert.assertEquals(processor.getText(),results.get("PROCESSOR") );
        Assert.assertEquals(touchscreen.getText(),results.get("TOUCHSCREEN") );
        Assert.assertEquals(weight.getText(),results.get("WEIGHT") );
        scrollIntoViewJavaScript(articleProductSpecifications);
        log("Acessou Historico de Contatos");


    }

    public void clickAlterColor() {
        wait(3);
        colorBlack.click();
        selectedColor = colorBlack.getAttribute("title");
        log("Alterou cor");
    }

    public void clickAddToCart() {
        waitForElementToBeClickable(btnAddToCart,10);
        btnAddToCart.click();
        log("Clicou em botão Add to Cart");
    }

    public void changeExistingColor() throws Exception {
        MysqlConected mysqlConected = new MysqlConected();
        Map<String, String> results = mysqlConected.serchMassa();
        String colorProductDB = results.get("COLOR");
        for (WebElement color : listColors){
            if(!color.getAttribute("title").equals(colorProductDB)){
                color.click();
                selectedColor = color.getAttribute("title");
                log("Alterou cor "+colorProductDB+" para "+selectedColor);
                return;
            }
        }
    }

    public void changeAmount() {
        waitElement(btnChangeAmount, 20).click();
        valueProduct = Double.parseDouble(elementValueProduct.getText().split("\\$")[1]);
        log("Alterou quantidade");
    }

    public void accessCheckout() {
        waitForElementToBeClickable(btnCheckOut,10);
        btnCheckOut.click();
        log("Acessou checkout");
    }
}
