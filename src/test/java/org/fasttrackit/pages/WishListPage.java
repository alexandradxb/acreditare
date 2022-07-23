package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;

import java.util.List;

@DefaultUrl("http://testfasttrackit.info/selenium-test/wishlist/")
public class WishListPage extends PageObject {

    @FindBy(css = "#wishlist-table .btn-remove")
    private List<WebElementFacade> wishlistRemoveButtons;

    public void removeElectronicsFromWishlist() {
        for(WebElementFacade element : wishlistRemoveButtons){
            element.click();
            Assert.assertEquals(getAlert().getText(),"Are you sure you want to remove this product from your wishlist?");
            getAlert().accept();
            return;
        }

    }
}
