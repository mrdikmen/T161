package day21_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_DoWhileLoop_SayilariToplama {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        //         Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
        //         toplam 500'u gecerse veya kullanici 0' a basarsa
        //         kac adet pozitif tam sayi girdigini
        //         ve bunlarin toplaminin kac oldugunu yazdirin
        //         Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
        //         bu negatif sayiyi, sayi adedine ve toplama eklemeyin
        Scanner scanner = new Scanner(System.in);
        int sayi = 0;
        int sayilarinToplami = 0;
        int sayac = 0;


        /*
        Eger dongumuz kullanicidan alinan bir degere bagli iken
        donguden once biz o variable' a yanlis deger atamasi yaparsak
        loop body' si hic devreye girmeyebilir

        bu durumun onune gecmemiz icin
        Java Do While Loop olusturmustur.

        Do While Loop' ta kontol yapilmadan once
        loop body bir kez calisir
        boylece biz yanlis deger versek bile kullanicidan deger alinmis olur
         */
        do {

            System.out.println("toplanmak uzere pozitif tam sayi giriniz, \nbitirmek icin '0' a basiniz...");
            sayi = scanner.nextInt();

            if (sayi>0){
                sayilarinToplami += sayi;
                sayac++;


            } else if (sayi<0) {
                System.out.println("negatif bir sayi giremezsiniz");
            }

        }while (sayilarinToplami<=500 && sayi !=0);
        System.out.println("Girilen " + sayac + " adet pozitif sayinin toplami: " + sayilarinToplami);

    }
}
