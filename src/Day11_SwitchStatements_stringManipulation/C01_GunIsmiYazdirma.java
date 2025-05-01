package Day11_SwitchStatements_stringManipulation;

import java.util.Scanner;

public class C01_GunIsmiYazdirma {

    public static void main(String[] args) {

        //Kullanicidan gün numarasi isteyin.
        //girilen sayiya göre 1-Pazartesi ..... 7-Pazar olacak sekilde gun ismini yazdirin
        //Kullanici 1-7 arasi rakam girmesini isteyin,
        //bunlardan farkli girerse hata mesajı verin.

        Scanner scanner = new Scanner (System.in);

        System.out.println("Gun numarasi girin...");

        int gunNo = scanner.nextInt();

        if (gunNo == 1) System.out.println("Pazartesi");
        else if (gunNo == 2) System.out.println("Sali");
        else if (gunNo == 3) System.out.println("Carsamba");
        else if (gunNo == 4) System.out.println("Persembe");
        else if (gunNo == 5) System.out.println("Cuma");
        else if (gunNo == 6) System.out.println("Cumartesi");
        else if (gunNo == 7) System.out.println("Pazar");
        else System.out.println("Hatali giris. 1-7 arasinda bir rakam girmelisiniz.");

        //Ayni islemi Switch ile yapalim

        switch (gunNo) { //gun no' ya gore calisacak kodu degistir

            case 1: //gun no.' nun 1 olmasi durumunda calisacak kod
                System.out.println("pazartesi");    //case' ler tek bir satir olmak zorunda degil
                //menu yapisi olusturup case' lerde daha kompleks kodlar yazabiliriz.
                break;
            case 2: //gun no.' nun 2 olmasi durumunda calisacak kod
                System.out.println("sali");
                break;

            case 3: //gun no.' nun 3 olmasi durumunda calisacak kod'
                System.out.println("carsamba");
                break;

            case 4: //gun no.' nun 4 olmasi durumunda calisacak kod
                System.out.println("persembe");
                break;

            case 5: //gun no.' nun 5 olmasi durumunda calisacak kod
                System.out.println("cuma");
                break;

            case 6: //gun no.' nun 6 olmasi durumunda calisacak kod
                System.out.println("cumartesi");
                break;

            case 7: //gun no.' nun 7 olmasi durumunda calisacak kod
                System.out.println("pazar");
                break;

            default: //hatali giris durumunda calisacak kod
                System.out.println("Hatali giris. 1-7 arasinda bir rakam girmelisiniz.");
                break;
        }

        /*
        Switch parantezine yazilan variable' ın
        aldigi degere gore uygun case' den calismaya baslar
        break gorurse durur, gormezse switch statement' in sonuna kadar calisir.
         */
    }
}
