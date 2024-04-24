package com.ilCarro.pages;

import io.cucumber.java.bs.A;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static java.awt.SystemColor.text;

public class SearchCarPage extends BasePage {


    public SearchCarPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[ng-reflect-name='city']")
    WebElement Select_City;
    @FindBy(css = "html")
    WebElement space;
    public SearchCarPage selectCityFirstInList(String cityName) {
        Select_City.sendKeys(cityName);
        pause(1000);
        Select_City.sendKeys(Keys.ARROW_DOWN);
        pause(500);
        Select_City.sendKeys(Keys.ENTER);

        return this;
    }
    @FindBy(css = "[ng-reflect-name='dates']")
    WebElement InputDate;

    public SearchCarPage chooseDate(String text) {
        InputDate.sendKeys(text);
        pause(1500);
        return this;
    }
    @FindBy(css = "[type='submit']")
    WebElement Yalla;
    public SearchCarPage clickYallaButton() {
        click(Yalla);
        pause(3500);
        return this;
    }



    @FindBy(xpath = "//span[text()='Chevrolet Comaro']")
    WebElement cars;
    public SearchCarPage verifySearchResult() {
        String actualText = cars.getText();
        String expectedText = "Chevrolet Comaro2020";

        Assert.assertEquals(expectedText, actualText);

        return this;
    }


    @FindBy(css = ".positive-button")
    WebElement OKButton;
    public SearchCarPage clickOKButton() {
        click(OKButton);
        return this;
    }
//    @FindBy(css = "")
//    WebElement SearchLink;
//    public SearchCarPage clickSearchLink() {
//        click(SearchLink);
//        return this;
//    }

}