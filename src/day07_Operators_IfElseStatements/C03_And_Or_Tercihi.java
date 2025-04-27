package day07_Operators_IfElseStatements;

public class C03_And_Or_Tercihi {
    public static void main(String[] args) {


        /*
        verilen bir degerin,
        verilen bir aralikta olup olmadigi kontrol etmemiz istenirse;
        And (&-&&) kullanilir.
         */

        int sayi = 98;

        //verilen sayi 2 basamakli ise true, degilse false yazdir.

        System.out.println(sayi>=10 & sayi<=99);

        //verilen sayi97'den buyuk ve 212'den kucuk ise true,
        // diger sartlarda false yazdir.

        System.out.println(sayi>97 & sayi<212);

        char karakter = 'K';

        //verilen karakter kucuk harf ise true, degilse false yazdir.

        System.out.println(karakter>='a' & karakter<='z');

        //wrapper class ile de bu soruyu cozebiliriz.
        System.out.println(Character.isLowerCase(karakter));

        /*
        verilen bir degerin verilen aralik disinda olmasi isteniyorsa II kullanilir.
         */

        sayi=54;

        //verilen sayi 2 basamakli pozitif sayi degilse = true;
        // diger sekilde = false yazdirin.

        System.out.println(sayi<10 || sayi>99);

        //verilen karakter buyuk harf ise false
        //buyuk harf degilse true yazdir.
        System.out.println("=================");

        System.out.println(karakter<'A' || karakter>'Z');

        System.out.println(! Character.isUpperCase(karakter));

        System.out.println(! (karakter >='A' && karakter<='Z'));


    }
}
