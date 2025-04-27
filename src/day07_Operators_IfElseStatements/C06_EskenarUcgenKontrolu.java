package day07_Operators_IfElseStatements;

import java.io.SequenceInputStream;
import java.util.Scanner;

public class C06_EskenarUcgenKontrolu  {
    public static void main(String[] args) {
        //kullanicidan bir ucgenin kenar uzunluklarini alin
        //kenar uzunluklari birbirine esit ise "Eskenar Ucgen" yazdirin.
        //Not: kenar uzunluklari pozitif olmalidir.

        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen ucgenin kenar uzunluklarini giriniz.");

        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();
        double sayi3 = scanner.nextDouble();


        if (sayi1 == sayi2 && sayi2 == sayi3 && sayi1>0){
            System.out.println("Eskenar ucgen");


        }
    }

}

