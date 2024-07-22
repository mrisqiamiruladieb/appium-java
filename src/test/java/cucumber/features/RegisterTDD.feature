Feature: Fungsionalitas Register
  @tdd
  Scenario Outline: Memastikan Fungsionalitas Register
    Given Membuka Aplikasi
    When Masukan Data <name>, <weight>, <height> sebagai nama, berat, tinggi
    And Klik Lanjutkan
    Then Pengguna <status> di beranda Diet App

    Examples:
    |  name | weight | height | status |
    | razor |   80   |   175  | Passed |
    | baron |   75   |   180  | Passed |