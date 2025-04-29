package day09_IfElseIfStatements_NestedIfElse;

import java.util.Scanner;

public class C09_CokluDegiskenOdev {
    public static void main(String[] args) {
        // Kullanicidan aldigi urun adedini ve indirimsiz birim fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        //                        az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        //                        az alirsa %10 indirim yapin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen urun adedini girin...");
        int adet = scanner.nextInt();

        System.out.println("Lutfen urun birim fiyatini girin...");
        double fiyat = scanner.nextDouble();


        System.out.println("Musteri kartiniz var mi? E:evet , H:Hayir");
        char kart = scanner.next().toUpperCase().charAt(0);
        double indirimsizToplamFiyat = adet * fiyat;

        //Ana degisken alinan urun miktari?

        if (adet > 10) {
            //musteri karti olanlar bolgesi
            if (kart=='E')
                System.out.println("%20 indirimli Odeyeceginiz fiyat: " + indirimsizToplamFiyat * 80 / 100);
            else if (kart =='H')
                System.out.println("%15 indirimli Odeyeceginiz fiyat: " + indirimsizToplamFiyat * 85 / 100);
            else System.out.println("kart var mi sorusuna girilen deger hatali...");
        }

        //Musteri karti olmayanlar bolgesi

        else if (adet <= 10) {
            if (kart == 'E')
                System.out.println("%15 indirimli Odeyeceginiz fiyat: " + indirimsizToplamFiyat * 85 / 100);
            else if (kart =='H')
                System.out.println("%10 indirimli Odeyeceginiz fiyat: " + indirimsizToplamFiyat * 90 / 100);
            else System.out.println("kart var mi sorusuna girilen deger hatali...");
        }

        {

        }
    }
}