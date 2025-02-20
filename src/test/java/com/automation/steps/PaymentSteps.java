package com.automation.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;

public class PaymentSteps extends BaseSteps{
    @Then("verify user is on payment page")
    public void verifyUserIsOnPaymentPage() {
        Assert.assertTrue(paymentPage.isPaymentPageDisplayed());
    }
}
