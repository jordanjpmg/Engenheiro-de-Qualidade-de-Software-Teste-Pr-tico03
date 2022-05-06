package atributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class CartAtributes extends BasePage {

    @FindBy(xpath = "//a[@id='shoppingCartLink']//*[@id='menuCart']")
    protected WebElement btnCart;

    @FindBy(xpath = "//label[contains(text(),COLOR)]/..//span[@title]")
    protected WebElement colorProduct;

    @FindBy(xpath = "//label[contains(@class,'productName')]")
    protected WebElement nameProduct;

    @FindBy(xpath = "//a[@class='remove red ng-scope']")
    protected WebElement btnRemoveProduct;

    @FindBy(xpath = "//label[@class='roboto-bold ng-scope' and text()='Your shopping cart is empty']")
    protected WebElement msgCartIsEmpty;

}
