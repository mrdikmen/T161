package day09_IfElseIfStatements_NestedIfElse;

import java.util.Scanner;

public class C03_indirimliFiyatHesaplama {
    public static void main(String[] args) {

        // Kullaniciya kac adet urun aldigini ve bir urunun fiyatini sorun
        //        eger kullanici 100 adet veya daha fazla aldiysa %25,
        //        eger 50 adet veya daha fazla aldiysa %20
        //        eger 10 adet veya daha fazla aldiysa %10 indirim yaparak
        //        odeyecegi toplam miktari yazdirin
        //        Kullanici negatif bir fiyat veya adet girerse uyari verin

        Scanner scanner=new Scanner(System.in);
        System.out.println("kac adet urun aldiniz?");
        int adet = scanner.nextInt();
        System.out.println("Urun fiyati nedir?");

        double fiyat = scanner.nextDouble();
        double indirimsizfiyat = adet*fiyat;

        if (adet>100)  System.out.println("%25 indirimli Odeyeceginiz fiyat: " + indirimsizfiyat*75/100);
        else if (adet>= 50) System.out.println("%20 indirimli Odeyeceginiz fiyat: " + indirimsizfiyat*80/100);
        else if (adet>= 10) System.out.println("%10 indirimli Odeyeceginiz fiyat: " + indirimsizfiyat*90/100);
        else if (adet>=0 ) System.out.println("indirimsiz Odeyeceginiz fiyat: " + indirimsizfiyat);
        else System.out.println("girilen adet hatali");


    }
}
