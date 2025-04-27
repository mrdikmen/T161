package day07_Operators_IfElseStatements;

import java.util.Scanner;

public class C04_BagimsizIfCumleleri {
    public static void main(String[] args) {

        //kullanicidan 1 tam sayi isteyin
        //girilen sayi cift sayi ise "Cift sayi girdiniz" yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz...");

        int sayi = scanner.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Cift sayi girdiniz...");
        }
            /*
            bagimsiz if cumleleri boolean sarta odaklanmistir.
            boolean sart girilen deger icin true ise "if body" calisir
                         girilen deger icin false ise "if body" calismaz
            if body calismamasi if statement' in calismadigi anlamina gelmez

            bagimsiz if cumleleri adindan da anlasilacagi gibi
            kodun geriye kalanindan BAGIMSIZDIR.
             */

            /*
            girilen tam sayi 5'in kati ise "Sayi 5'e bolunuyor" yazdirin.
             */


        if (sayi % 5 == 0 ) {
            System.out.println("sayi 5' e bolunuyor");
        }

        //sayi 100' den buyukse "buyuk sayi girdiniz" yazdirin.

        if (sayi>100) {
            System.out.println("buyuk sayi girdiniz");


            //sayi 1000' den kucukse "guzel sayi" yazdirin.
            boolean sonuc = sayi<1000;

            if (sonuc) {
                System.out.println("guzel sayi");
            }

            String str="java candir";

            /*if (str) {      //reauired type: boolean    Provided: String
                System.out.println("if parantezinin icinde sadece boolean variable ya da boolean deger olabilir");
            }*/




        }


    }



}

