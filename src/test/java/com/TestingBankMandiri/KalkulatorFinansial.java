package com.TestingBankMandiri;

import com.TestingBankMandiri.pages.KalkulatorFinansialPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class KalkulatorFinansial {

    static WebDriver driver;
    static ExtentTest extentTest;
    static KalkulatorFinansialPage finansialPage = new KalkulatorFinansialPage();

    public KalkulatorFinansial(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @And("user  Pilih Kalkulator Finansial")
    public void user_Pilih_Kalkulator_Finansial(){
        finansialPage.clickKalkulatorFinansial();
        extentTest.log(LogStatus.PASS,"user  Pilih Kalkulator Finansial");
    }
    @And("User get text alert Untuk menghadirkan pengalaman yang lebih baik, kami sedang melakukan pengembangan di halaman ini.")
    public void User_get_Text_Alert(){
        Hooks.delay(3);
        Assert.assertEquals(finansialPage.getTxtDashboard(), "Untuk menghadirkan pengalaman yang lebih baik, kami sedang melakukan pengembangan di halaman ini.");
        extentTest.log(LogStatus.PASS,"User get text alert Untuk menghadirkan pengalaman yang lebih baik, kami sedang melakukan pengembangan di halaman ini.");
    }
}
