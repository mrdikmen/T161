package day13_StringManipulations;

public class C08_replace {
    public static void main(String[] args) {
        String str = "java candir";

        System.out.println(str.replace('j', 'H'));
        System.out.println(str.replace('a', 'A'));
        System.out.println(str.replace("java", "tava"));
        System.out.println(str.replace("java", "python"));
        System.out.println(str.replace("a", ""));

    }
}
