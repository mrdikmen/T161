package day03_KullanicidanBilgiAlma_Scanner;

import java.util.Scanner;

public class C03_KullaniciBilgileriniYazdirma {
    public static void main(String[] args) {

        //kullanicidan ismini soy ismini ve yasini alip asagidaki formatta yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz: ");

        String isim = scanner.nextLine();

        System.out.println("Lutfen Soy isminizi giriniz: ");

        String soyisim = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz: ");

        int yas = scanner.nextInt();

        System.out.println(

                "İsminiz : " + isim +
                        "\nSoy isminiz : " + soyisim +
                        "\nyasiniz : " + yas +
                        "\nKaydiniz basari ile tanimlanmistir"


        );
    }
}
