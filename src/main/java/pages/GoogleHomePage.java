package pages;

import basepage.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import searchResults.EverythingResultsPage;


public class GoogleHomePage extends PageObject {
    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(name="q")
    WebElement element;

    public EverythingResultsPage searchText(String searchText) {

        element.click();
        element.sendKeys(searchText);
        element.submit();

        return new EverythingResultsPage(driver);
    }

}
