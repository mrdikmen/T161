package day10_NestedIfElse_Ternary;

public class C07_ternaryDikkatEdilecekler {
    public static void main(String[] args) {

        int sayi = 10;
        // 1- ternary mutlaka 1 sonuc uretir.
        //      bu sonucu ya yazdirmali ya da bir variable' a atamalisiniz.
        //      sadece ternary operatorunu yazarsak Java hata verir.
        //sayi > 20 ? sayi + 10 ? sayi - 10;



        // 2- ternary' nin sonucunu yazdiracaksak
        //True veya false durumlarinda alacagi degerin data turu onemli degildir.
        // AMA atama yapacaksak
        //true ya da false durumlarinda alacagi degerin data turu ayni olmalidir.

        sayi = 26;



        // verilen sayiyi kontrol edip
        //sayi ciftse "sayi cift" yazidirin, degilse 10 fazlasini yazdirin.

        System.out.println(sayi % 2 == 0 ? "sayi cift" : sayi + 10);

        //Ayni ternary' nin sonucunu bir variable' a kaydedin.
        //int sonuc = sayi % 2 == 0 ? "sayi cift" : sayi + 10; olmaz
        //String sonuc = sayi % 2 == 0 ? "sayi cift" : sayi + 10; olmaz
        //





    }
}
