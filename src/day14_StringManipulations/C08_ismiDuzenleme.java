package day14_StringManipulations;

import java.util.Scanner;

public class C08_ismiDuzenleme {
    public static void main(String[] args) {

        // Kullanicidan ismini alin
        // Kullanici 3 isimli olsa da
        // isimlerin ilk harfi buyuk harf, kalanlar * olacak sekilde yazdirin
        // Ornek input  : ali mert can  , aysel yilmaz ,  Kemal
        //       output : A** M*** C**  , A**** Y***** ,  K****
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();

        //once ismi inceleyip kac kelimeden olustugunu bulmaliyiz

        int ilkSpace = isim.indexOf(" ");
        int ikinciSpace = isim.indexOf(" ", ilkSpace + 1);

        if (ilkSpace == -1)   //isim tek kelimedir
            System.out.println(isim.substring(0, 1).toUpperCase() +
                    isim.substring(1).replaceAll("\\w", "*"));

        else if (ikinciSpace == -1)  //isim iki kelime //&& ikinciSpace >=0
            System.out.println(isim.substring(0, 1).toUpperCase() +
                    isim.substring(1, ilkSpace).replaceAll("\\w", "*") +
                    " " + isim.substring(ilkSpace + 1, ilkSpace + 2).toUpperCase()+
                    isim.substring(ilkSpace + 2).replaceAll("\\w", "*"));

        else    //isim iki kelimeden fazla

            System.out.println(isim.substring(0, 1).toUpperCase() + //ilk ismin ilk harfi
                    isim.substring(1, ilkSpace).replaceAll("\\w", "*") +
                    " " + isim.substring(ilkSpace + 1, ilkSpace + 2).toUpperCase()+     //ikinci ismin ilk harfi
                    isim.substring(ilkSpace + 2,ikinciSpace).replaceAll("\\w", "*")
                    +" " +isim.substring(ilkSpace + 1, ilkSpace + 2).toUpperCase() +
                    isim.substring(ilkSpace + 2,ikinciSpace).replaceAll("\\w", "*"  ));
    }
}
