package day38_LocalDate_Time;

import java.time.LocalTime;

public class C03_IslemSuresiBulma {
    public static void main(String[] args) {

        //asagidaki islem icin islem suresini yazdirin.


        //1. yontem:
        //loop' dan once ve sonra yerel saat olusturup farklarini bulalim
        LocalTime baslangic = LocalTime.now();

        String str = "";
        for (int i = 0; i < 100000; i++) {
            str += i;

        }
        LocalTime bitis = LocalTime.now();
        System.out.println("Baslangic saati: " + baslangic);
        System.out.println("Bitis saati: " + bitis);

        System.out.println("saniye olarak fark: " + (bitis.getSecond() - baslangic.getSecond()));  //saniye olarak fark: 4
        //bu yontem saglikli calismayabilir
        //dakika ya da saat gecisi oldugunda -55 saniye gibi bir fark verebilir.



        //2. yontem:
        //gunun baslangicina gore saniyeler arasindaki farki bulabiliriz.

        //gece yarisi 00:00' dan kodun calistigi zamana kadar gecen saniye miktarini verir.

        System.out.println(baslangic.toSecondOfDay());
        System.out.println(bitis.toSecondOfDay());
        System.out.println("calisma suresi saniye olarak: "+(bitis.toSecondOfDay()-baslangic.toSecondOfDay())); //4

        //3. yontem:
        //eger zaman farkini daha hassas olarak bulmak istersek
        //nano saniye farkina bakabiliriz.

        System.out.println("calisma suresi nano saniye olarak: "+(bitis.toNanoOfDay()-baslangic.toNanoOfDay()));
    }
}
