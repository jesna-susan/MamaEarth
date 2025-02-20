package com.automation.pages.ui;

public interface CartPage {

    boolean isCartPageDisplayed();

    boolean isPriceSummaryDisplayed();

    void clickOnProceedToPay();

    void clickOnAddAddressButton();

    boolean isCartEmpty();

    void goToHomePage();
}
