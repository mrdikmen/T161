package day36_StaticBlocks_passByValue;

public class C04_PassByValue {

    public static void main(String[] args) {


        String str ="Java Candir";

        System.out.println(str.toLowerCase());      //java candir

        System.out.println(str);                    //Java Candir

        //degisikligi kalici yapmak istersek
        str=str.toLowerCase();
        System.out.println(str);                    //java candir
    }
}
