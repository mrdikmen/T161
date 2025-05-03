package day13_StringManipulations;

import java.util.Scanner;

public class C05_Soru2 {

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

        int ilkIndex = cumle.indexOf(aranacakMetin);
        int sonIndex = cumle.lastIndexOf(aranacakMetin);

        if (ilkIndex == -1 ) System.out.println("cumle aranan metni icermiyor");
        else if (ilkIndex == sonIndex) System.out.println("cumle aranan metni sadece 1 adet iceriyor");
        else System.out.println("cumle aranan metni 1' den fazla iceriyor");


    }
}
