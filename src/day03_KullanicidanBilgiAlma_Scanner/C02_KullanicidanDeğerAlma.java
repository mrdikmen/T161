package day03_KullanicidanBilgiAlma_Scanner;

import java.util.Scanner;

public class C02_KullanicidanDeğerAlma {
    public static void main(String[] args) {

        //Kullanicidan 1 double 1 de int sayi alip bunlarin toplamini ve carpimini yazdir

        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen bir ondalikli sayi girin...");

        double girilenOndalikliSayi = scanner.nextDouble();

        System.out.println("lutfen bir tam sayi giriniz...");

        int girilenTamSayi = scanner.nextInt();

        //girilen sayilarin toplamini yazdirin

        System.out.println("Girilen sayilarin toplami : " + (girilenOndalikliSayi + girilenTamSayi));

        //girilen sayilarin carpimini yazdirin

        System.out.println("Girilen sayilarin carpimi : " + (girilenOndalikliSayi*girilenTamSayi));


    }
}
