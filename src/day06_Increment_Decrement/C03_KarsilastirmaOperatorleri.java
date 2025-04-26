package day06_Increment_Decrement;

public class C03_KarsilastirmaOperatorleri {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 25;

        System.out.println(a>=b);   //false

        System.out.println(c==a+b); // true

        System.out.println(c != b); //true

        System.out.println(c = b);  //b' nin degerini c' ye atama yapar ve c' yi yazdirir c=15

        //eger karsilastirma operatorleri char degerler icin kullanilirsa;
        //ASCII table' deki degerlerine gore karsilastirir.
        //kucuk harfler her zaman buyuk harflerden daha buyuk degerlere sahiptir.
        //ASCII degerlerini bilmesek bile "<" icin daha once ">" icin daha sonra gibi dusunebiliriz.

        System.out.println('f' > 'c');  // 102>99   true

        System.out.println('B' < 'z');  // 66<125   true

        //büyük harfler 65' ten kucuk harfler 97' den baslar.

        System.out.println('q' != 'q'); //false

        System.out.println('m' < 't');  //m, t' den daha once mi?    true










    }
}
