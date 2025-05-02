package day12_StringManipulations;

public class C02_Substring_2Parametre {
    public static void main(String[] args) {

        String str = "Java cok guzeldir";

        System.out.println(str.substring(1,3)); //beginIndex , EnIndex ,//av

        /*
        Java' da genel kural:
        baslangic index'leri inclusive (dahil)
        bitis index'leri exclusive (exclusive)

        str.substring(1,3) yazildiginda
        1. index' deki karakter dahil, 3. index' deki karakter haric olarak
        1-3 arasindaki karakteri verir.


        ya da
        str.substring(1,3)
        1. index' den basla, 2 harf yazdir.
        */


        System.out.println(str.substring(5,9)); //cok

        //str' nin bastan 4 karakterini yazdirin.

        System.out.println(str.substring(0,4));     //ilk 4 harf //java

        System.out.println(str.charAt(3)); //a

        System.out.println(str.substring(3)); //a Guzeldir

        //sadece 2. kelime
        System.out.println(str.substring(5,8)); //cok

        //bastan 2. harf ile sondan 2. harf dahil arasindaki metni yazdirin
        System.out.println(str.substring(1, str.length() - 1)); //ava cok guzeldi

        //bastan 5. harf ile sondan 5. harf dahil arasindaki karakterleri yazdirin

        System.out.println(str.substring(4,str.length()-5));    //" cok guz"


        System.out.println(str.substring(0, 1));    //J
        System.out.println(str.substring(1, 2));    //a
        System.out.println(str.substring(2, 3));    //v
        System.out.println(str.substring(3, 4));    //a

        System.out.println(str.charAt(0));  //J
        /*
        str.charAt(0) ve str.substring(0,1)
        ikisi de 0. index' deki J harfini verir

        aralarindaki fark:
        charAt() bir char getirdigi icin bu method' dan sonra String methodlari calismaz,
        str.charAt() bir String getidriginden bu method' dan sonra String methodlari calisir.
        */

        //7. karakteri buyuk harf olarak yazdirin
        //"Java cok guzeldir" ==> o

        System.out.println(str.substring(6, 7).toUpperCase()); //O

        System.out.println(str.toUpperCase().charAt(6));    //O

        System.out.println(str.substring(3,3));     //hiclik

        //baslangic ve bitir index' i ayni olursa,
        //sonuc HICLIK olur

        //System.out.println(str.substring(5,2)); //StringIndexOutOfBoundsException: begin 5, end 2, length 17 hata
    }
}
