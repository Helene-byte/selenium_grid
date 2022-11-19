package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//button[contains(@class, 'heart-icon')]")
    private List<WebElement> wishListIcon;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public void clickWishListOnFirstProduct() {
        wishListIcon.get(0).click();
    }

    public WebElement getWishListIcon() {
        return wishListIcon.get(0);
    }
}
