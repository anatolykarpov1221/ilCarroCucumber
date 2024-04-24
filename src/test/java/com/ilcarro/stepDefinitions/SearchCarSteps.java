package com.ilcarro.stepDefinitions;
import com.ilCarro.pages.BasePage;
import com.ilCarro.pages.LoginPage;
import com.ilCarro.pages.SearchCarPage;
import com.ilCarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.ilCarro.pages.BasePage.driver;

public class SearchCarSteps {

        @And("User clicks on OK button")
        public void buttonOK() {
            new SearchCarPage(driver).clickOKButton();
        }

        @When("User selects the city")
        public void select_City() {
            new SearchCarPage(driver).selectCityFirstInList("Tel Aviv, Israel");
        }

        @And("User chooses a specific date")
        public void choose_Date() {
           new SearchCarPage(driver).chooseDate("05/20/2024-05/27/2024");
        }

        @And("User clicks the Yalla button")
        public void click_YallaButton() {
            new SearchCarPage(driver).clickYallaButton();
        }

        @Then("User see the cars available on the selected date")
        public void user_see_the_cars_available_on_the_selected_date() {
            new SearchCarPage(driver).verifySearchResult();
    }


}


