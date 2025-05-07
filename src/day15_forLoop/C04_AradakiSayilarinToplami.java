package day15_forLoop;

import java.util.Scanner;

public class C04_AradakiSayilarinToplami {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        Bitis degeri baslangic degerinden kucuk olsa da kod calismali

        Scanner scanner = new Scanner(System.in);
        System.out.print("Baslangic degerini girin: ");
        int baslangic = scanner.nextInt();
        System.out.print("Bitis degerini girin: ");
        int bitis = scanner.nextInt();

        int sonuc = 0;

        if (baslangic<bitis) {
            for (int i = baslangic; i <= bitis; i++) {
                sonuc += i;

            }
        }
        else  {
            for (int i = bitis; i <= baslangic; i++) {
                sonuc += i;
            }
        }
        System.out.println("aradaki sayilarin toplami:   " + sonuc);
    }
}
