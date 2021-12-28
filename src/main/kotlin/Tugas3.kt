fun main() {
    //Tugas 3 No.1//
    val Minimal = 500_000
    var Beli = 625_000
    val DiskonMember = Beli * 5 / 100
    val DiskonBeli = Beli * 10 / 100
    val TotalDiskon = DiskonBeli + DiskonMember

    if (Beli >= Minimal) {
        var Total = Beli - DiskonMember - DiskonBeli
        println("Pembeli 1 mendapatkan diskon 15% dari $Beli, jadi totalnya = $Beli - $TotalDiskon = $Total ")
    } else if (Beli <= Minimal) {
        var Total = Beli + DiskonMember - DiskonBeli
        println("Pembeli 1 mendapatkan diskon 5% dari $Beli, jadi totalnya = $Beli - $TotalDiskon = $Total ")
    }

    //Tugas 3 No.2//

    var BeratBadan = 50
    var TinggiBadan = 170

    if (TinggiBadan - 110 == BeratBadan){
        println("Berat Badan $BeratBadan adalah Normal")
    } else if (TinggiBadan - 110 <= BeratBadan){
        println("Berat Badan $BeratBadan adalah Gemuk")
    }else if (TinggiBadan - 110>= BeratBadan){
        println("Berat Badan $BeratBadan adalah Kurus")
    }
}