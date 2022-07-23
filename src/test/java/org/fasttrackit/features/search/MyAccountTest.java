package org.fasttrackit.features.search;

import org.fasttrackit.steps.serenity.AccountDashboardSteps;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class MyAccountTest extends BaseTest{

    @Test
    public void checkChangeNewsletterSubscription(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        accountDashboardSteps.changeNewsletterSubscription();
    }
}
