package com.TestingBankMandiri.pages;

import com.TestingBankMandiri.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HargaRumahPage {
    private static WebDriver driver;
    public HargaRumahPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"_Calculator_Kpr_Portlet_INSTANCE_I2dk7fgDTodZ_tabs729711410397328211710997104TabsId\"]/a")
    WebElement hargaRumah;
    @FindBy(xpath = "//*[@id=\"_Calculator_Kpr_Portlet_INSTANCE_I2dk7fgDTodZ_purposeCredit\"]")
    WebElement tujuanKredit;
    @FindBy(xpath = "//*[@id=\"_Calculator_Kpr_Portlet_INSTANCE_I2dk7fgDTodZ_buildingArea\"]")
    WebElement luasLB;
    @FindBy(xpath = "//*[@id=\"_Calculator_Kpr_Portlet_INSTANCE_I2dk7fgDTodZ_collateralType\"]")
    WebElement klikJenisAgunan;
    @FindBy(xpath = "//*[@id=\"_Calculator_Kpr_Portlet_INSTANCE_I2dk7fgDTodZ_creditFacilities\"]")
    WebElement fasilitasKredit;
    @FindBy(xpath = "//*[@id=\"_Calculator_Kpr_Portlet_INSTANCE_I2dk7fgDTodZ_creditFacilities\"]/option[2]")
    WebElement pilihanFasilitas;
    @FindBy(xpath = "//*[@id=\"_Calculator_Kpr_Portlet_INSTANCE_I2dk7fgDTodZ_housePrice\"]")
    WebElement isertHargaR;
    @FindBy(xpath = "//*[@id=\"_Calculator_Kpr_Portlet_INSTANCE_I2dk7fgDTodZ_downPayment\"]")
    WebElement isertDP;
    @FindBy(xpath = "//*[@id=\"_Calculator_Kpr_Portlet_INSTANCE_I2dk7fgDTodZ_otherInstallments\"]")
    WebElement isertCicilan;
    @FindBy(xpath = "//*[@id=\"_Calculator_Kpr_Portlet_INSTANCE_I2dk7fgDTodZ_tenor2\"]")
    WebElement isertJW;
    @FindBy(xpath = "//*[@id=\"_Calculator_Kpr_Portlet_INSTANCE_I2dk7fgDTodZ_interestRate2\"]")
    WebElement isertBungas;
    @FindBy(xpath = "//*[@id=\"_Calculator_Kpr_Portlet_INSTANCE_I2dk7fgDTodZ_fm2\"]/div[2]/div/button")
    WebElement btnHitungRumah;
    @FindBy(xpath = "//*[@id=\"minimumRevenueResult\"]")
    WebElement txtDashboard2;
    @FindBy(xpath = "//*[@id=\"minDP\"]/label")
    WebElement DPKurang;
    @FindBy(xpath = "//*[@id=\"reset2\"]")
    WebElement reset;


    public void klikHargaRumah(){
        hargaRumah.click();
    }
    public void klikTujuanKredit(){
        tujuanKredit.click();
    }
    public void klickPilihan(String tujuan){
        this.tujuanKredit.sendKeys(tujuan);
    }
    public void insertLB(String LB){
        luasLB.click();
        this.luasLB.sendKeys(LB);
    }
    public void KlickCBXJenisAgunan(){
        klikJenisAgunan.click();
    }
    public void PilihRumah(String JenisAgunan){
        this.klikJenisAgunan.sendKeys(JenisAgunan);
    }
    public void insertFasilitasKredit(){
        fasilitasKredit.click();
    }
    public void cbxFasilitas(){
        pilihanFasilitas.click();
    }

    public void insertHargaRumah(String rumah){
        this.isertHargaR.sendKeys(rumah);
    }
    public void uangMuka(String DP){
        this.isertDP.sendKeys(DP);
    }
    public void insertCicilanL(String other){
        this.isertCicilan.sendKeys(other);
    }
    public void insertJangkaWaktu(String Tenor){
        isertJW.click();
        this.isertJW.sendKeys(Tenor);
    }
    public void insertSukuBunga(String Bunga){
        isertBungas.click();
        this.isertBungas.sendKeys(Bunga);
    }

    public void klikHitungRumah(){
        btnHitungRumah.click();
    }
    public void klikHapus(){
        reset.click();
    }

    public String getTxtDashboardRumah(){
        return txtDashboard2.getText();
    }
    public String getTxtDPKurang(){
        return DPKurang.getText();
    }
    public String hapusReset(){
        return luasLB.getText();
    }
}
