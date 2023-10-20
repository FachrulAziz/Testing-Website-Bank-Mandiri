package com.TestingBankMandiri;

import com.TestingBankMandiri.pages.GoToWebsitePage;
import com.TestingBankMandiri.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GoToWebsite {

    static WebDriver driver;
    static ExtentTest extentTest;
    static GoToWebsitePage goToWebsitePage = new GoToWebsitePage();

    public GoToWebsite(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User enter url BMandiri")
    public void user_enter_url_BMandiri(){
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User enter URL Website Bank Mandiri");
    }

    @Then("User get text title page dashboard")
    public void user_get_text_title_page_dashboard(){
        Hooks.delay(2);
        Assert.assertEquals(goToWebsitePage.getTxtDashboard(),"Perseorangan");
        extentTest.log(LogStatus.PASS,"User get text title page dashboard");
    }
}