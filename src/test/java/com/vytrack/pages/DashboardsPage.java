package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardsPage extends BasePage{

    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement dashboardTab;
}
