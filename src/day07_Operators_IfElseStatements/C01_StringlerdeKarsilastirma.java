package day07_Operators_IfElseStatements;

public class C01_StringlerdeKarsilastirma {
    public static void main(String[] args) {


        String s1 = "Ali";
        String s2 = "Ali";
        String s3 = "A" + "l" + "i";
        String s4 = "A";
        String s5 = "li";
        String s6 = s4+s5;  // Ali
        String s7 = new String("Ali");

        System.out.println( s1 == s2 ); // Ali == Ali ==>
        System.out.println( s1 == s3 ); // Ali == Ali ==>
        System.out.println( s1 == s6 ); // Ali == Ali ==>
        System.out.println( s1 == s7 ); // Ali == Ali ==>
        System.out.println( s1 == "Ali" ); // Ali == Ali ==>

        /*
        SIMDILIK ==' i Stringl'leri karsilastirmak icin kullanmayacagiz.

        == hem metin degerlerine hem de referansa bakar
        bu sebeple metinler ayni olsa bile bazi karsilastirmalarda "false" verir.

        eger iki String'in metin olarak ayni olup olmadigini kontrol etmek istersek equals() kullanmaliyiz

        equals() sadece metinlere bakar, metinler ayni ise true,
                                        metinler farkli ise false verir.

        farkli karakterler kullaniminda veya kucuk/buyuk harf farkliliklarinda sonuc false olur
       */

        System.out.println("======================");
        System.out.println(s1.equals(s2));      //true
        System.out.println(s1.equals(s3));      //true
        System.out.println(s1.equals(s6));      //true
        System.out.println(s1.equals(s7));      //true
        System.out.println(s1.equals("Ali"));   //true

        System.out.println(s1.equals("ali"));   //false
        System.out.println(s1.equals("aLi"));   //false
        System.out.println(s1.equals("ali "));  //false

    }
}
