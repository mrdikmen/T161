package day09_IfElseIfStatements_NestedIfElse;

import java.util.Scanner;

public class C04_ElseIleBitmezse {
    public static void main(String[] args) {

        /*
        Onemli Notlar:
        1- bir elek sisteminde siralama dogru olmazsa sonuc da hatali olabilir.
        elekleri siralarken en dar olandan baslamaliyiz.
        2- if - else if ..... else cumlelerinde ayni anda else ile birbirine
        baglanan if cumlelerinden sadece biri calisir.
        (bir meyve sadece 1 elekten duser.)
        3- if - else if..... cumleleri else ile bitmek zorunda degildir.
        ANCAK else ile bitmeyen kodlarin
        bazi durumlarda hicbir sonuc uretmeyecegini UNUTMAMALIYIZ.
         */
        // Kullanicidan pozitif bir tamsayi isteyin
        // sayi hem 3 hem 5 ile bolunuyorsa "super",
        // sayi sadece 3 ile bolunuyorsa "3'un kati"
        // sayi sadece 5 ile bolunuyorsa "5'in kati" yazdirin
        // (Not: 3 veya 5'e bolunemeyen sayiler (23 gibi)  bir sey yazdirmaz.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pozitif bir tam sayi giriniz...");

        int sayi = scanner.nextInt();

        if (sayi % 3 ==0 & sayi % 5 ==0) System.out.println("Super");
        else if (sayi % 3 == 0) System.out.println("3'un kati");
        else if (sayi % 5 == 0) System.out.println("5'in kati");



    }
}
