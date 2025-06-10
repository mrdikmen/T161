package day36_StaticBlocks_passByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_CokluYapilardaPassByValue {

    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>(Arrays.asList(5,6,1,4,8));
        elemanlariArtir(sayilar);       //[6, 7, 2, 5, 9]

        System.out.println("main method' da sayilar: " + sayilar);      //[6, 7, 2, 5, 9]


        /*
         EGER methodlar arasi yollanan coklu eleman barindiran
         array veya arrayList gibi bir yapi ise
         elemanlarda yapilan degisiklikleri
         java onemsemez.

         Liste' nin kendisine direkt yeni bir deger
         atamasi yoksa, java bunu kendi listesi
         geri donmus olarak kabul eder.
         */
    }


    //verilen int elemanlara sahip bir listede
    //tum elementleri 1 artırıp,
    //listenin son halini yazdiran bir method olusturun

    public static void elemanlariArtir (List<Integer> liste){

        for (int i = 0; i < liste.size(); i++) {
            liste.set(i,liste.get(i) + 1);


        }
        System.out.println(liste);
    }
}
