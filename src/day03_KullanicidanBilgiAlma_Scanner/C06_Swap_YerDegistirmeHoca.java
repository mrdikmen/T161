package day03_KullanicidanBilgiAlma_Scanner;

import java.util.Scanner;

public class C06_Swap_YerDegistirmeHoca {
    public static void main(String[] args) {

        // Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ilk sayıyı giriniz...");

        int sayi1 = scanner.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz...");

        int sayi2 = scanner.nextInt();

        int temp = 0;

        temp = sayi2;

        sayi2 = sayi1;

        sayi1 = temp;

        System.out.println("Sayilari Degistirdim" + "\nilk sayi = " + sayi1 + "\nikinci sayi = " + sayi2);


    }
}
