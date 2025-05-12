package day19_methodOlusturma;

import java.util.Scanner;

public class C03_FaktoryelDegerineGoreSonucYazdirma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 17' den kucuk, pozitif bir tam sayi giriniz...");
        int girilensayi = scanner.nextInt();

        int faktoryel = C02_FaktoryelDegeriDondurme.faktoryelDegeri(girilensayi);


        if (faktoryel<1000000) System.out.println("iyi sayi yazmissin :)");
        else System.out.println("bu sayiyi nereden buldun :/");


    }
}
