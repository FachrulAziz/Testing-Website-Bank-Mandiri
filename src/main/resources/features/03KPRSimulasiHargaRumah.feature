Feature: KPR Harga Rumah
  Scenario: Input simulasi angsuran KPR
#    Given User enter url BMandiri
    When user klik Kalkulator
    And user pilih Kalkulator KPR
    And user Pilih Harga Rumah
    And user Klik Combobox Tujuan Kredit
    And user Pilih Pembelian Rumah pada Combobox Tujuan Kredit
    And user Isi Luas Bangunan dengan nilai 500
    And user Klik Combobox Jenis Agunan
    And user Pilih Rumah Tinggal pada Combobox Jenis Agunan
    And user Klik Combobox Fasilitas Kredit ke
    And user Pilih  1 pada Combobox Fasilitas Kredit ke
    And user Isi Harga Rumah dengan nilai 700000000
    And user Isi Uang Muka sebesar 15%  dengan nilai 110000000
    And user Isi Cicilan Lainnya dengan nilai 9000000
    And user Isi Jangka Waktu dengan nilai 10
    And user Isi Suku Bunga dengan nilai 5
    And user Klik Button HITUNG
  Then user get text DETAIL akan memberikan kerterangan Minimum Pendapatan IDR 21,515,731

  Scenario: Input simulasi angsuran KPR Pembelian Rumah dengan DP dibawah ketentuan
    When user klik Kalkulator
    And user pilih Kalkulator KPR
    And user Pilih Harga Rumah
    And user Klik Combobox Tujuan Kredit
    And user Pilih Pembelian Rumah pada Combobox Tujuan Kredit
    And user Isi Luas Bangunan dengan nilai 500
    And user Klik Combobox Jenis Agunan
    And user Pilih Rumah Tinggal pada Combobox Jenis Agunan
    And user Klik Combobox Fasilitas Kredit ke
    And user Pilih  1 pada Combobox Fasilitas Kredit ke
    And user Isi Harga Rumah dengan nilai 700000000
    And user Isi Uang Muka sebesar 15%  dengan nilai 10000000
    And user Isi Cicilan Lainnya dengan nilai 9000000
    And user Isi Jangka Waktu dengan nilai 10
    And user Isi Suku Bunga dengan nilai 5
    And user Klik Button HITUNG
    Then user get text DETAIL akan memberikan kerterangan Nilai harus lebih dari atau sama dengan Uang Muka Minimal pada Field Text Uang Muka sebesar 15%

  Scenario: ungsional Button Reset
    When user klik Kalkulator
    And user pilih Kalkulator KPR
    And user Pilih Harga Rumah
    And user Klik Combobox Tujuan Kredit
    And user Pilih Pembelian Rumah pada Combobox Tujuan Kredit
    And user Isi Luas Bangunan dengan nilai 500
    And user Klik Combobox Jenis Agunan
    And user Pilih Rumah Tinggal pada Combobox Jenis Agunan
    And user Klik Combobox Fasilitas Kredit ke
    And user Pilih  1 pada Combobox Fasilitas Kredit ke
    And user Isi Harga Rumah dengan nilai 700000000
    And user Isi Uang Muka sebesar 15%  dengan nilai 110000000
    And user Isi Cicilan Lainnya dengan nilai 9000000
    And user Isi Jangka Waktu dengan nilai 10
    And user Isi Suku Bunga dengan nilai 5
    And user Klik Button HAPUS RESET
    Then user get text clear Rumah