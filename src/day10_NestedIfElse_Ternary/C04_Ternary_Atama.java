package day10_NestedIfElse_Ternary;

import java.util.Scanner;

public class C04_Ternary_Atama {
    public static void main(String[] args) {

        //kullanicidan bir sayi alin
        //sayi 100' den buyukse degerini 10 azaltin
        //sayi 100' den buyuk degilse degerini 2 katina cikartin

        Scanner scanner =new Scanner(System.in);
        System.out.println("Pozitif tam sayi girin.");

        int sayi = scanner.nextInt();

        if (sayi>100) {
            sayi-=10;

        }else {
            sayi*=2;
        }
        System.out.println("if: " + sayi);


        sayi = sayi > 100 ? sayi-10 : sayi * 2; //ternary

        System.out.println("turnery: " + sayi);



    }
}
