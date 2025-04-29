package day09_IfElseIfStatements_NestedIfElse;

import java.util.Scanner;

public class C01_SayiAnalizi {
    public static void main(String[] args) {

        // kullanicidan pozitif bir tamsayi isteyin
        // kullanici
        // negatif sayi girerse uyarin
        // tek basamakli bir sayi girerse "girdiginiz sayi rakam"
        // kullanici 10-99 arasinda (sinirlar dahil) sayi girerse "iki basamakli sayi"
        // kullanici 100-999 arasinda (sinirlar dahil) sayi girerse "uc basamakli sayi"
        // kullanici 1000 veya daha buyuk sayi girerse "cok buyuk sayi" yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pozitif bir tam sayi girin...");

        int sayi = scanner.nextInt();

        if (sayi <0 )
            System.out.println("pozitif sayi girmelisiniz.");

        else if (sayi <=9)
            System.out.println("rakam girdiniz.");
        else if (sayi<100)
            System.out.println("2 basamakli sayi girdiniz.");
        else if (sayi<1000)
            System.out.println("3 basamakli sayi girdiniz.");
        else
            System.out.println(" Cok buyuk sayi girdiniz.");

    }
}

