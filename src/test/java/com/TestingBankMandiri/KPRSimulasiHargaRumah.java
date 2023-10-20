package com.TestingBankMandiri;

import com.TestingBankMandiri.pages.HargaRumahPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class KPRSimulasiHargaRumah {
    static WebDriver driver;
    static ExtentTest extentTest;
    static HargaRumahPage hargaRumahPage = new HargaRumahPage();

    public KPRSimulasiHargaRumah(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @And("user Pilih Harga Rumah")
    public void user_Pilih_Harga_Rumah(){
        Hooks.scroll(500);
        Hooks.delay(3);
        hargaRumahPage.klikHargaRumah();
        extentTest.log(LogStatus.PASS,"user Pilih Harga Rumah");
    }
    @And("user Klik Combobox Tujuan Kredit")
    public void user_Klik_Combobox_Tujuan_Kredit(){
        Hooks.delay(1);
        hargaRumahPage.klikTujuanKredit();
        extentTest.log(LogStatus.PASS,"user Klik Combobox Tujuan Kredit");
    }

    @And("user Pilih Pembelian Rumah pada Combobox Tujuan Kredit")
    public void user_Pilih_Pembelian_Rumah_pada_Combobox_Tujuan_Kredit(){
        Hooks.delay(2);
        hargaRumahPage.klickPilihan("Pembelian Rumah");
        extentTest.log(LogStatus.PASS,"user Pilih Pembelian Rumah pada Combobox Tujuan Kredit");
    }
    @And("user Isi Luas Bangunan dengan nilai 500")
    public void user_Isi_Luas_Bangunan_dengan_nilai_500(){
        hargaRumahPage.insertLB("500");
        extentTest.log(LogStatus.PASS,"user Isi Luas Bangunan dengan nilai 500");
    }
    @And("user Klik Combobox Jenis Agunan")
    public void user_Klik_Combobox_Jenis_Agunan(){
        hargaRumahPage.KlickCBXJenisAgunan();
        extentTest.log(LogStatus.PASS,"user Klik Combobox Jenis Agunan");
    }
    @And("user Pilih Rumah Tinggal pada Combobox Jenis Agunan")
    public void user_Pilih_Rumah_Tinggal_pada_Combobox_Jenis_Agunan(){
        hargaRumahPage.PilihRumah("Rumah Tinggal");
        extentTest.log(LogStatus.PASS,"user Pilih Rumah Tinggal pada Combobox Jenis Agunan");
    }
    @And("user Klik Combobox Fasilitas Kredit ke")
    public void user_Klik_Combobox_Fasilitas_Kredit_ke(){
        hargaRumahPage.insertFasilitasKredit();
        extentTest.log(LogStatus.PASS,"user Klik Combobox Fasilitas Kredit ke");
    }
    @And("user Pilih  1 pada Combobox Fasilitas Kredit ke")
    public void user_Pilih_1_pada_Combobox_Fasilitas_Kredit_ke(){
        hargaRumahPage.cbxFasilitas();
        extentTest.log(LogStatus.PASS,"user Pilih  1 pada Combobox Fasilitas Kredit ke");
    }
    @And("user Isi Harga Rumah dengan nilai 700000000")
    public void user_klik_Combobox_Pekerjaan(){
        hargaRumahPage.insertHargaRumah("700000000");
        extentTest.log(LogStatus.PASS,"user Isi Harga Rumah dengan nilai 700000000");
    }
    @And("user Isi Uang Muka sebesar 15%  dengan nilai 110000000")
    public void user_Isi_Uang_Muka_sebesar_15_dengan_nilai_110000000(){
        hargaRumahPage.uangMuka("110000000");
        extentTest.log(LogStatus.PASS,"user Isi Uang Muka sebesar 15%  dengan nilai 110000000");
    }
    @And("user Isi Uang Muka sebesar 15%  dengan nilai 10000000")
    public void user_Isi_Uang_Muka_sebesar_15_dengan_nilai_10000000(){
        hargaRumahPage.uangMuka("10000000");
        extentTest.log(LogStatus.PASS,"user Isi Uang Muka sebesar 15% dengan nilai 10000000");
    }
    @And("user Isi Cicilan Lainnya dengan nilai 9000000")
    public void user_Isi_Cicilan_Lainnya_dengan_nilai_9000000(){
        hargaRumahPage.insertCicilanL("9000000");
        extentTest.log(LogStatus.PASS,"user Isi Cicilan Lainnya dengan nilai 9000000");
    }
    @And("user Isi Jangka Waktu dengan nilai 10")
    public void user_Isi_Jangka_Waktu_dengan_nilai_10(){
        Hooks.delay(1);
        hargaRumahPage.insertJangkaWaktu("10");
        extentTest.log(LogStatus.PASS,"user Isi Jangka Waktu dengan nilai 10");
    }
    @And("user Isi Suku Bunga dengan nilai 5")
    public void user_Isi_Suku_Bunga_dengan_nilai_5(){
        hargaRumahPage.insertSukuBunga("5");
        extentTest.log(LogStatus.PASS,"user Isi Suku Bunga dengan nilai 5");
    }
    @And("user Klik Button HITUNG")
    public void user_klik_Button_HITUNG(){
        hargaRumahPage.klikHitungRumah();
        extentTest.log(LogStatus.PASS,"user klik Button HITUNG");
        Hooks.delay(2);
    }
    @And("user Klik Button HAPUS RESET")
    public void user_klik_Button_HAPUS_RESET(){
        hargaRumahPage.klikHapus();
        extentTest.log(LogStatus.PASS,"user klik Button HAPUS RESET");
        Hooks.delay(2);
    }
    @Then("user get text DETAIL akan memberikan kerterangan Minimum Pendapatan IDR 21,515,731")
    public void user_get_text_DETAIL_akan_memberikan_kerterangan_Minimum_Pendapatan(){
        Assert.assertEquals(hargaRumahPage.getTxtDashboardRumah(),"Rp. 21.515.731");
        extentTest.log(LogStatus.PASS,"user get text DETAIL akan memberikan kerterangan Minimum Pendapatan IDR 21,515,731");
    }
    @Then("user get text DETAIL akan memberikan kerterangan Nilai harus lebih dari atau sama dengan Uang Muka Minimal pada Field Text Uang Muka sebesar 15%")
    public void user_get_text_DETAIL_akan_memberikan_kerterangan_Uang_Muka(){
        Assert.assertEquals(hargaRumahPage.getTxtDPKurang(),"Uang Muka Minimal Rp");
        extentTest.log(LogStatus.PASS,"user get text DETAIL akan memberikan kerterangan Uang Muka Tidak Memenuhi Standard");
    }
    @Then("user get text clear Rumah")
    public void user_get_text_clear_Rumah(){
        Assert.assertEquals(hargaRumahPage.hapusReset(),"");
        extentTest.log(LogStatus.PASS,"Semua Text di Reset");
    }
}
