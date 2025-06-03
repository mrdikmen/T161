package day31_ForEachLoop;

public class C01_ForEachLoop {
    public static void main(String[] args) {

        int[] arr = {3, 5, 7, 1, 2, 5, 8, 1};

        //arr' deki tum elemanlarin toplamini yazdirin.

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];

        }
        System.out.println("For Loop ile elementlerin toplamı: " + toplam);
        //For Loop ile elementlerin toplamı: 32

        //for each loop "bize arr' deki tum int'leri getir" mantigi ile calisir
        toplam = 0;
        for (int each : arr) {
            toplam += each;

        }
        System.out.println("For Each Loop ile elementlerin toplami: " + toplam);
        //For Each Loop ile elementlerin toplami: 32

        //arr' deki tum elementleri yan yana yazdirin.

        for (int each:arr){
            System.out.print(each+" ");
            //3 5 7 1 2 5 8 1
        }


    }
}
