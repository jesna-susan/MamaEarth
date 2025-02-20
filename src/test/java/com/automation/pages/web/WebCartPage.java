package com.automation.pages.web;

import com.automation.pages.common.BasePage;
import com.automation.pages.ui.CartPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebCartPage extends BasePage implements CartPage {

    @FindBy(xpath = "//div[@class=\"details-title\"]")
    WebElement cartPageTitle;

    @FindBy(xpath = "//div[@class='summary-items__container']")
    WebElement priceSummary ;

    @FindBy(xpath = "//div[text()='Proceed to pay']")
    WebElement proceedToPayBtn ;

    @FindBy(xpath = "//div[text()='Add address']")
    WebElement addAddressBtn;

    @FindBy(xpath = "//div[text()='Add address'  and @class='proceed-text']")
    WebElement addAddressPageTitle;

    @FindBy(xpath="//div[text()='Your cart is empty !']")
    WebElement cartEmptyMessage;

    @FindBy(xpath="//button[text()='SHOP NOW']")
        WebElement shopNowButton ;



    public boolean isCartPageDisplayed(){
        return isDisplayed(cartPageTitle);
    }

    public boolean isPriceSummaryDisplayed(){
        return isDisplayed(priceSummary);
    }

    public void clickOnProceedToPay(){
        proceedToPayBtn.click();
    }

    public void clickOnAddAddressButton(){
        addAddressBtn.click();
    }

    public boolean isCartEmpty(){
        return isDisplayed(cartEmptyMessage);
    }

    public void goToHomePage(){
        shopNowButton.click();
    }




}
