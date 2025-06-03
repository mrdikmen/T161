package day31_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_OrtakElemanlariBulma {
    public static void main(String[] args) {

        //Verilen iki array’in elementlerini karsilastirip,
        //ikisinde ortak olan elementleri
        //ayri bir liste olarak veren bir program yazin.

        String[] arr1 = {"a", "y", "i", "w", "k", "l"};
        String[] arr2 = {"a", "k", "t", "y", "a", "l"};

        List<String> ortakElemanlarListesi = new ArrayList<>();

        for (String each1 : arr1) {
            for (String each2 : arr2) {

                if (each1.equals(each2) && !ortakElemanlarListesi.contains(each1)){
                    ortakElemanlarListesi.add(each1);
                }
            }
        }
        System.out.println("Ortak Elemanlar: " + ortakElemanlarListesi);
        //Ortak Elemanlar: [a, y, k, l]
    }
}
