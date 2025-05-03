package day13_StringManipulations;

import java.util.Scanner;

public class C03_Soru {
    public static void main(String[] args) {

        //kullanicidan bir cumle ve cumlede aratilacak bir metin isteyin
        //girilen cumle ve metine gore asagidaki 3 sonuctan uygun olani yazdirin
        //1-cumle aranan metni icermiyor
        //2-cumle aranan metni sadece 1 adet iceriyor
        //3-cumle aranan metni 1' den fazla iceriyor

        Scanner scanner = new Scanner(System.in);
        System.out.print("Cumle girin: ");
        String cumle = scanner.nextLine();

        System.out.print("Aranacak metin girin: ");
        String aranacakMetin = scanner.nextLine();

        int sonuc1 = cumle.indexOf(aranacakMetin);
        int sonuc2 = cumle.indexOf(aranacakMetin ,sonuc1 + 1);


        if (sonuc1 == -1) {
            System.out.println("yazilan metin java icermiyor");
        } else if (sonuc1 != -1 && sonuc2 == -1) System.out.println("yazilan metin cumlede sadece 1 kere geciyor");
        else System.out.println("yazilan metin cumleden 1'den fazla iceriyor");
    }
}
