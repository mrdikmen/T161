package day12_StringManipulations;

public class C03_Concat {
    public static void main(String[] args) {


        String s1 = "java";
        String s2 = " ";
        String s3 = "guzeldir";
        String s4 = " ";

        int sayi1 =4;
        int sayi2 =5;

        //sadece variable' lari kullanarak asagidaki metinleri yazdirin.

        //java guzeldir

        System.out.println(s1 + s2 + s3);

        System.out.println(s1.concat(s2).concat(s3));

        //java 54

        System.out.println(s1 + s2 + sayi2 + sayi1);

        System.out.println();
    }
}
