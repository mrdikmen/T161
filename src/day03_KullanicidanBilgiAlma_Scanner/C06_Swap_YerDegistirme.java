package day03_KullanicidanBilgiAlma_Scanner;

import java.util.Scanner;

public class C06_Swap_YerDegistirme {
    public static void main(String[] args) {

        // Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ilk sayıyı giriniz...");

        int ilksayi = scanner.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz...");

        int ikincisayi = scanner.nextInt();

        System.out.println("Sayilari Degistirdim" + "\nilk sayi = " + ikincisayi + "\nikinci sayi = " + ilksayi);


    }
}
