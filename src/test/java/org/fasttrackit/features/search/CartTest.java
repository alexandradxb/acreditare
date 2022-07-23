package org.fasttrackit.features.search;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Test
    public void addProductToCart() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.doSearch("necklace");
        productSteps.selectProductFromList("Silver Desert Necklace");
        cartSteps.clickAddToCart();
        cartSteps.verifySuccessMessage("Silver Desert Necklace");
    }

    @Test
    public void verifyPricesTest() {
        searchSteps.doSearch("necklace");
        productSteps.selectProductFromList("Silver Desert Necklace");
        cartSteps.clickAddToCart();
        cartSteps.verifySuccessMessage("Silver Desert Necklace");

        searchSteps.doSearch("necklace");
        productSteps.selectProductFromList("Silver Desert Necklace");
        cartSteps.clickAddToCart();
        cartSteps.verifySuccessMessage("Silver Desert Necklace");

//        navigare la cos

        cartSteps.checkCartSubtotalIsCorrect();
        cartSteps.checkCartGrandTotalIsCorrect();
    }

    @Test
    public void searchForUnexistingProduct() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.doSearch("earings");
        cartSteps.verifyNoResultMessage();
    }

    @Test
    public void checkCartItems(){
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        searchSteps.checkCartItems("Silver Desert Necklace");
    }

    @Test
    public void addItemToWishlist(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        productSteps.addElectronicsToWishlist();
    }

    @Test
    public void removeItemFromWishlist(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        productSteps.removeElectronicsFromWishlist();
    }
}
