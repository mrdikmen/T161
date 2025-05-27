package day26_Arrays;

import java.util.Arrays;

public class C05_Split {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));   //[1, 2, 3, 4, 5]

        String str = "Ali topu at, at Ali at";

        System.out.println(Arrays.toString(str.split("t")));    //[Ali , opu a, , a,  Ali a]


        System.out.println(Arrays.toString(str.split("topu")));    //[Ali ,  at, at Ali at]

        // cumledeki en uzun kelimeyi yazdirin

        str = str.replace(",", "");    //Ali topu at at Ali at

        String[] cumledekiKelimeler = str.split(" ");
        System.out.println(Arrays.toString(cumledekiKelimeler));    //[Ali, topu, at, at, Ali, at]

        System.out.println("=============ODEV1=============");
        //ODEV: bu array' deki en uzun kelimeyi bulun?

        String[] isimler = str.split(" ");
        String enUzun = isimler[0];

        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].length() > enUzun.length()) {
                enUzun = isimler[i];
            }
        }
        System.out.println(enUzun);
        System.out.println("=========================");
        //[Ali, topu, at, at, Ali, at]
        System.out.println(Arrays.toString(str.split(""))); //[A, l, i,  , t, o, p, u,  , a, t,  , a, t,  , A, l, i,  , a, t]


        System.out.println("============ODEV2==============");
        //ODEV: cumledeki kucuk harfleri dogal siralasak en sonda hangi kucuk harf olur?
/*
        String[] harf = str.split("");
        Arrays.sort(harf);
        System.out.println(Arrays.toString(harf));      //[ ,  ,  ,  ,  , A, A, a, a, a, i, i, l, l, o, p, t, t, t, t, u]
        char sonHarf='z';

        for (char i = 0; i < harf.length; i++) {
            if (harf
        }
  */




    }
}
