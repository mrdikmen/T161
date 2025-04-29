package day09_IfElseIfStatements_NestedIfElse;

import java.util.Scanner;

public class C05_CokluDegisken {
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

        //kucuk veya buyuk harf girilebilir.
        //kontrol yaparken emin olmak icin kullanicidan alinan cinsiyet bilgisini
        //kucuk veya buyuk harfe cevirebiliriz.

        if (yas<15 || yas>80 || !(cinsiyet=='E' || cinsiyet == 'K'))
            System.out.println("hata");
        else if (cinsiyet == 'K' && yas>=60)
            System.out.println("Emekli Olabilirsiniz...");
        else if (cinsiyet == 'K' && yas<60)
            System.out.println("Emekli Olabilmen icin" + (60-yas) + "yil daha calismalisin");
        else if (cinsiyet == 'E' && yas>=65)
            System.out.println("Emekli Olabilirsiniz...");
        else if (cinsiyet == 'E' && yas<65)
            System.out.println((65-yas) + "Yil daha calisman gerekir");


    }
}
