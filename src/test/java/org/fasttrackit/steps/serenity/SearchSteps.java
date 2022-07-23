package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.SearchResultsPage;
import org.junit.Assert;

public class SearchSteps extends ScenarioSteps {

    private HomePage homePage;
    private CartPage cartPage;
    private SearchResultsPage searchResultsPage;

    @Step
    public void doSearch(String keyword){
        homePage.setSearchField(keyword);
        homePage.clickSearchIcon();
    }
    @Step
    public void verifyProductInResults(String productName){
        Assert.assertTrue(searchResultsPage.checkListForProduct(productName));
    }

    @Step
    public void checkCartItems(String productName){
        homePage.clickCartIcon();
        homePage.clickCartItemsLink();
        cartPage.verifyProductInCart(productName);
    }

    public void verifyNewProducts(String productName) {
        Assert.assertTrue(searchResultsPage.checkNewProducts(productName));
    }

    public void verifyNewProductsPrice(String productPrice) {
        Assert.assertTrue(searchResultsPage.verifyNewProductsPrice(productPrice));
    }
}
