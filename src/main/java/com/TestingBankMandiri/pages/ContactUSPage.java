package com.TestingBankMandiri.pages;

import com.TestingBankMandiri.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUSPage {
    private WebDriver driver;
    public ContactUSPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"banner\"]/div/div[1]/div/div/ul/li[3]/a")
    WebElement clickIcon;
    @FindBy(xpath = "//*[@id=\"banner\"]/div/div[1]/div/div/ul/li[3]/ul/li/ul[2]/li[5]/a")
    WebElement contact;
    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_bEaNCCdWLh4s\"]/div/div/div/div[2]/section/div/div/h1")
    WebElement getValid;


    public void clickHK(){
        clickIcon.click();
    }
    public void clickContact(){
        contact.click();
    }
    public String getTextvalid(){
        return getValid.getText();
    }
}
