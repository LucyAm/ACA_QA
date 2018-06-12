package searchResults;

import basepage.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.WikiPage;


public class SearchResultsPage extends PageObject {

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public final static String searchPageMenuXPath = "//*[@id=\"hdtb-msb-vis\"]";
    @FindBy(xpath = searchPageMenuXPath)
    WebElement searchPageMenu;


    @FindBy(xpath = "//*[@id=\"hdtb-msb-vis\"]/div[2]/a")
    WebElement imagesLink;

    @FindBy(xpath=" //*[@id=\"hdtb-msb-vis\"]/div[1]")
    WebElement everythingLink;

    public ImageResultsPage navigateToImages() {
        imagesLink.click();
        return new ImageResultsPage(driver);

    }

    public EverythingResultsPage navigateToEverything() {
        everythingLink.click();
        return new EverythingResultsPage(driver);

    }

    @FindBy(xpath = "//div[@id='rso']//div[@class='rc'][1]/h3/a[1]")
    WebElement firstLink;

    public WikiPage navigateToWiki() {
        firstLink.click();
        return new WikiPage(driver);
    }

}

