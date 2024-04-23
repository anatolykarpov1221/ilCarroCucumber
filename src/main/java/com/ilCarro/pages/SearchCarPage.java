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
    @FindBy(css = "#city:nth-child(1)")
    WebElement Select_City;
    @FindBy(css = "html")
    WebElement space;
    public SearchCarPage selectCity(String city) {
        Select_City.sendKeys(city);
        //Select_City.sendKeys(Keys.ENTER);
        click(space);
        return this;
    }
    @FindBy(xpath = "//input[@class='ng-touched ng-dirty ng-invalid']")
    WebElement InputDate;

    public SearchCarPage chooseDate(String text) {
        InputDate.sendKeys(text);
        return this;
    }
    @FindBy(xpath = "//button[@disabled and @xpath='1' and text()='Search']")
    WebElement Search;
    public SearchCarPage clickSearchButton() {
        click(Search);
        return this;
    }



    @FindBy(xpath = "//span[text()='Chevrolet Comaro']")
    WebElement cars;
    public SearchCarPage verifySearchResult(String text) {
        Assert.assertTrue(shouldHaveText(cars,"Chevrolet Comaro",10));

        return this;
    }


}