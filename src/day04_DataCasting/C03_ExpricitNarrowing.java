package day04_DataCasting;

public class C03_ExpricitNarrowing {
    public static void main(String[] args) {

    /*
     biz java'ya explicit (zorlayarak) casting yapmasini istersek java degeri variable'in data turune uygun
     hale getirmek icin degerini degistirebilir ve data kayiplari olabilir.

     dbl1 = 74.3; => int'a cast edilirse 74 olur ve data kaybi olur.
     int sayi1 = 260 => byte'a cast edilirse 4 olur data baskalasmis olur.
     */

        int sayi1 = 17;
        int sayi2 = 125;
        int sayi3 = 134;
        int sayi4 = 145;
        int sayi5 = 260;
        int sayi6 = 520;
        int sayi7 = 123435;

        byte byt = (byte)sayi1;

        System.out.println("17' nin byte'a cast edilmis hali:" + byt); // 17

        byt = (byte)sayi2;

        System.out.println("125' in byte'a cast edilmis hali:" + byt); // 125

        byt = (byte)sayi3;

        System.out.println("134' nin byte'a cast edilmis hali:" + byt); // -122

        byt = (byte)sayi4;

        System.out.println("145' nin byte'a cast edilmis hali:" + byt); // -111

        byt = (byte)sayi5;

        System.out.println("260' in byte'a cast edilmis hali:" + byt); // 4

        byt = (byte)sayi6;

        System.out.println("520' nin byte'a cast edilmis hali:" + byt); // 8

        byt = (byte)sayi7;

        System.out.println("123435' in byte'a cast edilmis hali:" + byt); // 43
    }
}
