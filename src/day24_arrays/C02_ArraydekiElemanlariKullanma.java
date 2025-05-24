package day24_arrays;

import java.util.Arrays;

public class C02_ArraydekiElemanlariKullanma {
    public static void main(String[] args) {


        int[] sayilar={3,7,9,12,54,16,89};

        //sayilar array' indeki ilk sayi olan 3' u yazdirin

        System.out.println(sayilar[0]); //3

        //sayilar array' indeki 9'u 29 olarak update edin

        sayilar[2]=29; //9 artik 29 oldu
        System.out.println(sayilar[2]);

        //array' deki tum elemanlari yan yana yazdirin

        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(sayilar[i]+" ");
        }


        System.out.println();

        //{3,7,9,12,54,16}
        //sayilar array' ine yeni bir eleman eklemek istiyoruz
        //7. index' e 20 degerini ekleyin

        //sayilar[7]=20;      //ArrayIndexOutOfBoundsException YAZILAMAZ

        //array' in uzunlugu sonradan degistirilemez.
        //bir array' e sonradan eleman ekleyemeyiz.
        //veya var olan bir elemanı silemeyiz.

        //Array' i yazdirin
        System.out.println(sayilar);    //[I@35f983a6

        //bir array' i direkt olarak yazdirmak istersek
        //java array' in referansini yazdirir.

        //array' i yazdiirmak icin Arrays Class' indan hazir method kullanırız.
        System.out.println(Arrays.toString(sayilar));   //[3, 7, 29, 12, 54, 16, 89]


    }
}
