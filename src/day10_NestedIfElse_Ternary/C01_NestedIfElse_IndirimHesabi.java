package day10_NestedIfElse_Ternary;

import java.util.Scanner;

public class C01_NestedIfElse_IndirimHesabi {
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

        //if (adet > 10){
        ///  else if (adet>0){



    }
}

