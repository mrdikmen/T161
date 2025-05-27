package day26_Arrays;

import java.util.Arrays;

public class C03_ArrayinElemanlariniSiralama {
    public static void main(String[] args) {

        int[] sayilar={3,1,9,6,0,12,67,3,8};

        String [] isimler={"Mert","Murat","Metin","Ali","Yusuf","Mahmut","can"};

        //verilen array' lerin elemanlari kucukten buyuge dıgru siralayin

        Arrays.sort(sayilar);
        Arrays.sort(isimler);

        //atama yapmadigimiz array'lerde method ile yapilan degisiklikler
        //KALICI OLUR (Array, String' den bu yonuyle farklidir)

        System.out.println(Arrays.toString(sayilar));   //[0, 1, 3, 3, 6, 8, 9, 12, 67]
        System.out.println(Arrays.toString(isimler));   //[Ali, Mahmut, Mert, Metin, Murat, Yusuf, can]


    }
}
