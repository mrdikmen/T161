package day08_IfElseStatements;

import java.util.Scanner;

public class C02_BagimsizIfCumleleriSayacYontemi {
    public static void main(String[] args) {

        //Kullanicidan 1 tam sayi girmesini isteyip
        //asagida verilen 4 şartı kontrol edin ve istenenleri yazdirin




        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 1 tam sayi girin...");

        int sayi = scanner.nextInt();
        int sayac = 0;


        //girilen tam sayi 5'in kati ise "Sayi 5'e bolunuyor" yazdirin.


        if (sayi % 5 == 0) {
            System.out.println("sayi 5' e bolunuyor");
            sayac++;
        }

        //sayi 100' den buyukse "buyuk sayi girdiniz" yazdirin.

        if (sayi > 100) {
            System.out.println("buyuk sayi girdiniz");
            sayac++;
        }


        //sayi 1000' den buyukse "guzel sayi" yazdirin.
        boolean sonuc = sayi > 1000;

        if (sonuc) {
            System.out.println("guzel sayi");
            sayac++;
        }

        //sayi cift sayi ise "Cift sayilari severim" yazdirin.

        if (sayi % 2 == 0) {
            System.out.println("Cift sayilari severim");
            sayac++;
        }


            /*2. yontem: sayac yontemi
            baslangicta sayac variable' ina 0 degerini atadık.
            sona geldigimizde 0,1,2,3,4 olabilir.

            eger sayac sonda 0 ise => hicbir if body'si devreye girmedi demek.
            eger sayac sonda 4 ise => butun if body' leri devreye girdi demek.

            sona geldigimizde sayacin degerine gore kac tane if body' sinin calistigini bulabiliriz.
             */


        if (sayac == 4) {
            System.out.println("bravo");

            //eger 4 kontrolden hicbirinde if body calisip mesaj yazdirilmazsa
            //"Nasil sayi sectin, hicbir sarti saglamiyor" yazdirin.

            if (sayac == 0) {
                System.out.println("Aferim cok guzel sayi secmissin\" yazdirin.");
            }
            //eger 4 kontrolden hepsinde if body calisirsa
            //"Aferim cok guzel sayi secmissin" yazdirin.
        }
    }
}

