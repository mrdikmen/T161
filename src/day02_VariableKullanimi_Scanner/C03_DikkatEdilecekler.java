package day02_VariableKullanimi_Scanner;

public class C03_DikkatEdilecekler {


    public static void main(String[] args) {
        //1
        //variable 1 kere deklare edilir ama istediğimiz kadar yeniden değer ataması yapabiliriz.

        int b = 20;

        //int b = 2;  //b zaten tanımlandı

        b=25;

        b = b + 10;

        //2
        // eşitliğin sol tarafında sadece variable olabilir.

        int sayi = 20; // olur
        //10 = int sayi // olmaz

        // sayi = sayi + 10 //olur
        //sayi + 10 = sayi // olmaz


        //3
        //değer atamadan sadece deklarasyon yapılabilir
        // ancak değer atamadığımız variable' yi kullanamayız


        int yas; // ???
        // System.out.println( yas ); ???
        //variable 'yas' a değer atanmamış!!

        yas=35; // değer atadık

        System.out.println(yas); // artık variable'yi kullanabilir



        //4
        //java da = işaretinin önce sağına bakar ve o işlemi yapar
        // sonra bulduğunu variable' e  atama yapar

    }


}
