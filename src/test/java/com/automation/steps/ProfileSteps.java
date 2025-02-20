package com.automation.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProfileSteps extends BaseSteps{

    @Then("verify user is on profile page")
    public void verifyUserIsOnProfilePage() {
        Assert.assertTrue(profilePage.isProfilePageDisplayed());
    }

    @Then("verify user login is successful")
    public void verify_user_login_is_successful() {
        Assert.assertFalse(profilePage.isLoginBtnNotDisplayed());
    }


    @When("user clicks on login link")
    public void userClicksOnLoginLink() {
        profilePage.clickLoginIcon();
    }

    @Then("verify user logged out successful")
    public void verifyUserLoggedOutSuccessful() {
        Assert.assertTrue(profilePage.userLogoutSuccessful());
    }

    @And("clicks on logout button")
    public void clicksOnLogoutButton() {
        profilePage.clickLogoutIcon();
    }


}
