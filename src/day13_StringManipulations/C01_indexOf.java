package day13_StringManipulations;

import java.util.Scanner;

public class C01_indexOf {
    public static void main(String[] args) {

        /*
        verilen str' da aranan bir char veya metnin
        hangi index' te oldugunu bilgisini getirir.
        eger aranan char veya metnin ilkinin index' ini getirir.
         */
        String str = "Java cok guzel";

        System.out.println(str.contains("cok"));    //true
        System.out.println(str.startsWith("cok"));    //false
        System.out.println(str.endsWith("cok"));    //false
        System.out.println(str.equals("cok"));    //false

        //peki bu cok nerede?

        System.out.println(str.indexOf("cok")); //5

        //"cok" kelimesi str icinde 5. harften sonra

        System.out.println(str.indexOf('a'));   //ilk buldugu 'a' yi getirir.

        System.out.println(str.indexOf('a'));  //1

        str = "Ali topu at, at Ali at";

        System.out.println(str.indexOf("at"));  //9
        System.out.println(str.indexOf("Ali"));  //0
        System.out.println(str.indexOf('a'));  //9

        System.out.println(str.indexOf("k"));   //indexOf() bize int bir sonuc getirir.
        //eger aranan metin veya char yoksa -1 sonucunu verir.

        System.out.println(str.contains("k")); //false

        //contains() false getirmesi ile, indexOf()' un -1 getirmesi ayni anlama gelir.


        //kullanicidan bir metin isteyin
        //metnin Java icerip icermedigini indexOf()' dan faydalanarak yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir metin girin: ");

        String metin = scanner.nextLine();

        if (metin.indexOf("java") != -1) {
            System.out.println("yazilan metin java iceriyor");
        } else System.out.println("yazilan metin java icermiyor");


    }
}
