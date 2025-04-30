package day10_NestedIfElse_Ternary;

import java.util.Scanner;

public class C02_HarfKontrolu {
    public static void main(String[] args) {
        /* Kullanicidan bir karakter girmesini isteyin
           Kullanici kucuk harf girerse
                - a ise "guzel harf"
                - b,c veya d ise "idare eder"
                - diger kucuk harfler icin "girilen kucuk harfi begenmedim" yazdirin
           Kullanici buyuk harf girerse
                - K ise "guzel harf"
                - L, V veya Z ise "idare eder"
                - diger buyuk harfler icin "girilen buyuk harfi begenmedim" yazdirin
           Kullanici ingilizce harfler disinda bir karakter girerse
           "Tanimlanmamis karakter" yazdirin
         */

        //Ana degisken girilen harfin kucuk veya buyuk harf olması!!!

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Harf Girin...");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        char harf = scanner.next().charAt(0);

        if (Character.isLowerCase(harf)) {
            //kucuk harfler bolgesi
            if (harf == 'a')
                System.out.println("Guzel harf");
            else if (harf == 'b' || harf == 'c' || harf == 'd')
                System.out.println("idare eder");
            else
                System.out.println("girilen kucuk harfi begenmedim");
        }


        else if (Character.isUpperCase(harf)) {
            //buyuk harfler bolgesi
            if (harf == 'K')
                System.out.println("Guzel harf");
            else if (harf == 'L' || harf == 'V' || harf == 'Z')
                System.out.println("idare eder");
            else
                System.out.println("girilen kucuk harfi begenmedim");


        } else {
            //kucuk ve buyuk harf disinda kalan karakterler
            System.out.println("girilen harf kucuk veya buyuk harf degildir...");
        }
    }
}


