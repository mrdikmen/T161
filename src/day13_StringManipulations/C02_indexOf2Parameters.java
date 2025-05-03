package day13_StringManipulations;

public class C02_indexOf2Parameters {
    public static void main(String[] args) {

        String str = "Ali topu at, at Ali at";

        //metinde 2 adet Ali gectigini biliyorsak
        //2. Ali' nin index' ini bulun

        int ilkAliIndexi = str.indexOf("Ali"); //0

        System.out.println("Ali' nin ilk kullanim index' i: " +ilkAliIndexi);   //0

        int ikinciAliIndexi = str.indexOf("Ali",ilkAliIndexi);
        System.out.println("Ali' nin ikinci kullanim index' i: " +ilkAliIndexi +1);   //0




        System.out.println("Ali' nin ikinci kullanim index' i: " + ikinciAliIndexi);    //16

        //str' da 3 adet "at" gectigini biliyorsak
        //3. "at"' nin index'lerini bulun

        int ilkatindexi = str.indexOf("at");
        int ikincikatindexi = str.indexOf("at",ilkatindexi + 1);
        int ucuncuatindexi = str.indexOf("at",ikincikatindexi + 1); //20

        System.out.println("at kelimesinin 3. kullanim indexi: " + ucuncuatindexi);

        //str' da top kelimesinin 1. , 2. ve 3. kullanimlarinin index' lerini yazdirin.

        int ilktopIndexi = str.indexOf("top");
        int ikincitopIndexi = str.indexOf("top", ilktopIndexi + 1);
        int ucuncutopIndexi = str.indexOf("top", ikincitopIndexi + 1);
        System.out.println("top kelimesinin 1. kullanim indexi: " + ilktopIndexi );     //4
        System.out.println("top kelimesinin 2. kullanim indexi: " + ikincitopIndexi );  //-1
        System.out.println("top kelimesinin 3. kullanim indexi: " + ucuncutopIndexi );  //4



    }
}
