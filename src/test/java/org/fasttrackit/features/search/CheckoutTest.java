package org.fasttrackit.features.search;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkFirstNameForBillingInformation() {
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        checkoutSteps.navigateToCheckoutPage();
        checkoutSteps.checkFirstNameFromBillingInfo("any");
    }

    @Test
    public void checkLastNameForBillingInformation() {
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        checkoutSteps.navigateToCheckoutPage();
        checkoutSteps.checkLastNameFromBillingInfo("codreanu");
    }
}
