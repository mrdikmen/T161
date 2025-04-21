package day01_HelloWorld;

import java.util.Scanner;

public class C01_HelloWorld {

    public static void main(String[] args) {

        System.out.println("hello world");
             /* 11 Şubat 2025
                Bu benim Java ile ilk tanışmam.
              */

        Scanner scanner =new Scanner(System.in);
        System.out.println("yazı girin");
        String str1 = scanner.nextLine();
        System.out.println(str1.charAt(1));



    }




}
