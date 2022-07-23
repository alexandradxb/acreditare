package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.ProductPage;
import org.fasttrackit.utils.Constants;
import org.junit.Assert;

public class CheckoutSteps extends ScenarioSteps {

    private CheckoutPage checkoutPage;

    @Step
    public void navigateToCheckoutPage() {
        checkoutPage.open();
    }

    @Step
    public void checkFirstNameFromBillingInfo(String firstName) {
        checkoutPage.checkFirstNameFromBillingInfo(firstName);
    }

    public void checkLastNameFromBillingInfo(String lastName) {
        checkoutPage.checkLastNameFromBillingInfo(lastName);
    }
}
