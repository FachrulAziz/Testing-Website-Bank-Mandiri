Feature: KPR
  Scenario: Input simulasi angsuran KPR
    When user klik Kalkulator
    And user pilih Kalkulator KPR
    And user isi Penghasilan dengan nilai 7000000
    And user isi Jangka Waktu Kredit dengan nilai 10
    And user isi Suku Bunga dengan nilai 2
    And user pilih Pegawai atau Profesional pada Combobox Pekerjaan
    And user isi Cicilan Lainnya dengan nilai 2000000
    And user klik Button HITUNG
    Then user get text Limit Kredit
    Then user get text Angsuran

  Scenario: Input Invalid simulasi angsuran KPR
    When user klik Kalkulator
    And user pilih Kalkulator KPR
    And user isi Penghasilan dengan nilai 2000000
    And user isi Jangka Waktu Kredit dengan nilai 10
    And user isi Suku Bunga dengan nilai 10
    And user pilih Pegawai atau Profesional pada Combobox Pekerjaan
    And user isi Cicilan Lainnya dengan nilai 3000000
    And user klik Button HITUNG
    Then user get text invalid Limit Kredit

  Scenario: Funssional button Reset
    When user klik Kalkulator
    And user pilih Kalkulator KPR
    And user isi Penghasilan dengan nilai 2000000
    And user isi Jangka Waktu Kredit dengan nilai 10
    And user isi Suku Bunga dengan nilai 10
    And user pilih Pegawai atau Profesional pada Combobox Pekerjaan
    And user isi Cicilan Lainnya dengan nilai 3000000
    And user klik Button HAPUS
    Then user get text clear



