package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import java.util.List;
@DefaultUrl("http://testfasttrackit.info/selenium-test/home-decor/electronics.html")
public class ElectronicsPage extends PageObject {


    @FindBy(css = ".link-wishlist")
    private List<WebElementFacade> wishlistButtons;

    @FindBy(css = "li.success-msg")
    private WebElementFacade successWhishlistMessage;

    public void addElectronicsToWishlist() {
        WebElementFacade firstElectronic =  wishlistButtons.get(0);
        firstElectronic.click();
        successWhishlistMessage.shouldContainText("has been added to your wishlist.");
    }
}
