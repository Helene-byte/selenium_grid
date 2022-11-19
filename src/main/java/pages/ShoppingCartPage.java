package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {


    @FindBy(xpath = "//h1[@class='checkout-header__heading']")
    private WebElement shoppingCartTitle;

    @FindBy(xpath = "//button[@class='checkout-order-summary__continue-btn']")
    private WebElement checkoutButton;

    @FindBy(xpath = "//div[contains(@class, 'shopping-cart-item--shopping-cart-your-order')]|//section[@data-code or @data-product-code]")
    private WebElement shoppingCartItem;

    @FindBy(xpath = "//span[@class='popup-component__title']/*[not(contains(text(),'INSTALLATION TERMS'))]/ancestor::div[@class='popup-component__container']")
    private WebElement storePopup;

    @FindBy(xpath = "//a[contains(@class, 'cta-text-button left')]")
    private WebElement yesContinueButton;

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getShoppingCartTitle() {
        return shoppingCartTitle;
    }

    public boolean isShoppingCartTitleVisible() {
        return shoppingCartTitle.isDisplayed();
    }

    public void clickCheckoutButton() {
        checkoutButton.click();
    }

    public WebElement getShoppingCartItem() {
        return shoppingCartItem;
    }

    public WebElement getStorePopup() {
        return storePopup;
    }

    public void confirmStorePickupLocationIfItAppears() {
        boolean isPopupAppear = storePopup.isDisplayed();
        if (isPopupAppear) {
            yesContinueButton.click();
        }
    }

}
