package day05_WrapperClass_MatematikselIslemler_Concatenation;

public class C01_WrapperClasses {
    public static void main(String[] args) {

        /*
        primitive data turleri;
            boolean,  char,         byte,   short,  int,        long,   float,  double
            Boolean,  Character,    Byte,   Short,  Integer,    Long,   Float,  Double  (wrapper class'lar)

         */

        /*

        1-ayni data turundeki primitive ve Wrapper Class'dan
         olusturulan variable'lari birbirine direkt atayabiliriz.
         */

        int sayiInt = 10;
        Integer sayiWrapperInt = sayiInt;


        sayiWrapperInt = 40;
        sayiInt = sayiWrapperInt;

        //2- Wrapper Class'lar non-primitive olduklarindan hazir method'lari vardir.

        //String olarak verilen bir sayiyi, matematiksel islem yapabileceğgimiz
        //dataya cevirme.

        String fiyat1 = "9.94";
        String fiyat2= "21.74";
        String fiyat3= "14.86";

        //String olarak verilen yukaridaki 3 fiyatin ortalamasiniz bulun

        System.out.println((fiyat1 + fiyat2 + fiyat3));  //9.9421.7414.86 (metin(string) olduğu icin yan yana yazdirdi)

        double fyt1dob = Double.parseDouble(fiyat1);
        double fyt2dob = Double.parseDouble(fiyat2);
        double fyt3dob = Double.parseDouble(fiyat3);

        //System.out.println("ortalama fiyat: " + (fyt1dob + fyt2dob + fyt3dob) / 3); //15.513333333333334


        //int data turunun alabilecegi en buyuk degeri yazdirin.


        System.out.println(Integer.MAX_VALUE);  //2147483647

        System.out.println(Short.MIN_VALUE);    //-32768

        System.out.println(Double.MAX_VALUE);   //1.7976931348623157E308

        char chr = 'M';

        //verilen chr degeri buyuk harf ise true, degilse false yazdirin.

        System.out.println(Character.isUpperCase (chr));    //true

        //verilen chr degeri sayi ise true, degilse false yazdirin.

        System.out.println(Character.isDigit(chr));         //false

        //verilen chr degeri harf ise true, degilse false yazdirin.

        System.out.println(Character.isAlphabetic(chr));    //true
        System.out.println(Character.isLetter(chr));        //true

        String str = "Java Candir";

        //str'i buyuk harflerle yazdirin.

        System.out.println(str.toUpperCase());

        chr = 'c';
        //chr variable'ının degerini buyuk harf olarak yazdirin

        System.out.println(Character.toUpperCase(chr));     //C

    }
}
