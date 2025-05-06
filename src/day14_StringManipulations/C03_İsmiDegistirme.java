package day14_StringManipulations;

import java.util.Scanner;

public class C03_İsmiDegistirme {
    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve 16 haneli kredi karti numarasini alin
        // bilgileri asagidaki gibi yazdirin
        // Girilen isim-soyisim : C** D****,
        // Kredi kart numarasi  : **** **** **** 4567

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();
        System.out.println("Lutfen soyisminizi giriniz...");
        String soyisim = scanner.nextLine();
        System.out.println("16 haneli kredi karti numarasini girin...");
        String kartno = scanner.nextLine();

        System.out.println(
                "Girilen isim-soyisim: " +
                        isim.substring(0, 1).toUpperCase() + //ismin ilk harfini alip buyuk harfe cevirdi
                        isim.substring(1).replaceAll("\\w", "*") + //1. harften itibaren harflerin yerine *
                        " " + //isim ile soyisim arasindaki bosluk
                        soyisim.substring(0, 1).toUpperCase() + //soyismin ilk harfini alip buyuk harfe cevirdi
                        soyisim.substring(1).replaceAll("\\w", "*") + //1. harften itibaren harflerin yerine *
                        ", \n" + //virgul yazdirip alt satira gecmesi icin \n
                        "Kredi kart numarasi  : **** **** **** " +
                        kartno.substring(kartno.length() - 4)
        );


    }
}
