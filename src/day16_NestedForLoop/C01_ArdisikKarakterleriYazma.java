package day16_NestedForLoop;

import java.util.Scanner;

public class C01_ArdisikKarakterleriYazma {
    public static void main(String[] args) {


        //  Kullanicidan bir karakter girmesini isteyin.
        //  Kullanici kucuk harf girerse girilen harf ve sonraki 5 karakteri yazdirin.
        //  Kullanici buyuk harf girerse girilen harf ve sonraki 4 karakteri yazdirin.
        //  Kullanici baska bir karakter girerse girilen karakter ve sonraki 3 karakteri yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz....");

        char chr = scanner.next().charAt(0);

        if (Character.isLowerCase(chr)) {
            //Kucuk harf kismi
            for (char i = chr; i <= chr + 5; i++) {
                System.out.print(i + "");
            }

        } else if (Character.isUpperCase(chr)) {
            //buyuk harf kismi
            for (char i = chr; i <= chr + 4; i++) {
                System.out.print(i + "");
            }
        } else {
            for (char i = chr; i <= chr + 3; i++) {
                System.out.print(i + "");
                //Baska bir karakter kismi
            }
        }
    }}