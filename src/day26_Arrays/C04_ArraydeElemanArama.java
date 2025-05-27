package day26_Arrays;

import java.util.Arrays;

public class C04_ArraydeElemanArama {
    public static void main(String[] args) {


        int[] arr={5,1,8,4,12,-2,7};

        //array'de bir elemanin var olup olmadigini binarySearch() ile kontrol edebiliriz.

        System.out.println(Arrays.binarySearch(arr, 5));    //-7
        System.out.println(Arrays.binarySearch(arr, 1));    //1
        System.out.println(Arrays.binarySearch(arr, 8));    //-8
        System.out.println(Arrays.binarySearch(arr, 4));    //3
        System.out.println(Arrays.binarySearch(arr, 12));   //-8
        System.out.println(Arrays.binarySearch(arr, -2));   //-1
        System.out.println(Arrays.binarySearch(arr, 7));    //6

        /*
        binarySearch() elemanlarin indexini verir.
        ancak binarySearch() un dogru calismasi icin
        once siralamanin yapilmis olmasi gerekir

        siralama yapilmadan binarySearch() kullanilirsa
        SONUCUN dogru olup olmadigini ONGOREMEYIZ

         */
        System.out.println("=================================");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));   //[-2, 1, 4, 5, 7, 8, 12]
        System.out.println(Arrays.binarySearch(arr, 5));    //3
        System.out.println(Arrays.binarySearch(arr, 1));    //1
        System.out.println(Arrays.binarySearch(arr, 8));    //5
        System.out.println(Arrays.binarySearch(arr, 4));    //2
        System.out.println(Arrays.binarySearch(arr, 12));   //6
        System.out.println(Arrays.binarySearch(arr, -2));   //0
        System.out.println(Arrays.binarySearch(arr, 7));    //4

        System.out.println("=================================");
        /*
        olmayan bir elemani ararsak
        1- olmayan elemanlarin olmadigini belirtmek icinNEGATIF bir deger doner
        2- String' deki indexOf() olmayan her metin icin -1 donuyordu
        ama array' deki binarySearch() bir adim daha ileri giderek
        olmayan eleman array' de olsaydi nerede olacakti bilgisini de bize verir.
        olmayan elemanlar icin - olsaydiKacinciSiradaOlurdu sonucunu veriri
        */

        //[-2, 1, 4, 5, 7, 8, 12]

        System.out.println(Arrays.binarySearch(arr, -9));    //-1
        System.out.println(Arrays.binarySearch(arr, 0));    //-2
        System.out.println(Arrays.binarySearch(arr, 9));    //-7
        System.out.println(Arrays.binarySearch(arr, 10));    //-7
        System.out.println(Arrays.binarySearch(arr, 15));    //-8
        System.out.println(Arrays.binarySearch(arr, 20));    //-8
        System.out.println(Arrays.binarySearch(arr, 50));    //-8

    }
}
