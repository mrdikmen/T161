package day07_Operators_IfElseStatements;

import java.util.Scanner;
import java.util.SortedMap;

public class C07_DikkatEdilecekler {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir tam sayi alin,
        //         sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        //         5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen sayi giriniz...");

        int sayi = scanner.nextInt();

        /*
        if body'si birden fazla satira sahip olabilir.
         */

        /*
        if body'sinde suslu parantez kullanilmayabilir.
        ANCAK suslu parantez kullanilmazsa if body' si olarak ilk ; e kadar olan kısım alınır.
        ilk ; sonrasi if ile baglantili olmaz.

        YANI eger if body' si tek satirsa suslu parantez kullanilmasa da olur.
        ama if body' si birden fazla satirdan olusuyorsa MUTLAKA {} kullanilmalidir.
         */


        if (sayi % 3 == 0 ) {
            System.out.println("3'e bolunur");
        }

        if (sayi % 5 == 0 ) {
            System.out.println("5'e bolunur");
        }



    }
}
