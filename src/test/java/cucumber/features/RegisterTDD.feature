Feature: Fungsionalitas Register

  Scenario Outline: Memastikan Fungsionalitas Register
    Given Membuka Aplikasi
    When Masukan Data <name>, <weight>, <height> sebagai nama, berat, tinggi
    And Klik Lanjutkan
    Then Pengguna <status> di beranda Diet App

    Examples:
    | name | weight | height | status |
    | mike |   75   |   175  | Passed |
    | baron|   79   |   180  | Passed |