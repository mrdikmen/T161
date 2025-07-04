package day42_inheritance;

public class C06_Child extends C05_Parent{


    int childInt=67;
    String chilcString="Java bir tane";

    public static void main(String[] args) {

        /*
        Child class' da olusturulan bir obje
        otomatik olarak parent class' daki
        TUM OZELLIKLERE sahip olur.

        Bir obje' ye class' daki instance variable'lar
        ve degerlerinin bir kopyasini alip yapistirma
        gorevi Constructor' dadir.

        Yani child class' daki objenin
        parent class' daki ozelliklere sahip olmasi icin
        Child class constructor' i ile birlikte
        parent class constructor'i da CALISMALIDIR.

        Bunun icin Java
        extends keyword kullanan class' lardaki
        her consturctor' in ilk satirina gizli bir
        super() constructor call koymustur

         */

        C06_Child child1=new C06_Child();

        System.out.println(child1.childInt);
        System.out.println(child1.chilcString);
        System.out.println(child1.parentInt);
        System.out.println(child1.parentStr);



    }

}
