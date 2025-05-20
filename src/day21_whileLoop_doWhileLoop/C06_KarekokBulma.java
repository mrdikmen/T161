package day21_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C06_KarekokBulma {
    public static void main(String[] args) {

        // Soru 6- Kullanicidan bir pozitif sayi isteyin,
        //         sayının tam kare olup olmadığını bulunuz,
        //         tamkare ise true değilse false yazdırınız.
        //	Ornek :  input : 16 (4*4) , output: true

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz...");
        int sayi = scanner.nextInt();
        int karekok=1;

        while (karekok*karekok<=sayi){

            if (karekok*karekok==sayi){
                System.out.println(true);
                return;
            }

            karekok++;

        }

        System.out.println("false");

        //ODEV : false yazmasi icin kod eklenecek

    }
}
