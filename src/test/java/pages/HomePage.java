package pages;

import DAO.MysqlConected;
import atributes.HomeAtributes;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.TestRule;

import java.util.Map;

public class HomePage extends HomeAtributes {

    public static String nameProduct;

    public HomePage(){
        PageFactory.initElements(TestRule.getDriver(), this);
    }

    public void clickMenuSpecialOffer() {
        wait(3);
        btnSpecialOffer.click();
        wait(1);
        log("Clicou no menu Special Offer");
    }

    public void clickBtnSeeOffer() {
        waitElement(btnSeeOffer, 10);
        btnSeeOffer.click();
        log("Clicou botão See Offer");
    }

    public void seachProduct() throws Exception {
        waitElement(btnSerach, 10).click();
        MysqlConected mysqlConected = new MysqlConected();
        Map<String, String> results = mysqlConected.serchMassa();
        nameProduct = results.get("NAME_PRODUCT");
        inputSerach.sendKeys(nameProduct);
        log("Pesquisou produto");
    }

    public void selectProduct() {
        wait(3);
        waitElement(By.xpath("//p[text()='"+ nameProduct +"']"),20).click();
        wait(1);
        log("Clicou produto pesquisado");
    }
}
