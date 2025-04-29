package day09_IfElseIfStatements_NestedIfElse;

import java.util.Scanner;

public class C02_VucutKitleEndeksi {
    public static void main(String[] args) {

        // Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
        //         kilo*10000 / (boy *boy)
        //         vucut kitle endeksi
        //         30’dan buyukse obez,
        //         25-30 arasi ise kilolu,
        //         20-25 arasi ise normal,
        //         20’den kucukse zayif yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen kilo(kg) giriniz...");

        double kg = scanner.nextDouble();
        System.out.println("lutfen kilo(kg) ve boy(cm) giriniz...");
        double boy = scanner.nextDouble();

        double sonuc = kg*10000 / (boy *boy);
        System.out.println("sonuc" + sonuc);



        if (sonuc<=20) System.out.println("zayif");
        else if (sonuc<=25) System.out.println("normal");
        else if (sonuc<=30) System.out.println("kilolu");
        else if (sonuc>30) System.out.println("obez");

    }
}
