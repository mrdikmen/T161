package day15_forLoop;

import java.util.Scanner;

public class C03_AradakiSayilarinToplami {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        Bitis degeri baslangic degerinden kucukse,
        //        uyari yazdirip islemi sonlandirin

        Scanner scanner = new Scanner(System.in);
        System.out.print("Baslangic degerini girin: ");
        int baslangic = scanner.nextInt();
        System.out.print("Bitis degerini girin: ");
        int bitis = scanner.nextInt();

        int sonuc = 0;

        if (bitis < baslangic) System.out.println("Bitis degerini baslangic degerinden kucuk girdiniz...");

        else
            for (int i = baslangic; i <= bitis; i++) {

                sonuc += i;

            }System.out.println("aradaki sayilarin toplami: " + sonuc);
    }
}