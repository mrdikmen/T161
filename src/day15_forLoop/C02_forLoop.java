package day15_forLoop;

import java.util.Scanner;

public class C02_forLoop {
    public static void main(String[] args) {

        // 2 basamakli 5 ile bolunebilen sayilarin toplamini yazidirin.

        int sonuc = 0;
        for (int i = 10; i <100 ; i+=5) {
            sonuc +=i;

        }
        System.out.println(sonuc);      //945




        // kullanicidan baslangic ve bitis degerlerini alip
        // sinirlar ve aralarindaki sayilardan 5 ile bolunebilenleri toplayin
        // ve toplami yazdirin

        Scanner scanner = new Scanner (System.in);
        System.out.print("Baslangic degerini girin: ");
        int baslangic = scanner.nextInt();
        System.out.print("Bitis degerini girin: ");
        int bitis = scanner.nextInt();

        sonuc = 0;
        for (int i = baslangic; i <= bitis; i++) {
            if(i % 5 == 0) {
                sonuc += i;


            }
        } System.out.println("verilen sayilar arasindaki 5 ile bolunebilenlerinin toplami: " + sonuc);

    }
}
