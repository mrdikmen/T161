package day36_StaticBlocks_passByValue;

public class C01_StaticBlocks {


    C01_StaticBlocks(){
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {

        System.out.println("main method calisti");


        /*
        Java calismaya main method' tan baslar.

        Constructor obje olusturuldugunda,
        method ise method call oldugunda calisir, yoksa calismaz
         */


        //C01_StaticBlocks obj=new C01_StaticBlocks();      //Constructor calisti
        //method1();        //method calisti

    }

    public static void method1(){
        System.out.println("method calisti");
    }

    static {
        System.out.println("static block calisti");
    /*
        static block'lar class' daki her seyden
        hatta main method' tan bile ONCE

        EGER class calismaya baslamadan ONCE!!!!
        yapilmasi gereken bir ayar
        veya deger atanmasi gereken bir variable varsa
        (pre-condition) bunlari yapabilmek icin static block kullanilir.
     */

    }

    static {
        System.out.println("Alttaki static block calisti");

        /*
        eger birden fazla static block varsa
        tum static block' lar main' den once calisir.

        static block' lar kendi aralarinda
        ustteki once calisacak sekilde siralanir.
         */
    }
}
