package day14_StringManipulations;

import java.util.Scanner;

public class C07_MetniDegistirme {
    public static void main(String[] args) {
        //  Kullanicidan bir String alin,
        //  String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
        //  String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :disappointed: yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();
        int uzunluk =isim.length();

        if (uzunluk % 2 ==0 )
            System.out.println(isim.substring(0,uzunluk/ 2) + ":)" + isim.substring(uzunluk / 2));
            //ismin uzunlugu cift sayi tam ortasina :) ekleyin

        else  System.out.println(isim.substring(0,uzunluk/ 2) + ":)" + isim.substring(uzunluk / 2+1));
        //ismin uzunlugu tek sayi ortasindaki harfi silin ve yerine :( yazdirin
    }
}
