package com.automation.pages.web;

import com.automation.pages.common.BasePage;
import com.automation.pages.ui.PaymentPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebPaymentPage extends BasePage implements PaymentPage {

    @FindBy(id = "payment-heading")
    WebElement paymentPageHeading;

    public boolean isPaymentPageDisplayed(){
        return isDisplayed(paymentPageHeading);
    }


}
