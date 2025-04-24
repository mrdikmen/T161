package day04_DataCasting;

import java.util.Scanner;

public class C05_CharDataTurundeCasting {
    public static void main(String[] args) {



        /*
        char data turu ASCII table'daki kodlari kullanir.
        her bir char karakterinin matematiksel bir karsiligi oldugu icin

        char data turu MATEMATIKSEL ISLEMDE kullanılırsa
        ASCII table'daki sayisal degeri ile isleme girer.
         */
        boolean bl = true;
        char chr = 'a';
        byte byt = 24;
        short shrt = 23;
        int sayiInt = 30;
        long lng = 40;
        float flt = 3.5F;
        double dbl = 4.5;
        String str = "Java Candir";


        /*
        chr = bl;
        chr = (char)bl;

        chr = str;
        chr = (char) str;


        chr = byt;
        chr = shrt;
        chr = sayiInt;
        chr = lng;
        chr = flt;
        chr = dbl;

        byt = (byte)chr;
        shrt = (short) chr;
        sayiInt = chr;
        lng = chr;
        flt = chr;
        dbl = chr;
         */

        char chr1 = 'a';
        char chr2 = 'b';

        System.out.println(chr1 + chr2); //97 + 98 => 195

        System.out.println('H'>'C'); //72 > 67 => true

        System.out.println('b'>'B'); // 98 > 66 => true


        // verilen bir char karakterden sonraki 3 karakteri yazdirin
        // orn: input = 'm' ise output = n o p olacak


        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen bir karakter girin: ");

        char chr5 =  scanner.next().charAt(0);



        System.out.println((char) (chr5+1));
        System.out.println((char) (chr5+2));
        System.out.println((char) (chr5+3));

        /*
        char chr5 = scanner.next().charAt(0);

        System.out.println("Girdiğiniz harf: " + chr5);
        System.out.println("Sonraki harfler: " + (char) (chr5 + 1) + ", "
                + (char) (chr5 + 2) + ", "
                + (char) (chr5 + 3));
                */

    }
}
