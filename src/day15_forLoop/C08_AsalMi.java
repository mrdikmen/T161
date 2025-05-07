package day15_forLoop;

import javax.swing.*;
import java.util.Scanner;

public class C08_AsalMi {
    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi isteyip,
        // sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen pozitif bir tam sayi girin:  ");
        int girilensayi = scanner.nextInt();

        for (int i = 2; i < girilensayi ; i++) {
            if (girilensayi % i == 0) {
                System.out.println("Asal degil, " + i + "'ye bolunuyor.");
                break;      //ilk bölüneni bulur ve durur
            } if (i== girilensayi -1) {
                System.out.println(girilensayi + " Asal sayidir.");
                break;     // bölünen sayi yoksa asal sayi olarak kabul eder
            }

        }}}
