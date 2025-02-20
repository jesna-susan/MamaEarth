package com.automation.pages.android;

import com.automation.pages.common.BasePage;
import com.automation.pages.ui.AddressPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AndroidAddressPage extends BasePage implements AddressPage {

    @FindBy(xpath = "//div[text()='Add address'  and @class='proceed-text']")
    WebElement addressPageHeading;

    public boolean isAddressPageDisplayed(){
        return isDisplayed(addressPageHeading);
    }

    public void fillAddressDetails(){

    }

    public void selectAddressType(String addressType) {

    }

    public void clickOnSaveAddressButton(){
        //saveAddressBtn.click();
    }

    public boolean isAddressSaved(){
        return false;
    }

}
