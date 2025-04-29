package day09_IfElseIfStatements_NestedIfElse;

import java.util.Scanner;

public class C07_NestedIfElseEmeklilik {
    public static void main(String[] args) {

        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak
        // “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin
        // Kullanici yas olarak 15'den kucuk veya 80' den buyuk girerse
        // ve K veya E disinda cinsiyet girerse hata yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Yasinizi girin...");
        double yas = scanner.nextDouble();

        System.out.println("Cinsiyetinizi girin... (E) ya da (K)");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        /*
        Eger bir if else' de birden fazla degisken varsa
        Nested if else kullanilabilir.

        nested if else icin
        1- once hangi degiskeni ana degisken yapacagimiza karar verilir.
        2- sanki sadece ana degisken varmis gibi bir if - else if olusturun.
        3- artik gruplara ayidigimiz icin her bolgede o bolgeye gore
        2. degiskene bagli if else olusturun.

         */

        //cinsiyet ana degisken olsun

        if (cinsiyet == 'K') {
            //bu bolgede sadece kadinlar var.
            //bu bolgede kadinlar icin yasa bagli if else olusturun.
            if (yas<15 || yas>80)
                System.out.println("girilen deger uygun degil");
            else if (yas>=60)
                System.out.println("kadin ve 60 yas ustu oldugu icin EMEKLI OLABILIR");
            else
                System.out.println("Emekli Olabilmen icin" + (60-yas) + "yil daha calismalisin");

        }else if (cinsiyet == 'E') {
            //bu bolgede sadece erkekler var.
            if (yas<15 || yas>80)
                System.out.println("girilen deger uygun degil");
            else if (yas>=65)
                System.out.println("Erkek ve 65 yas ustu oldugu icin EMEKLI OLABILIR");
            else
                System.out.println("Emekli Olabilmen icin" + (65-yas) + "yil daha calismalisin");
        }else
            System.out.println("cinsiyet hatali");

    }

}



