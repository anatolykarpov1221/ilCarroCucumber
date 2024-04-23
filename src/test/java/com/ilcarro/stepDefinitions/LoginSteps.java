package com.ilcarro.stepDefinitions;

import com.ilCarro.pages.HomePage;
import com.ilCarro.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilCarro.pages.BasePage.driver;

public class LoginSteps {
    @And("User clicks on Login link")
    public void clicks_on_Login_link(){
        new HomePage(driver).clickOnLoginLink();
    }
    @And("User enters valid data")
    public void enters_valid_data(){
        new LoginPage(driver).enterData("karpov1221@gmail.com", "Super1557!");
    }
    @And("User clicks on Yalla button")
    public void click_on_Yalla_button(){
        new LoginPage(driver).clickOnYallaButton();
    }
    @Then("User verifies Succes Message is displayed")
    public void verifies_Succes_Message(){
        new LoginPage(driver).isSuccesMessageDisplaed("Logged in success");
    }


}
