package com.vytrack.tests;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void loginAsDriver() {
        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.loginBtn.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa1.vytrack.com/");
    }


    @Test
    public void loginAsStoreManager() {
        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        loginPage.login(username, password);

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa1.vytrack.com/");
    }

    @Test
    public void loginAsStoreManager2() {
        LoginPage loginPage = new LoginPage();

        loginPage.loginAsStoreManager();
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa1.vytrack.com/");
    }

    @Test
    public void wrongPasswordTest() {
        LoginPage loginPage = new LoginPage();

        loginPage.usernameInput.sendKeys("user1");
        loginPage.passwordInput.sendKeys("somepassword");
        loginPage.loginBtn.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa1.vytrack.com/user/login");
    }

    @Test
    public void wrongUsernameTest() {
        LoginPage loginPage = new LoginPage();

        loginPage.usernameInput.sendKeys("someusername");
        loginPage.passwordInput.sendKeys("UserUser123");
        loginPage.loginBtn.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa1.vytrack.com/user/login");
    }
}
