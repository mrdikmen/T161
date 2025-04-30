package day10_NestedIfElse_Ternary;

import java.util.Scanner;

public class C05_TerneryVsIfElse {
    public static void main(String[] args) {
        // Kullanicidan uc basamakli pozitif bir tamsayi isteyin
        // sayi 500 veya daha buyukse rakamlar toplamini hesaplayip yazdirin
        // sayi 500'den kucukse sayinin 10'lar basamagindaki rakamin karesini yazdirin

        /*
        sayinin 500' den buyuk olup olmadigini ternary ile ayirt edebiliriz.
        ANCAAAAAKK sayinin rakamlar toplamini bulmak ve ya
        10' lar basamagindaki rakami bulup karesini almak
        tek satirda basitce yazabilecegimiz kodlar olmadigindan
        bu gorevde ternary KULLANILAMAZ
         */

        Scanner scanner =new Scanner(System.in);
        System.out.println("3 Basamakli Pozitif tam sayi girin.");

        int sayi = scanner.nextInt();
        int rakam = 0;
        int rakamlarToplami = 0;


        if (sayi>500) //sayi 500' den buyukse
        {
            rakam = sayi % 10;
            rakamlarToplami += rakam;
            sayi /= 10;

            rakam = sayi % 10;
            rakamlarToplami += rakam;
            sayi /= 10;

            rakam = sayi % 10;
            rakamlarToplami += rakam;
            sayi /= 10;
            System.out.println("girilen sayinin rakamlar toplami: " + rakamlarToplami);


        }
        else //sayi 500' den buyuk degilse
        {
            //birler basamagindan kurtulalim
            sayi /= 10;

            rakam = sayi % 10;
            System.out.println("10'lar basamagindaki rakamin karesi: " + rakam*rakam);

        }


    }
}
