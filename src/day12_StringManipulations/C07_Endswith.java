package day12_StringManipulations;

public class C07_Endswith {
    public static void main(String[] args) {
        String str = "Java ahhh java";

        System.out.println(str.endsWith("java"));  //str' nin son 4 karakteri "java" mi?    //true
        System.out.println(str.endsWith("Java"));  //str' nin son 4 karakteri "java" mi?    //false
        System.out.println(str.endsWith("ava"));  //str' nin son 3 karakteri "ava" mi?      //true
        System.out.println(str.endsWith(" ava"));  //str' nin son 4 karakteri " ava" mi?    //false
        System.out.println(str.endsWith(""));  //str' nin son karakteri "" mi?              //true
        System.out.println(str.endsWith("Java ahhh java"));  //str' nin son 14 karakteri "Java ahhh java" mi?  //true


        System.out.println("--------------------------------");

        System.out.println(str.equals("Java ahhh java"));       //true
        System.out.println(str.equalsIgnoreCase("Java ahhh java"));       //true
        System.out.println(str.contains("Java ahhh java")); //true
        System.out.println(str.startsWith("Java ahhh java")); //true
        System.out.println(str.endsWith("Java ahhh java")); //true

        System.out.println("--------------------------------");

        //"Java ahhh java"
        System.out.println(str.equals("Java"));  //eşit mi     //false
        System.out.println(str.equalsIgnoreCase("Java")); //kucuk harf buyuk harf farketmeksizin   //false
        System.out.println(str.contains("Java")); //içerir mi //true
        System.out.println(str.startsWith("Java")); //basliyor mu //true
        System.out.println(str.endsWith("Java")); //bitiyor mu //false


    }
}
