package day02_VariableKullanimi_Scanner;

public class C04_DataTürleri {

    public static void main(String[] args) {

        boolean bl1 = true;
        boolean bl2 = false;

        //boolean b3 = "true"; olmaz çünkü java "" içindeki herşeyi string yani metin olarak kabul eder


        char chr1 = 'e';
        char chr2 = '5';
        char chr3 = '$';
        //char chr4 = 'a '; // too many characters in character literal / sadece tek karaktere izin verir!!!

        char chr5 = ' ';
        //char chr6 = "" kabul etmez '' kabul eder

        byte byt1 = 20;  // 8 bit yer işgal eder
        short shr1 = 20; // 16 bit yer işgal eder
        int sayi1 = 20;  //32 bit yer işgal eder
        long lng1 = 20;  //64 bit yer işgal eder



        float fl1 = 4.6f;
        float fl2 = 3422.333f;


        double dbl1 = 23.444;
        double dbl2 = 24; //24.0 gibi görür

        float fl3 = 20;
        float fl4 = 3;
        System.out.println(fl3/fl4);


        double dbl3 = 20;
        double dbl4 = 3;

        System.out.println(dbl3/dbl4);



        String str1 = "Java Candir";

        System.out.println(str1.toLowerCase()); // java candir // hepsini küçük harf yazar
        System.out.println(str1.toUpperCase()); // JAVA CANDİR // HEPSİNİ BÜYÜK YAZAR

        int sayi8 = 66;


    }

}
