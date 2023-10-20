package com.TestingBankMandiri.pages;

import com.TestingBankMandiri.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PenghasilanPage {
    private static WebDriver driver;
    public PenghasilanPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//li[@class='nav-tools']//a[@class='dropdown-toggle']")
    WebElement btnIcon;
    @FindBy(xpath = "//a[normalize-space()='Kalkulator KPR']")
    WebElement kalkulator;
    @FindBy(xpath = "//a[normalize-space()='Salary']")
    WebElement penghasilan;
    @FindBy(xpath = "//input[@id='_Calculator_Kpr_Portlet_INSTANCE_I2dk7fgDTodZ_salary']")
    WebElement inputIncome;
    @FindBy(xpath = "//*[@id=\"_Calculator_Kpr_Portlet_INSTANCE_I2dk7fgDTodZ_tenor\"]")
    WebElement inputTenor;
    @FindBy(xpath = "//input[@id='_Calculator_Kpr_Portlet_INSTANCE_I2dk7fgDTodZ_interestRate']")
    WebElement inputBunga;
    @FindBy(xpath = "//select[@id='_Calculator_Kpr_Portlet_INSTANCE_I2dk7fgDTodZ_occupation']")
    WebElement pekerjaan;
    @FindBy(xpath = "//*[@id=\"_Calculator_Kpr_Portlet_INSTANCE_I2dk7fgDTodZ_occupation\"]/option[2]")
    WebElement cbxxPekerjaan;
    @FindBy(xpath = "//input[@id='_Calculator_Kpr_Portlet_INSTANCE_I2dk7fgDTodZ_additionalInstallments']")
    WebElement inputCicilaiLainnya;
    @FindBy(xpath = "//button[@onclick='javascript:calculateSalary();']")
    WebElement btnHitung;
    @FindBy(xpath = "//*[@id=\"reset\"]")
    WebElement btnHapus;
    @FindBy(xpath = "//p[@id='creditLimitResult']")
    WebElement txtDashboard1;
    @FindBy(xpath = "//p[@id='installmentResult']")
    WebElement txtDashboard2;
    @FindBy(xpath = "//input[@id='_Calculator_Kpr_Portlet_INSTANCE_I2dk7fgDTodZ_salary']")
    WebElement reset;


    public void klickIcon(){
        btnIcon.click();
    }
    public void kalkulatorKPR(){
        kalkulator.click();
    }
    public void klickPenghasilan(){
        penghasilan.click();
    }

    public void insertIncome(String Income){
        this.inputIncome.sendKeys(Income);
    }

        public void insertTenor(String Tenor){
        inputTenor.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].textContent = arguments[1];",Tenor);
        this.inputTenor.sendKeys(Tenor);
    }

    public void insertBunga(String Bunga){
        inputBunga.click();
        this.inputBunga.sendKeys(Bunga);
    }
    public void klikPekerjaan(){
        pekerjaan.click();
    }
    public void cbxPekerjaan(){
        cbxxPekerjaan.click();
    }
    public void insertCicilanLainnya(String cicilan){
        this.inputCicilaiLainnya.sendKeys(cicilan);
    }
    public void klikHitung(){
        btnHitung.click();
    }
    public void klikHapus(){
        btnHapus.click();
    }
    public String getTxtDashboard1(){
        return txtDashboard1.getText();
    }
    public String getTxtDashboard2(){
        return txtDashboard2.getText();
    }
    public String hapusReset(){
        return reset.getText();
    }
}
