package firstTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.GoogleHomePage;
import pages.WikiPage;
import searchResults.EverythingResultsPage;
import searchResults.ImageResultsPage;
import searchResults.SearchResultsPage;
import util.FunctionalTestBase;


public class FirstTest extends FunctionalTestBase {
    @Test
    public void test1() throws InterruptedException {
        final String searchText="dog";
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);

        SearchResultsPage resultsPage = googleHomePage.searchText(searchText);
        Assert.assertTrue(resultsPage.isElementPresent(EverythingResultsPage.searchPageMenuXPath));

        ImageResultsPage imageResults = resultsPage.navigateToImages();
        Assert.assertTrue(imageResults.isElementPresent(ImageResultsPage.imageResultsXPath));

        resultsPage = imageResults.navigateToEverything();

        WikiPage wikiPage = resultsPage.navigateToWiki();
        Assert.assertTrue(wikiPage.isElementPresent(WikiPage.wikiLogoXpath));

        System.out.println("Page title is: " + driver.getTitle());

        Thread.sleep(3000);


        System.out.println("Page title is: " + driver.getTitle());

    }

    public static void main(String[] args) {

    }

}
