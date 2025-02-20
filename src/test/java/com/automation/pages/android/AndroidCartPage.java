package com.automation.pages.android;

import com.automation.pages.common.BasePage;
import com.automation.pages.ui.CartPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AndroidCartPage extends BasePage implements CartPage {
    @FindBy(xpath="//android.widget.TextView[@text='View cart']/..")
    WebElement viewCartTab;

    public boolean isCartPageDisplayed(){
        return false;
    }

    public boolean isPriceSummaryDisplayed(){
        return false;
    }

    public void clickOnProceedToPay(){

    }

    public void clickOnAddAddressButton() {

    }

    public boolean isCartEmpty() {
        return !isDisplayed(viewCartTab);
    }

    public void goToHomePage(){

    }


}
