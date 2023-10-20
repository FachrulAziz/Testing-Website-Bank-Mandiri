package com.TestingBankMandiri.pages;

import com.TestingBankMandiri.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoToWebsitePage {

    private WebDriver driver;
    public GoToWebsitePage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[normalize-space()='Perseorangan']")
    WebElement txtDashboard;

    public String getTxtDashboard(){
        return txtDashboard.getText();
    }
}
