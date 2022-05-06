package atributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.HomePage;
import utils.BasePage;

public class HomeAtributes extends BasePage {
    @FindBy(xpath = "//a[normalize-space()='SPECIAL OFFER']")
    protected WebElement btnSpecialOffer;

    @FindBy(xpath = "//button[@id='see_offer_btn']")
    protected WebElement btnSeeOffer;

    @FindBy(xpath = "//a[@title='SEARCH']//*[name()='svg']")
    protected WebElement btnSerach;

    @FindBy(xpath = "//input[@id='autoComplete']")
    protected WebElement inputSerach;

}
