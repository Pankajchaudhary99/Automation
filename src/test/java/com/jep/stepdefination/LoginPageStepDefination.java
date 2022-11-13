package com.jep.stepdefination;

import com.jep.pages.LoginPage;
import com.jep.util.TestContextSetup;
import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class LoginPageStepDefination {

    TestContextSetup testContextSetup= null;
    LoginPage loginPage=null;

    public LoginPageStepDefination(TestContextSetup testContextSetup)
    {
        this.testContextSetup=testContextSetup;
        this.loginPage=testContextSetup.pageObjectManager.getLoginPage();
    }

    @Given("User is on Login Page")
    public void user_is_on_login_page() {

        Assert.assertTrue(loginPage.launchApplication());
    }

    @When("user logs in through Login Window by using <Username> as {string}")
    public void user_logs_in_through_login_window_by_using_username_as(String string) {
        Assert.assertTrue(loginPage.userName(string));
    }

    @And("user logs in through Login Window by using <Password> as {string}")
    public void user_logs_in_through_login_window_by_using_password_as(String string) {
        Assert.assertTrue(loginPage.passwordName(string));
    }

    @And("user click on Login button")
    public void userClickOnLoginButton() {
        Assert.assertTrue(loginPage.loginButton());
    }

    @Then("login must be successful")
    public void login_must_be_successful() {

        System.out.println("login must be successful");
    }


    @Given("Click on Personal List")
    public void clickOnPersonalList() {

        Assert.assertTrue(loginPage.prsnlListClick());
    }

    @When("Personal should open")
    public void personalShouldOpen() {

        System.out.println("Personal should open");
    }

    @When("Click on Personal")
    public void clickOnPersonal() {

        Assert.assertTrue(loginPage.prsnlClick());
    }

    @Then("Personal List should appear")
    public void personalListShouldAppear() {

        System.out.println("Personal List should appear");
    }

    @Given("User is in search bar")
    public void userIsInSearchBar() {
        System.out.println("User is in search bar");
    }

    @When("The user enters <SearchValidUser> as {string} into the search bar")
    public void theUserEntersSearchValidUserAsIntoTheSearchBar(String string) {
        Assert.assertTrue(loginPage.searchUser(string));
    }

    @Then("Search user related details are shown on the results page")
    public void searchUserRelatedDetailsAreShownOnTheResultsPage() {

        System.out.println("Searched user related info should display");
    }


    @But("The user enters <SearchInvalidUser> as {string} into the search bar")
    public void theUserEntersSearchInvalidUserAsIntoTheSearchBar(String string) {

        Assert.assertTrue(loginPage.searchUser(string));
    }

    @Then("No matching records found")
    public void noMatchingRecordsFound() {

        System.out.println("No Records");
    }

    @When("The user should Scroll down")
    public void theUserShouldScrollDown() {

        Assert.assertTrue(loginPage.scroll("The user should Scroll"));

    }

    @Given("I am at the Login page")
    public void iAmAtTheLoginPage() {

        System.out.println("Login Page");
    }

    @Then("a text {string} Should appear in the validation errors")
    public void aTextInvalidUsernameAndPasswordShouldAppearInTheValidationErrors(String errorMessage) {

        Assert.assertEquals(errorMessage, loginPage.getValidationError("Invalid Username and Password"));
    }
}