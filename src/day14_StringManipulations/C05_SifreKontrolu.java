package day14_StringManipulations;

import java.util.Scanner;

public class C05_SifreKontrolu {
    public static void main(String[] args) {
        //Soru 4 : Kullanicidan bir sifre isteyip,
        //         asagidaki sartlari kontrol edin
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz...");
        String sifre = scanner.nextLine();
        int flag = 10;

        //         - ilk harf kucuk harf olmali
        char ilkharf = sifre.charAt(0);
        if (!Character.isLowerCase(ilkharf)) {
            System.out.println("Ilk harf kucuk harf olmali.");
            flag = 11;

        }
        //         - son karakter rakam olmali
        char sonkarakter = sifre.charAt(sifre.length() - 1);
        if ( sonkarakter<'0' || sonkarakter>'9') {
            System.out.println("son karakter rakam olmali");
            flag = 11;
        }

        //         - sifre bosluk icermemeli
        if (sifre.contains(" ")) {
            System.out.println("Sifre bosluk icermemeli");
            flag = 11;
        }

        //         - uzunlugu en az 10 karakter olmali
        if (!(sifre.length()>=10)) {
            System.out.println("sifre uzunlugu en az 10 karakter olmali");
            flag = 11;

        }

        //sona gelindiginde flag 10 veya 11 degerini alabilir
        //eger flag == 10 ise hicbir hata mesajı yazdirilmadi demektir.
        //eger flag == 11 ise hata mesajı yazdirildi ama kac mesaj yazdirildigini bilemeyiz.

        //         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin

        if (flag == 10) System.out.println("sifre basari ile kaydedildi.");
        /*
        tum hatalari yazdirmamizi istediginden
        bagimsiz if cumleleri kullanmaliyiz

        bagimsiz if cumlelerinde
        sona gelindiginde tum sartlari sagladiginda kontrol edebilmek icin
        flag veya sayac yontemlerini kullanabiliriz.
        flag yapacagiz
         */


    }
}
