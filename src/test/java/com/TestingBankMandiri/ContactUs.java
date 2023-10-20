package com.TestingBankMandiri;

import com.TestingBankMandiri.pages.ContactUSPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ContactUs {

    static WebDriver driver;
    static ExtentTest extentTest;
    static ContactUSPage contact = new ContactUSPage();

    public ContactUs(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User Klik Hubungi Kami")
    public void User_Klik_Hubungi_Kami(){
        contact.clickHK();
        extentTest.log(LogStatus.PASS,"User Klik Hubungi Kami");
    }
    @And("User Pilih Contact")
    public void User_Pilih_Contact(){
        Hooks.delay(1);
        contact.clickContact();
        extentTest.log(LogStatus.PASS,"User Pilih Contact");
    }
    @Then("User get text alert Hubungi Kami")
    public void User_get_text_valid_data() {
        Hooks.delay(2);
        Assert.assertEquals(contact.getTextvalid(), "Hubungi Kami");
        extentTest.log(LogStatus.PASS, "User get text alert Hubungi Kami");
    }
}
