package day08_IfElseStatements;

import java.util.Scanner;

public class C01_BagimsizIfCumleleriSonucDegerlendirme {
    public static void main(String[] args) {

        //Kullanicidan 1 tam sayi girmesini isteyip
        //asagida verilen 4 şartı kontrol edin ve istenenleri yazdirin

        //eger 4 kontrolden hicbirinde if body calisip mesaj yazdirilmazsa
        //"Nasil sayi sectin, hicbir sarti saglamiyor" yazdirin.



        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 1 tam sayi girin...");

        int sayi = scanner.nextInt();


        //girilen tam sayi 5'in kati ise "Sayi 5'e bolunuyor" yazdirin.


        if (sayi % 5 == 0 ) {
            System.out.println("sayi 5' e bolunuyor");
        }

        //sayi 100' den buyukse "buyuk sayi girdiniz" yazdirin.

        if (sayi>100) {
            System.out.println("buyuk sayi girdiniz");}


        //sayi 1000' den buyukse "guzel sayi" yazdirin.
        boolean sonuc = sayi>1000;

        if (sonuc) {
            System.out.println("guzel sayi");
        }

        //sayi cift sayi ise "Cift sayilari severim" yazdirin.

        if (sayi % 2 == 0) {
            System.out.println("Cift sayilari severim");
        }
        // tüm şartları da karşılamıyorsa;
        // 1. yontem TUM sartlarin tersini (!) tek bir if ile kontrol edebiliriz.

        if (!(sayi % 5 == 0) && !(sayi > 100) && !sonuc && !(sayi % 2 == 0)) {
            System.out.println("Nasil sayi sectin, hicbir sarti saglamiyor");
        }
    }
}





