package day31_ForEachLoop;

public class C02_KarelerinToplami {

    public static void main(String[] args) {


        //Verilen int array’deki her elementin karelerini alip,
        //karelerinin toplamini yazdiran bir method olusturun.

        int[] sayilar={1,0,1,0,1};
        karelerinToplami(sayilar);
    }

    public static void karelerinToplami(int[] arr) {
        int toplam = 0;


        for (int each : arr) {
            toplam += each * each;

        }
        System.out.println("Array' deki elementlerin kareleri toplami: " + toplam);
        //Array' deki elementlerin kareleri toplami: 3


    }


}
