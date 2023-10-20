package com.TestingBankMandiri.pages;

import com.TestingBankMandiri.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KalkulatorFinansialPage {
    private WebDriver driver;
    public KalkulatorFinansialPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"banner\"]/div/div[1]/div/div/ul/li[1]/ul/li/ul[2]/li/ul/li[1]/a")
    WebElement finansial;
    //
    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_Gy8CMdvkDsJj\"]/div/div/div/div[2]/p[3]/strong/span")
    WebElement TxtDashboard;

    public void clickKalkulatorFinansial(){
        finansial.click();
    }
    public String getTxtDashboard(){
       return TxtDashboard.getText();
    }
}
