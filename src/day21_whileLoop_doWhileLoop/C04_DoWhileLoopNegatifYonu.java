package day21_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoopNegatifYonu {
    public static void main(String[] args) {

        /*
        Do While Loop avantaji:
            Loop body en az bir kere calismasidir
        Do While Loop dezavantaji:
            Loop body en az bir kere calismasidir

            ornek asagidaki gorevde
            kullanici 0 girdiginde loop body hic calismamasi gerekirken
            while kontolunden once do body calistigi icin
            yapmamasi gerektigi halde 0 yazdirdi.
         */


        // Soru 4- Kullanicidan alinan pozitif tamsayidan baslayarak
        // 1'e kadar olan sayilari aralarinda 1 bosluk olacak sekilde
        // yan yana yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi=scanner.nextInt();


        do {
            System.out.print(sayi + " " );
            sayi--;

        }while (sayi>1);
    }
}
