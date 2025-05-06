package day14_StringManipulations;

import java.util.Scanner;

public class C01_ReplaceFirst {
    public static void main(String[] args) {


        String str = "java candir, selenium heyecan";

        System.out.println(str.replace("a", "A"));  //jAvA cAndir, selenium heyecAn

        //sadece ilk "a" harfini "A" yapin

        System.out.println(str.replaceFirst("a","A")); //jAva candir, selenium heyecan

        //System.out.println(str.replaceFirst('a', 'A')); //char cannot be converted
        //parametre olarak char data turunden degerler kabul eder
        //ANCAAAAKK replaceFirst () char kabul etmez

        //kullanicidan 1 metin isteyin
        //girilen metinde rakam varsa ilk rakam yerine "*" yazdirin
        //Ornek:input : Java 84512
        //output : Java *4512



        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        //Regex (Regular Expressions)

        System.out.println (metin.replaceFirst("\\d","*")); //sad12 ==>sad*2

        //girilen metinde ilk space yerine "X" yazdirin

        System.out.println(metin.replaceFirst("\\s" , "X"));    //asdXasd
    }
}
