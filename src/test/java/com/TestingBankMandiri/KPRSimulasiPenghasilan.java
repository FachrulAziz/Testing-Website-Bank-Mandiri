package com.TestingBankMandiri;

import com.TestingBankMandiri.pages.PenghasilanPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class KPRSimulasiPenghasilan {
    static WebDriver driver;
    static ExtentTest extentTest;
    static PenghasilanPage angsuranKPRPage = new PenghasilanPage();

    public KPRSimulasiPenghasilan(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("user klik Kalkulator")
    public void user_klik_Kalkulator(){
        angsuranKPRPage.klickIcon();
        extentTest.log(LogStatus.PASS,"user klik Kalkulator");
    }

    @And("user pilih Kalkulator KPR")
    public void user_pilih_Kalkulator_KPR(){
        angsuranKPRPage.kalkulatorKPR();
        extentTest.log(LogStatus.PASS,"user pilih Kalkulator KPR");
    }
    @And("user pilih Penghasilan")
    public void user_pilih_Penghasilan(){
        Hooks.delay(1);
        angsuranKPRPage.klickPenghasilan();
        extentTest.log(LogStatus.PASS,"user pilih Penghasilan");
    }
    @And("user isi Penghasilan dengan nilai 7000000")
    public void user_isi_Penghasilan_dengan_nilai_7000000(){
        Hooks.delay(1);
        Hooks.scroll(500);
        angsuranKPRPage.insertIncome("7000000");
        extentTest.log(LogStatus.PASS,"user isi Penghasilan dengan nilai 7000000");
    }
    @And("user isi Penghasilan dengan nilai 2000000")
    public void user_isi_Penghasilan_dengan_nilai_2000000(){
        Hooks.delay(2);
        angsuranKPRPage.insertIncome("2000000");
        extentTest.log(LogStatus.PASS,"user isi Penghasilan dengan nilai 2000000");
    }

    @And("user isi Jangka Waktu Kredit dengan nilai 10")
    public void user_isi_Jangka_Waktu_Kredit_dengan_nilai_10(){
        angsuranKPRPage.insertTenor("10");
        extentTest.log(LogStatus.PASS,"user isi Jangka Waktu Kredit dengan nilai 10");
    }
    @And("user isi Suku Bunga dengan nilai 2")
    public void user_isi_Suku_Bunga_dengan_nilai_2(){
        angsuranKPRPage.insertBunga("2");
        extentTest.log(LogStatus.PASS,"user isi Suku Bunga dengan nilai 2");
    }
    @And("user isi Suku Bunga dengan nilai 10")
    public void user_isi_Suku_Bunga_dengan_nilai_10(){
        angsuranKPRPage.insertBunga("2");
        extentTest.log(LogStatus.PASS,"user isi Suku Bunga dengan nilai 10");
    }
    @And("user klik Combobox Pekerjaan")
    public void user_klik_Combobox_Pekerjaan(){
        angsuranKPRPage.klikPekerjaan();
        extentTest.log(LogStatus.PASS,"user klik Combobox Pekerjaan");
    }
    @And("user pilih Pegawai atau Profesional pada Combobox Pekerjaan")
    public void user_pilih_Pegawai_atau_Profesional_pada_Combobox_Pekerjaan(){
        angsuranKPRPage.cbxPekerjaan();
        extentTest.log(LogStatus.PASS,"user pilih Pegawai atau Profesional pada Combobox Pekerjaan");
    }
    @And("user isi Cicilan Lainnya dengan nilai 2000000")
    public void user_isi_Cicilan_Lainnya_dengan_nilai_2000000(){
        angsuranKPRPage.insertCicilanLainnya("2000000");
        extentTest.log(LogStatus.PASS,"user isi Cicilan Lainnya dengan nilai 2000000");
    }
    @And("user isi Cicilan Lainnya dengan nilai 3000000")
    public void user_isi_Cicilan_Lainnya_dengan_nilai_3000000(){
        angsuranKPRPage.insertCicilanLainnya("2000000");
        extentTest.log(LogStatus.PASS,"user isi Cicilan Lainnya dengan nilai 2000000");
    }
    @And("user klik Button HITUNG")
    public void user_klik_Button_HITUNG(){
        angsuranKPRPage.klikHitung();
        extentTest.log(LogStatus.PASS,"user klik Button HITUNG");
        Hooks.delay(2);
    }
    @And("user klik Button HAPUS")
    public void user_klik_Button_HAPUS(){
        angsuranKPRPage.klikHapus();
        extentTest.log(LogStatus.PASS,"user klik Button HAPUS");
        Hooks.delay(2);
    }
    @Then("user get text Limit Kredit")
    public void user_get_text_Limit_Kredit(){
        Assert.assertEquals(angsuranKPRPage.getTxtDashboard1(),"Rp. 201.057.554");
        extentTest.log(LogStatus.PASS,"user get text Limit Kredit");
    }
    @Then("user get text invalid Limit Kredit")
    public void user_get_text_invalid_Limit_Kredit(){
        Hooks.delay(1);
        Assert.assertEquals(angsuranKPRPage.getTxtDashboard1(),"Penghasilan tidak memenuhi standar");
        extentTest.log(LogStatus.PASS,"user get text invalid Limit Kredit");
    }
    @Then("user get text Angsuran")
    public void user_get_text_Angsuran(){
        Assert.assertEquals(angsuranKPRPage.getTxtDashboard2(),"Rp. 1.850.000");
        extentTest.log(LogStatus.PASS,"user get text Angsuran");
    }
    @Then("user get text clear")
    public void user_get_text_clear(){
        Assert.assertEquals(angsuranKPRPage.hapusReset(),"");
        extentTest.log(LogStatus.PASS,"Semua Text di Reset");
    }
}
