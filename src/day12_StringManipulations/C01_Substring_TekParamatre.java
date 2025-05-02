package day12_StringManipulations;

public class C01_Substring_TekParamatre {
    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.charAt(3)); //a<<<<

        System.out.println(str.substring(3)); //a Candir

        System.out.println(str.charAt(str.length() - 3)); //d

        System.out.println(str.substring(str.length() - 3)); //dir

        System.out.println(str.charAt(str.length()-5)); //a
        System.out.println(str.substring(str.length()-5)); //andir

        //str' nin sondan 4 karakterini yazdirin
        System.out.println(str.substring(str.length()-4));

        //charAt() ve substring() farkli davranabilir

        System.out.println(str.charAt(str.length() - 1)); //r
        System.out.println(str.substring(str.length() - 1)); //r

        System.out.println(str.substring(str.length())); //boş bir satır (hiclik)

        System.out.println("Java");


    }
}
