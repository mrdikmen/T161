package day29_ArrayList;

import java.util.*;

public class C03_Equals {
    public static void main(String[] args) {


        List<String> liste1=new ArrayList<>(Arrays.asList("Merve","Cennet","Buse","Serpil"));
        List<String> liste2=new ArrayList<>(Arrays.asList("Merve","Serpil","Cennet","Buse"));

        System.out.println(liste1.equals(liste2));      //false

        //equals() her bir index' teki elemanlari karsilastirir
        //tum index' lerdeki elemanlar karsilikli olarak esit ise
        // true dondurur


        //elemanlar ayni ama siralama farkli oldugunda equals()
        //false dondurur.

        //siralamayi duzenlemek istersek
        Collections.sort(liste1);
        Collections.sort(liste2);
        //atama yapmasak da list' lerde yapilan degisiklikler kalici olur.

        System.out.println(liste1); //[Buse, Cennet, Merve, Serpil]
        System.out.println(liste2); //[Buse, Cennet, Merve, Serpil]

        System.out.println(liste1.equals(liste2));  //true


    }
}
