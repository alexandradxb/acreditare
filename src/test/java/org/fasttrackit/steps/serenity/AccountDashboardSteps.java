package org.fasttrackit.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.AccountDashboardPage;
import org.fasttrackit.pages.CheckoutPage;

public class AccountDashboardSteps extends ScenarioSteps {

    private AccountDashboardPage accountDashboardPage;

    @Step
    public void navigateToAccountDashboard() {
        accountDashboardPage.open();
    }


    public void changeNewsletterSubscription() {
        navigateToAccountDashboard();
        accountDashboardPage.changeNewsletterSubscription();

    }
}
