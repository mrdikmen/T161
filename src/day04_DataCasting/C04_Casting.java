package day04_DataCasting;

import java.util.Scanner;

public class C04_Casting {
    public static void main(String[] args) {

        //kullanicidan 2 tam sayi alin
        // 1. sayiyi 2. sayiya bolup bolme islemini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen 2 adet tam sayi girin: " );

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();



        System.out.println("Sonuc: " + (sayi1 / sayi2));

        // java 2 tam sayiyi bolerse sonucu da tam sayi verir.


        // girilen 2 tam sayiyi bolup sonucu ondalikli olarak yazdirin.

        double sonuc2 = sayi1/sayi2;

        System.out.println("double sonuc: " + sonuc2);


        double sonuc3 = (double)sayi1/sayi2;

        System.out.println("sayi1'i double'a cast edersek sonuc: " + sonuc3);

    }
}
