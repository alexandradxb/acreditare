package org.fasttrackit.features.search;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class SearchTest extends BaseTest{

    private String searchItem = "necklace";

    @Test
    public void searchProductTest(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        searchSteps.doSearch(searchItem);
        searchSteps.verifyProductInResults("SILVER DESERT NECKLACE");
    }

    @Test
    public void searchAnotherProductTest(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        searchSteps.doSearch(searchItem);
        searchSteps.verifyProductInResults("SILVER DESERT NECKLACE");
    }

    @Test
    public void checkNewProducts(){
        loginSteps.navigateToHomepage();
        searchSteps.verifyNewProducts("Linen Blazer");
    }

    @Test
    public void checkNewProductsPrice(){
        loginSteps.navigateToHomepage();
        searchSteps.verifyNewProductsPrice("210,00 RON");
    }
}
