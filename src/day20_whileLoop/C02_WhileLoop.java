package day20_whileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {

// Kullanicidan pozitif sayilar girmesini isteyin
// kullanici pozitif sayilar girdigi muddetce
// girilen sayilari toplayin
// Kullanici islemi bitirmek istediginde 0 bassin
// Kullanici negatif deger girerse, kullaniciya uyari yazdirin
// girilen negatif sayiyi isleme dahil etmeyin


        Scanner scanner = new Scanner(System.in);


        int girilenSayi = 10;
        int sayilarinToplami = 0;

        while (girilenSayi != 0) {      //buraya loop' un bitmesi icin gerekli sarti degil
            //loop' un devam etmesi icin gerekli sarti yazacagiz.

            System.out.println("lutfen bir tam sayi giriniz");
            girilenSayi=scanner.nextInt();

            if (girilenSayi >0 ){
                sayilarinToplami+=girilenSayi;

            }else if (girilenSayi<0){
                System.out.println("pozitif sayi girmelisiniz");


            }


        }
        System.out.println("girilen pozitif tam sayilarin toplami: " + sayilarinToplami);
    }


}

