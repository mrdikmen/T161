package day05_WrapperClass_MatematikselIslemler_Concatenation;

import java.util.Scanner;

public class C05_RakamlarToplaminiBulma_Odev {
    public static void main(String[] args) {
        // kullanicidan 3 basamakli bir pozitif tam sayi alip girilen sayinin rakamlar toplamini
        // asagidaki sekilde yazdirin.

        // "Girilen 245 sayisinin rakamlar toplami : 11"


        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen 3 basamakli pozitif bir tam sayi giriniz: ");

        int sayi = scanner.nextInt();  //234


        int rakam = 0;
        int rakamlarToplami = 0;
        int sayi1 = sayi % 10;


        rakam = sayi % 10;
        rakamlarToplami = rakamlarToplami + rakam;

        sayi = sayi / 10; //sayi artik 2 basamakli



        rakam = sayi % 10;
        rakamlarToplami = rakamlarToplami + rakam;

        sayi = sayi / 10;   //sayi artik 1 basamakli
        rakamlarToplami = rakamlarToplami + sayi;


        System.out.println("Girilen " + sayi + rakam + sayi1 + " sayisinin rakamlar toplami: " + rakamlarToplami );

    }
}
