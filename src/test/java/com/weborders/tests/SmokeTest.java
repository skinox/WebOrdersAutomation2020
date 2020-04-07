package com.weborders.tests;

import com.weborders.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SmokeTest extends AbstractBaseTest {

    @Test(dataProvider = "smokeTestData")
    public void verifySubPageTitle(String component, String expectedPageSubtitle){
        extentTest=extentReports.createTest("Verify SubPage of "+component);

        LoginPage loginPage = new LoginPage();
        loginPage.login();
        loginPage.navigateTo(component);
        assertEquals(loginPage.getPageSubTitleText(),expectedPageSubtitle);

        extentTest.pass("SubPage of "+component+" has been verified!");

    }

    @DataProvider
    public Object[][]  smokeTestData(){
        return new Object[][]{
                {"View all orders","List of All Orders"},
                {"View all products","List of Products"},
                {"Order","Order"}
        };
    }

}
