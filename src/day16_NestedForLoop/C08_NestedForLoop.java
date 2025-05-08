package day16_NestedForLoop;

import java.util.Scanner;

public class C08_NestedForLoop {

    public static void main(String[] args) {

        /*
        kullanicidan satir sayisini alip asagidaki sekli cizdirin
        orn satir = 5
                *
                * *
                * * *
                * * * *
                * * * * *
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sekildeki satir sayisini giriniz...");
        int satirSayisi = scanner.nextInt();

        System.out.println("");
        for (int i = 1; i <= satirSayisi; i++) {          //outer loop , kac satir olacagini belirler
            for (int j = 1; j<=i ; j++) {      //inner loop , her satirda kac eleman olacagini belirler
                System.out.print("* ");
            }
            System.out.println();


        }
    }
}
