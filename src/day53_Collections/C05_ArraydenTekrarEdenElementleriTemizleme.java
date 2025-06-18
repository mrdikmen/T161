package day53_Collections;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C05_ArraydenTekrarEdenElementleriTemizleme {

    public static void main(String[] args) {

        Integer[] sayilar = {2, 3, 4, 2, 3, 5, 6, 3, 5, 7, 3, 2, 1,};

        //sayilar array'inde tekrar eden sayilari
        //sadece 1 kere yazip
        //sayilar array' ini tekrarsiz hale dondurun.


        Set<Integer> sayilarSeti = new TreeSet<>();

        for (int each : sayilar) {
            sayilarSeti.add(each);
        }
        System.out.println(sayilarSeti);    //[1, 2, 3, 4, 5, 6, 7]

        //array' deki tum elemanlari tekrarsiz olarak bir set halinde elde ettik
        //simdi array' i Set' teki elemanlardan olusan bir hale donusturmeliyiz

        //sayilar=sayilarSeti;    //farkli non-primitive data turleri arasinda atama olmaz
        //sayilar=(Integer[]sayilarSeti.toArray());

        sayilar = new Integer[sayilarSeti.size()];
        //Set index desteklemedigi icin for loop degil for each loop kullanmaliyiz.
        //array' e atama yapmak icin ise index' e ihtiyacimiz var
        //o zaman kendi index' imizi olusturalim

        int index=0;
        for (Integer each:sayilarSeti){
            sayilar[index]=each;
            index++;
        }


        System.out.println("Array' in son hali:" + Arrays.toString(sayilar));   //Array' in son hali:[1, 2, 3, 4, 5, 6, 7]


    }
}
