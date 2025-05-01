package Day11_SwitchStatements_stringManipulation;

import java.util.Scanner;

public class C02_HaftaIcı_HaftaSonu_Yazdirma {
    public static void main(String[] args) {

        // Kullanicidan gun numarasi girmesini isteyin
        // girilen sayiya gore 1- pazartesi ..... 7 - pazar olacak sekilde
        // istenen gunun hafta ici veya hafta sonu oldugunu yazdirin
        // kullanici 1-7 arasindaki sayilar disinda bir deger girerse
        // hata mesaji verin.

        Scanner scanner = new Scanner (System.in);

        System.out.println("Gun numarasi girin...");

        int gunNo = scanner.nextInt();

        switch (gunNo) {

            case 1:

            case 2:


            case 3:


            case 4:


            case 5:
                System.out.println("hafta ici");
                break;

            case 6:

            case 7:
                System.out.println("hafta sonu");
                break;

            default:
                System.out.println("Hatali giris. 1-7 arasinda bir rakam girmelisiniz.");

        }
    }
}
