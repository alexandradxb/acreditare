package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.ElectronicsPage;
import org.fasttrackit.pages.SearchResultsPage;
import org.fasttrackit.pages.WishListPage;

public class ProductSteps extends ScenarioSteps {

    private SearchResultsPage searchResultsPage;

    private ElectronicsPage electronicsPage;

    private WishListPage wishListPage;

    @Step
    public void selectProductFromList(String product){
        searchResultsPage.selectProductFromList(product);
    }

    @Step
    public void addElectronicsToWishlist() {
        electronicsPage.open();
        electronicsPage.addElectronicsToWishlist();
    }

    public void removeElectronicsFromWishlist() {
        wishListPage.open();
        wishListPage.removeElectronicsFromWishlist();
    }
}
