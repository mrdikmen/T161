package day25_arrays;

import java.util.Scanner;

public class C07_Odev {

    //Kullaniciya deger alarak String bir Array olusturun
    //String array' deki en uzun ve en kisa ismi yazdirin.

    public static void main(String[] args) {


        String[] isimler=C05_KullaniciyaArrayOlusturtma.kullaniciyaArrayOlusturt();

        String enKisaIsim = isimler[0];
        String enUzunIsim = isimler[0];

        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].length()<enKisaIsim.length()){
                enKisaIsim=isimler[i];
            }
            if (isimler[i].length()>enUzunIsim.length()){
                enUzunIsim=isimler[i];
            }

        }
        System.out.println("Girilen isimlerden en uzunu: " + enUzunIsim);
        System.out.println("Girilen isimlerden en kısası: " + enKisaIsim);
    }
}
