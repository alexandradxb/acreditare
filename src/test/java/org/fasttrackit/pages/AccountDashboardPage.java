package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;

@DefaultUrl("http://testfasttrackit.info/selenium-test/customer/account/")
public class AccountDashboardPage extends PageObject {

    @FindBy(css = ".box-info .col-2 .box-title a")
    private WebElementFacade editNewsletterButton;

    @FindBy(css = "#subscription")
    private WebElementFacade subscriptionCheckbox;

    @FindBy(css = ".buttons-set .button")
    private WebElementFacade subscriptionSaveButton;

    @FindBy(css = ".success-msg")
    private WebElementFacade successMessage;


    public void changeNewsletterSubscription() {
        editNewsletterButton.getText();
        editNewsletterButton.click();
        subscriptionCheckbox.getText();

        String wasChecked = subscriptionCheckbox.getAttribute("checked");

        subscriptionCheckbox.click();
        subscriptionSaveButton.click();

        if("true".equals(wasChecked)){
            Assert.assertTrue(successMessage.getText().equalsIgnoreCase("The subscription has been removed."));
        }else{
            Assert.assertTrue(successMessage.getText().equalsIgnoreCase("The subscription has been saved."));
        }
    }


}
