package day36_StaticBlocks_passByValue;

public class C02_StaticOlmayanBlock {




    C02_StaticOlmayanBlock(){
        System.out.println("constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");      //main method calisti

        C02_StaticOlmayanBlock obj1=new C02_StaticOlmayanBlock();
        System.out.println("obj1 olusturma islemi tamamlandi");
        C02_StaticOlmayanBlock obj2=new C02_StaticOlmayanBlock();
        System.out.println("obj2 olusturma islemi tamamlandi");
        C02_StaticOlmayanBlock obj3=new C02_StaticOlmayanBlock();
    }

    public static void method1(){
        System.out.println("method1 calisti");
    }
    static {
        System.out.println("static block calisti");
    }

    {
        System.out.println("static olmayan block calisti");
    }


    /*
        Static block' lar CLASS CALISMAYA BASLAMADAN ONCE yapilacak on hazirliklar icin kullanilir.

        ayni sekilde static olmayan blocklar da
        OBJE OLUSTURULMADAN YAPILMASI GEREKEN on hazirliklar icin kullanilir.
     */
}
