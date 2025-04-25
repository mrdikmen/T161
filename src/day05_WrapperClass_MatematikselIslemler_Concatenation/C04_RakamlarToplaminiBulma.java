package day05_WrapperClass_MatematikselIslemler_Concatenation;

import java.util.Scanner;

public class C04_RakamlarToplaminiBulma {
    public static void main(String[] args) {


        //kullanicidan 3 basamakli bir pozitif tam sayi alip girilen sayinin rakamlar toplamini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen 3 basamakli pozitif bir tam sayi giriniz: ");

        int sayi = scanner.nextInt();  //234

        int rakam = 0;
        int rakamlarToplami = 0;

        rakam = sayi % 10;
        rakamlarToplami = rakamlarToplami + rakam;

        sayi = sayi / 10; //sayi artik 2 basamakli


        rakam = sayi % 10;
        rakamlarToplami = rakamlarToplami + rakam;

        sayi = sayi / 10;   //sayi artik 1 basamakli
        rakamlarToplami = rakamlarToplami + sayi;


        System.out.println("sayilarin toplami:  " + rakamlarToplami );





    }
}
