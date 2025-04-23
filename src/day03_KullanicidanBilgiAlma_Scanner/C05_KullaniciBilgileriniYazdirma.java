package day03_KullanicidanBilgiAlma_Scanner;

import java.util.Scanner;

public class C05_KullaniciBilgileriniYazdirma {
    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        // girilen bilgiler : J Doe, 44

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");
        char isminIlkHarfi = scanner.nextLine().toUpperCase().charAt(0);

            /*
                Kullanicidan metin değeri alinacaksa;
                scanner.next() veya scanner.nextline() kullanabiliriz.
                ikisi arasinda tek bir fark var:
                       scanner.next()     = Kullanici birden fazla kelime girse de ilk "space" kısmina kadar olani alir,
                       scanner.nextline() = Girilen satirdaki tum harfleri ve kelimeleri alir.

                       EGER kullanicidan TEK BIR karakter alacaksak;
                        scanner.nextchar() olmadigi icin, once scanner.nextline() ile tum metni alip;
                        sonra o metnin ilk harfini charAt(0) ile alabiliriz.

                ONEMLI NOT: Eger kullanicidan birden fazla metin degeri alacaksak;
                            scanner.nextline() ile kullanmak onerilir.
                            Eger ilk degeri scanner.next() ile, sonraki degeri scanner.nextline() ile alırsak;
                            sorun yaşanabilir.
             */
        System.out.println("Lutfen soyisminizi giriniz...");
        String soyisim = scanner.nextLine().toUpperCase();

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();

        System.out.println("Bilgileriniz Kayit Edildi:" + isminIlkHarfi + ". " + soyisim + ", " + yas);



    }
}
