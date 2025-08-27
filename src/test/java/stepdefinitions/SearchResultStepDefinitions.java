package stepdefinitions;

import core.BaseTest;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import page.HospitalDetailPage;
import page.SearchResultPage;

public class SearchResultStepDefinitions {
    private SearchResultPage searchResultPage;

    public SearchResultStepDefinitions() {
        searchResultPage = new SearchResultPage(BaseTest.getDriver(), BaseTest.getAction());
    }
    @Then("User should redirect to search result page with search keyword {string} and tab {string}")
    public void userShouldRedirectToSearchResultPageWithSearchKeywordAndTab(String searchKey, String tab) {
        Assert.assertEquals(searchKey.trim(), searchResultPage.getSearchKey().trim());
        Assert.assertTrue(searchResultPage.getSearchTabText().contains(tab.trim()));
    }
}
