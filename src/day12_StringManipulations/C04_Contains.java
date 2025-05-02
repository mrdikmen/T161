package day12_StringManipulations;

public class C04_Contains {
    public static void main(String[] args) {
        String str = "Java ogrenen pisman olmaz";

        System.out.println(str.contains("a"));  //true
        System.out.println(str.contains("a ")); //true
        System.out.println(str.contains("j    o")); //false
        System.out.println(str.contains("Java og")); //true
        System.out.println(str.contains("java og")); //false





    }
}
