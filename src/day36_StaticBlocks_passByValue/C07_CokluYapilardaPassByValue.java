package day36_StaticBlocks_passByValue;

import java.util.Arrays;
import java.util.List;

public class C07_CokluYapilardaPassByValue {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        arrayiDegistir(arr);    //method' da sayilar array' inin son hali: [1, 2, 3]

        System.out.println("method call' dan sonra main method' da sayilar: " + Arrays.toString(arr));
        //method call' dan sonra main method' da sayilar: [1, 2, 3, 4, 5, 6, 7, 8]

        //method' da array' in elemanlarina degil
        //direkt array' in kendisine atama yapilmis
        //java bunu kabul etmez;
        //o method' da yapilan degisiklik orada kalir.


    }
    //verilen int elemanlari olan bir array' i
    //icinde 1,2,3 oldugu yeni bir array' e donusturup
    //son halini yazdiran bir method olusturun

    public static void arrayiDegistir(int[] sayilar) {

        int[] yeniArr = {1, 2, 3};
        sayilar = yeniArr;
        System.out.println("method' da sayilar array' inin son hali: " + Arrays.toString(sayilar));
    }

}
