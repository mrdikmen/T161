package day10_NestedIfElse_Ternary;

import java.util.Scanner;

public class C03_Ternary_Operatoru {
    public static void main(String[] args) {

        // kullanicidan bir sayi alin
        // sayi cift ise "cift sayi",
        // sayi cift sayi degilse "tek sayi" yazdirin,

        Scanner scanner =new Scanner(System.in);
        System.out.println("Pozitif sayi girin.");

        int sayi = scanner.nextInt();

        if (sayi % 2 == 0){
            System.out.println("cift sayi");

        }
        else {
            System.out.println("tek sayi");
        }

        //ternary operatoru if else ile yapilan basit islemleri
        // daha kisa ve daha basit sekilde yazmamiza imkan tanir.

        System.out.println(sayi % 2 ==0 ? "Cift sayi" : "Tek sayi");
    }
}
