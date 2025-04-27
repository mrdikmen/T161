package day07_Operators_IfElseStatements;

import java.util.Scanner;

public class C05_SinifGecme {
    public static void main(String[] args) {

        // Kullanicidan notunu girmesini isteyin,
        //Notu 50 veya daha buyukse "Sinifi gectiniz" yazdir.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Notunuzu Girin...");

        double sayi = scanner.nextDouble();

        if (sayi >= 50) {
            System.out.println("Sinifi gectiniz...");
        }
    }
}
