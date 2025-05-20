package day21_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C02_SayilariToplama {
    public static void main(String[] args) {


        // Soru 2- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        //         Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
        //         toplam 500'u gecerse veya kullanici 0' a basarsa
        //         kac adet pozitif tam sayi girdigini
        //         ve bunlarin toplaminin kac oldugunu yazdirin
        //         Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
        //         bu negatif sayiyi, sayi adedine ve toplama eklemeyin

/*
    while loop' da dikkat etmemiz gereken 2 onemli konu var
    1- dongunun devamini saglayan deger (bu soruda sayi ve sayilarin toplami)
    dongu icerisinde degistirilmezse sonsuz Loop olusur.

    2- eger dongu devamini saglayan degiskene
    donguden once biz deger atamasi yapiyorsak
    verdigimiz degerin dongunun calismasini saglayacak bir deger olmasini saglamaliyiz
    aksi takdirde dongu calisir ama loop body' si hic devreye girmeden loop biter.
 */
        Scanner scanner = new Scanner(System.in);
        int sayi = 10;
        int sayilarinToplami = 0;
        int sayac = 0;

        while(sayilarinToplami<500 && sayi !=0){       //calismasi icin gerekli sarti veriyoruz

            System.out.println("toplanmak uzere pozitif tam sayi giriniz, \nbitirmek icin '0' a basiniz...");
            sayi = scanner.nextInt();       //burada kullanicidan yeni bir sayi aldik
            //alinan sayiyi yeniden gozden gecirip
            //durumuna gore uygun islemi yapmaliyiz.

            if (sayi>0){
                sayilarinToplami += sayi;
                sayac++;


            } else if (sayi<0) {
                System.out.println("negatif bir sayi giremezsiniz");
            }
        }
        System.out.println("Girilen " + sayac + " adet pozitif sayinin toplami: " + sayilarinToplami);

    }
}





