package day19_methodOlusturma;

import java.util.Scanner;

public class C04_VucutKitleEndexiHesapla {


    public static void main(String[] args) {



        System.out.println(vucutKitleEndexiHesapla());
    }
    // Soru 2- Kullanicidan kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayan ve sonucu donduren
    //bir method olusturun
    //         kilo*10000 / (boy *boy)

    public static double vucutKitleEndexiHesapla(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("kilonuzu kg olarak giriniz");
        double kilo = scanner.nextDouble();
        System.out.println("boyunuzu cm olarak giriniz");
        double boy = scanner.nextDouble();


        return kilo*10000 / (boy*boy);





    }
}
