package day18_methodOlusturma;

import java.util.Scanner;

public class C02_ismiDegistirme {

    // Kullanicidan isim ve soyismini ayri ayri alip
    //	- ismi daha uzun ise,
    //    isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdiran
    //  - soyisim daha uzun ise,
    //    ismi ilk harf buyuk digerleri kucuk, soyismin tamamini buyuk harflerle yazdiran
    //  bir method olusturun

    public static void main(String[] args) {
        // Bu gorevi daha once day14 C06'de yaptik
        // orada yazdigimiz kodu method olarak olusturmadigimiz icin
        // icinde oldugumuz bu class'dan o kodlari kullanma imkanimiz yok
        // simdi ayni islemi method olarak olusturalim ki
        // bundan sonra ne zaman lazim olsa buradan hazir method kullanilabilsin

        ismiDuzenleYazdir();


    }


    public static void ismiDuzenleYazdir(   ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("isminizi giriniz...");
        String isim = scanner.nextLine();
        System.out.println("soyisminizi giriniz...");
        String soyisim = scanner.nextLine();

        if ( isim.length() > soyisim.length()){
            // isim daha uzunsa
            //    isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin

            System.out.println(

                    isim.substring(0,1).toUpperCase()+
                            isim.substring(1).toLowerCase()+
                            " "+
                            soyisim.substring(0,1).toUpperCase()+
                            soyisim.substring(1).toLowerCase()
            );

        } else if (soyisim.length() > isim.length()) {
            // soyisim daha uzunsa
            //    ismi ilk harf buyuk digerleri kucuk, soyismin tamamini buyuk harflerle yazdirin.

            System.out.println(
                    isim.substring(0,1).toUpperCase()+
                            isim.substring(1).toLowerCase()+
                            " "+
                            soyisim.toUpperCase()
            );

        }

    }
}