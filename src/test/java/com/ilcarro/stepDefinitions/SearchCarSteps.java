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

import static com.ilCarro.pages.BasePage.driver;

public class SearchCarSteps {

        @Given("User navigates to {string}")
        public void navigateToPage(String url) {
               BasePage.driver.get(url);
        }

        @When("User selects the city")
        public void select_City() {
            new SearchCarPage(driver).selectCity("Tel Aviv");
        }

        @And("User chooses a specific date")
        public void choose_Date() {
           new SearchCarPage(driver).chooseDate("05/01/2024-05/07/2024");
        }

        @And("User clicks the Search button")
        public void click_SearchButton() {
            new SearchCarPage(driver).clickSearchButton();
        }

        @Then("User see the cars available on the selected date ")
        public void verifySearchResults(String text) {
        new SearchCarPage(driver).verifySearchResult(text);

        }

}
