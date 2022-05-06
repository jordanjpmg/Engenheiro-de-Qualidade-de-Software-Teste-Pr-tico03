package atributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

import java.util.List;

public class LaptopAtributes extends BasePage {

    @FindBy(xpath = "//h2[text()='PRODUCT SPECIFICATIONS']/..")
    protected WebElement articleProductSpecifications;

    @FindBy(xpath = "//label[normalize-space()='CUSTOMIZATION']/../label[2]")
    protected WebElement customization;

    @FindBy(xpath = "//label[normalize-space()='DISPLAY']/../label[2]")
    protected WebElement display;

    @FindBy(xpath = "//label[normalize-space()='DISPLAY RESOLUTION']/../label[2]")
    protected WebElement displayResolution;

    @FindBy(xpath = "//label[normalize-space()='DISPLAY SIZE']/../label[2]")
    protected WebElement displaySize;

    @FindBy(xpath = "//label[normalize-space()='MEMORY']/../label[2]")
    protected WebElement memory;

    @FindBy(xpath = "//label[normalize-space()='OPERATING SYSTEM']/../label[2]")
    protected WebElement operatingSystem;

    @FindBy(xpath = "//label[normalize-space()='PROCESSOR']/../label[2]")
    protected WebElement processor;

    @FindBy(xpath = "//label[normalize-space()='TOUCHSCREEN']/../label[2]")
    protected WebElement touchscreen;

    @FindBy(xpath = "//label[normalize-space()='WEIGHT']/../label[2]")
    protected WebElement weight;

    @FindBy(xpath = "//div[@ng-show='firstImageToShow']//span[@title='BLACK']")
    public WebElement colorBlack;

    @FindBy(xpath = "//button[text()='ADD TO CART']")
    protected WebElement btnAddToCart;

    @FindBy(xpath = "//div[@ng-show='firstImageToShow']//span")
    protected List<WebElement> listColors;

    @FindBy(xpath = "//div[@class='plus']")
    protected WebElement btnChangeAmount;

    @FindBy(xpath = "//div[@id='Description']/h2")
    protected WebElement elementValueProduct;

    @FindBy(xpath = "//button[@id='checkOutPopUp']")
    public  WebElement btnCheckOut;

}
