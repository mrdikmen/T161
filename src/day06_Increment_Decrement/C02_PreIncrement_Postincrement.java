package day06_Increment_Decrement;

public class C02_PreIncrement_Postincrement {
    public static void main(String[] args) {

        // 1. ihtimal ayni satirda yazdirma islemi olursa;

        int a = 20;
        int b = 40;

        System.out.println(a++); //20

        System.out.println("13. satirda a: " + a/*artik 21 oldu*/); //21

        a=20;
        System.out.println(++a); //21
        System.out.println("16. satirda a= " + a); //21

        b=40;

        System.out.println(b--); //40
        System.out.println("21. satirda b: " + b/*artik 39 oldu*/); //39

        b=40;

        System.out.println(--b);   //39
        System.out.println("26. satirda b:" + b);   //39


        //2. ihtimal ayni satirda atama islemi olursa;

        a=20;
        int c = a++;    // once a' nin degerini c' ye ata. sonra a' nin degerini 1 arttır.

        System.out.println("35. satirda a: "+a + " c: " + c);   //a:20  c:21

        a=20;
        c=++a;      // once a' nin degerini 1 arttır.   sonra a' nin degerini c' ye ata.

        System.out.println("40. satirda a: "+a + " c: " + c);   //a:21  c:21

        b=40;
        c=b--;      // once b' nin degerini c' ye ata.  sonra b' nin degerini 1 azaltır.

        System.out.println("45. satirda b: " + b + "c: " + c);  //b:39  c: 40

        b=40;
        c=--b;      // once b' nin degerini 1 azalt.   sonra b' nin degerini c' ye ata.

        System.out.println("50. satirda b: " + b + "c: " + c);  //b:39  c:39

        //3. ihtimal ayni satirda matematiksel bir islem olursa;

        a=20;
        c=2 * a++ -3;   //once matematiksel islem 2*a-3 sonra a'yi 1 arttir

        System.out.println("57. satirda a: " + a + "c: " + c);  //a:21  c:37

        a=20;
        c=++a + 20;     // once a'yi 1 arttir sonra matematiksel islem a(a artik 21 oldu)+20

        System.out.println("62. satirda a: " + a + "c: " + c); //a:21   c:41

        b=40;
        c=3* (b-- -2);
        System.out.println("66. satirda b: " + b + "c: " + c); //b:39   c:114

        b=40;
        c=2* --b + 3;

        System.out.println("71. satirda b: " + b + "c: " + c); //b:39   c:81




    }
}
