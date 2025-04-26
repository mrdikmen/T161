package day06_Increment_Decrement;

public class C01_PreIncrement_postIncrement {
    public static void main(String[] args) {

        /*
        Eger bulundugu satirda yalniz ise;
        a++ ile ++a arasinda fark yoktur.
         */

        int a = 10;

        int b = 20;

        a++;
        System.out.println("11. satirda a: " + a); //11. satirda a : 11

        ++a;
        System.out.println("13. satirda a: " + a); // 14. satirda a : 12

        b--;
        System.out.println("16. satirda a: " + b); //16. satirda b : 19

    }
}
