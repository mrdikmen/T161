package day05_WrapperClass_MatematikselIslemler_Concatenation;

import java.util.Scanner;

public class C03_Modulus {
    public static void main(String[] args) {


        //kullanicidan bir tam sayi alin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tam sayi giriniz: ");

        int girilensayi = scanner.nextInt();


        // eger bize sayinin cift mi tek mi oldugu sorulursa;


        System.out.println(girilensayi % 2);

        //bu islemin sonucunu kontrol ederiz. sonuc = 0 ise sayi cifttir.
        //sonuc = 0 degilse sayi tektir.

        // eger girilen sayi 5' in kati olup olmadigi sorulursa,

        System.out.println(girilensayi % 5);

        //islemin sonucunu kontrol ederiz.
        //sonuc 0 ise sayi 5' in katidir, degilse sayi 5' in kati degildir.

        //eger girilen sayinin 1'ler basamagini bulmamiz istenirse;

        System.out.println(girilensayi % 10);

        //sayi / 10 ile         sayi % 10 ayni sey degildir.


        int sayi = 245;

        System.out.println(sayi % 10); //5

        System.out.println(sayi / 10); // 24

        System.out.println(sayi);

        sayi = sayi / 10;

        System.out.println("sayinin yeni hali: " + sayi);

    }
}
