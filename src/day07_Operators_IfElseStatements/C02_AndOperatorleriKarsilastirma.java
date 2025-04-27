package day07_Operators_IfElseStatements;

public class C02_AndOperatorleriKarsilastirma {
    public static void main(String[] args) {

        /*
        & veya && kullanımını asagidaki nota göre tercih edebiliriz.

        eger sonuc odakli isek ve bir an once sonuca ulasmak istiyorsak "&&";

        eger islem odakli isek ve tum karsilastirmalari mutlaka kontrol etmek istiyorsak "&"
         */
        int a = 10;
        int b = 20;
        boolean sonuc1=true;    //false
        boolean sonuc2=true;    //true
        boolean sonuc3=true;    //false
        boolean genelSonuc =  (sonuc1= a>=b)     &  (sonuc2 = a<b)     &      (sonuc3=a>b-8) ;
        System.out.println( "& sonuc1 : " + sonuc1);    //false
        System.out.println( "& sonuc2 : " + sonuc2);    //true
        System.out.println( "& sonuc3 : " + sonuc3);    //false
        System.out.println( "& genelSonuc : " + genelSonuc);    //false
        boolean sonuc4=true;    //false
        boolean sonuc5=true;
        boolean sonuc6=true;
        boolean genelSonuc3 =  (sonuc4= a>=b)     &&  (sonuc5 = a<b)     &&      (sonuc6=a>b-8) ;
        System.out.println( "&& sonuc4 : " + sonuc4);   //false
        System.out.println( "&& sonuc5 : " + sonuc5);   //true
        System.out.println( "&& sonuc6 : " + sonuc6);   //true
        System.out.println( "&& genelSonuc3 : " + genelSonuc3); //false


    }
}
