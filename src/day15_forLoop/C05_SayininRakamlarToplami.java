package day15_forLoop;

import java.util.Scanner;

public class C05_SayininRakamlarToplami {
    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini asagidaki gibi yazdirin.
        // input : 1453 output => 1+4+5+3 = 13
        // output :  "Girilen 1453 sayisinin rakamlar toplami : 13"

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen pozitif bir tam sayi girin:  ");
        int sayi = scanner.nextInt();
        int girilensayi = sayi;


        int rakam = 0;
        int rakamlartoplami = 0;

        int basamakSayisi =(girilensayi + "").length();

        for (int i = 1; i <=basamakSayisi ; i++) {
            rakamlartoplami += girilensayi % 10;
            girilensayi /= 10;  // Bir basamak atmak icin sayiyi sifirlayip yeni degeri aldik.

        }


        System.out.println("Girilen " + sayi + " sayisinin rakamlar toplami:  " + rakamlartoplami);

    }
}
