package Day11_SwitchStatements_stringManipulation;

import java.util.Scanner;

public class C03_SayiyiYaziyaCevirme {
    public static void main(String[] args) {

        // kullanicidan bir rakam isteyin
        // girilen rakami yazi ile yazdirin
        // orn input : 7 , output : yedi
        //0-9 arasindaki sayilar disinda sayi yazarsak "hata" mesajı verin

        Scanner scanner = new Scanner (System.in);

        System.out.println("Lutfen Rakam girin...");

        int sayi = scanner.nextInt();

        switch (sayi) {

            case 0:
                System.out.println("Sıfır");
                break;
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("Iki");
                break;
            case 3:
                System.out.println("Uc");
                break;
            case 4:
                System.out.println("Dort");
                break;
            case 5:
                System.out.println("Bes");
                break;
            case 6:
                System.out.println("Alti");
                break;
            case 7:
                System.out.println("Yedi");
                break;
            case 8:
                System.out.println("Sekiz");
                break;
            case 9:
                System.out.println("Dokuz");
                break;

            default:
                System.out.println("Hatali giris. 0-9 arasinda bir rakam girmelisiniz.");
        }
    }
}
