package day03_KullanicidanBilgiAlma_Scanner;



import java.util.Scanner;

public class C01_ScannerKullanimi {
    public static void main(String[] args) {

        /*kullanicidan bir tam sayi alın
         ve girilen tam sayinin 10 katini aşağıdaki satira yazdirin
         orn : input = 5   ouput = girilen sayinin 10 katı :50
        */

        //1. adim : bir scanner objesi oluşturun

        Scanner scanner = new Scanner(System.in);

        //2. adim kullaniciya ne istediğini yazdirin

        System.out.println("Lutfen bir tam sayi giriniz...");

        /*3. adim : oluşturdugumuz scanner objesini kullanarak
          kullanicinin girdiği bilgiyi konsoldan alip
          olusturdugumuz uygun bir variable'a kaydedelim
         */


        int girilenSayi = scanner.nextInt();

        // orn: input =  ouput = girilen sayinin 10 kati : 50

        System.out.println("girilen sayinin 10 kati : " + girilenSayi*10);



    }
}
