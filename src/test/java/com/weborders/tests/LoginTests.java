package com.weborders.tests;


import com.weborders.pages.LoginPage;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class LoginTests extends AbstractBaseTest {

    @Test
    public void login_test(){
        extentTest=extentReports.createTest("Verify Page Logo");

        LoginPage loginPage = new LoginPage();
        loginPage.login();
        assertEquals(loginPage.getPageSubTitleText(),"Web Orders");

        extentTest.pass("Logo has been verified!");
    }
}
