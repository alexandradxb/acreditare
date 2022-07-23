package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;

@DefaultUrl("http://testfasttrackit.info/selenium-test/checkout/onepage/")
public class CheckoutPage extends PageObject {

    @FindBy(css = "[title='First Name']")
    private WebElementFacade firstNameField;

    @FindBy(css = "[title='Last Name']")
    private WebElementFacade lastNameField;

    public void checkFirstNameFromBillingInfo(String firstName) {
        Assert.assertTrue(firstNameField.getAttribute("value").equals(firstName));
    }
    public void checkLastNameFromBillingInfo(String lastName) {
        Assert.assertTrue(lastNameField.getAttribute("value").equals(lastName));
    }

}
