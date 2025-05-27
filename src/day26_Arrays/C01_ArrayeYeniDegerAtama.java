package day26_Arrays;

import java.util.Arrays;

public class C01_ArrayeYeniDegerAtama {
    public static void main(String[] args) {


        //Olusturulan bir Array' in uzunlugu
        //sonradan eleman ekleyerek veya silerek DEGISTIRILEMEZ

        int[] sayilar ={3,4,5};

        //4. eleman olarak 10 ekleyin

        //sayilar[3]=10;
        //ArrayIndexOutOfBoundsException


        //AMMA array' e tamamen yeni bir deger atamasi yapabiliriz.

        //var olan bir array' e yeni liste seklinde atama YAPILAMAZ
        //sayilar={5,6,7,8};

        //ya once array' i baska bir isimle olusturup sonra atama yapabiliriz.

        int[] yeniArr={5,6,7,8};
        sayilar=yeniArr;
        System.out.println(Arrays.toString(sayilar));   //[5, 6, 7, 8]

        //ya da icinde default degerlerin oldugu array' i direkt sayilar'a atama yapabiliriz.
        sayilar=new int[6];
        System.out.println(Arrays.toString(sayilar));   //[0, 0, 0, 0, 0, 0]



    }
}
