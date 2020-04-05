package com.weborders.pages;

import com.weborders.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * It meant to be extended
 */

public class AbstractBasePage {

    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver,20);

    @FindBy(tagName = "h1")
    protected WebElement pageLoad;

    public String getPageLogoText(){
        return pageLoad.getText();
    }


    public AbstractBasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    /**
     * Specify to which tab you want to navigate, tab name is a parameter in the method below
     * @param component
     */

    public void navigateTo(String component){
        String locator = "//a[text()=]'"+component+"']";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).click();
    }

}
