package atributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class CheckoutAtributes extends BasePage {

    @FindBy(xpath = "//div[@id='userCart']//label[contains(text(),'QTY')]")
    protected WebElement qtdProduct;

    @FindBy(xpath = "//label[contains(text(),'TOTAL')]/span")
    protected WebElement totalProduct;

    @FindBy(xpath = "//div[@id='userCart']//label[contains(text(),'Color')]/span")
    protected WebElement colorProduct;

}
