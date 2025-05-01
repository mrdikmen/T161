package Day11_SwitchStatements_stringManipulation;

import java.util.Scanner;

public class C04_YuzdenKucukPozitifSayiYazdirma {
    public static void main(String[] args) {

        // kullanicidan yuzden kucuk pozitif bir tamsayi isteyin
        // girilen sayiyi yazi ile yazdirin
        // orn input : 17 , output : Onyedi
        // 0-99 arasindaki sayilar disinda sayi yazarsa hata mesaji verin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 100' den kucuk pozitif bir tam sayi giriniz...");
        int rakam = scanner.nextInt();
        String mesaj = "";

        //17 ==>    10'lar basamagi 1 ==> On    ve birler basamagi 7 ==> yedi ====> On Yedi

        int birlerbas = rakam % 10;
        int onlarbas = rakam / 10;

        if (rakam <= 0 || rakam >=100) System.out.println("girilen sayi 100' den kucuk pozitif tam sayi olmali");
            //once hatayi ayikladik

        else   { //burasi iki basamakli pozitif sayilar bolgesi


            //once sayinin onlar basamagini bulup yaziya cevirelim
            switch (onlarbas) {
                case 0:
                    break;
                case 1:
                    System.out.print("on");
                    break;
                case 2:
                    System.out.print("yirmi");
                    break;
                case 3:
                    System.out.print("otuz");
                    break;
                case 4:
                    System.out.print("kırk");
                    break;
                case 5:
                    System.out.print("elli");
                    break;
                case 6:
                    System.out.print("altmis");
                    break;
                case 7:
                    System.out.print("Yetmis");
                    break;
                case 8:
                    System.out.print("Seksen");
                    break;
                case 9:
                    System.out.print("Doksan");

            }

            //sonra birler basamagindaki sayiyi onlar basamaginin yanina ekleyelim


            switch (birlerbas) {

                case 0:
                    break;
                case 1:
                    System.out.print(mesaj + " bir");
                    break;
                case 2:
                    System.out.print(mesaj + " iki");
                    break;
                case 3:
                    System.out.print(mesaj + " uc");
                    break;
                case 4:
                    System.out.print(mesaj + " dort");
                    break;
                case 5:
                    System.out.print(mesaj + " bes");
                    break;
                case 6:
                    System.out.print(mesaj + " alti");
                    break;
                case 7:
                    System.out.print(mesaj + " yedi");
                    break;
                case 8:
                    System.out.print(mesaj + " sekiz");
                    break;
                case 9:
                    System.out.print(mesaj + " dokuz");



            }

        }
        System.out.println(mesaj);

    }
}