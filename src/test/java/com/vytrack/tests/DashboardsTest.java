package com.vytrack.tests;

import com.vytrack.pages.DashboardsPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DashboardsTest extends TestBase {

    @BeforeClass
    public void setup(){
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        loginPage.login(username,password);
        BrowserUtils.waitFor(5);
    }

    @Test
    public void verifyDashboardPage() {
        DashboardsPage dashboardsPage = new DashboardsPage();
        dashboardsPage.dashboardTab.click();
        BrowserUtils.waitFor(5);
    }
}
