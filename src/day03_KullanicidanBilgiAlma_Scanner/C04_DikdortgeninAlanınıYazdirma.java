package day03_KullanicidanBilgiAlma_Scanner;

import java.util.Scanner;

public class C04_DikdortgeninAlanınıYazdirma {

    public static void main(String[] args) {

        //Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, alanini hesaplatma.

        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen dikdortgenin uzun kenarını giriniz...");

        int uzunkenar = scanner.nextInt();

        System.out.println("lutfen dikdortgenin kisa kenarını giriniz...");

        int kisakenar = scanner.nextInt();


        System.out.println("dikdortgenin alani = " + (uzunkenar*kisakenar));

    }
}
