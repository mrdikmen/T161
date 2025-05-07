package day15_forLoop;

import java.util.Scanner;

public class C07_FaktoryelHesabi {
    public static void main(String[] args) {

        // Kullanicidan 17’den kucuk bir pozitif tamsayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        // faktoryel degerini asagidaki gibi yazdirin
        // Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen 17' den kucuk pozitif bir tam sayi girin:  ");
        int girilensayi = scanner.nextInt();

        int faktoryel = 1;

        System.out.print(girilensayi + "! = ");

        for (int i = girilensayi; i >=1 ; i--) {
            faktoryel *=i;
            System.out.print(i);
            if (i>1) System.out.print("*");

        }
        System.out.println( " = " + faktoryel);


    }
}
