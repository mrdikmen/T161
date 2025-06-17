package day50_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C06_CheckedException {
    public static void main(String[] args) throws FileNotFoundException {

        /*
            Checked Exception kodu yazarken
            Java' nin kontrol edip farkına varabildigi exception turleridir.

            Java yazdigimiz kodlar icerisinde
            compile time' da bir exception riski gorurse
            altini kirmizi cizer ve bizden cozum bekler

            cozum iki turlu olabilir

            1-try catch kullanarak
            exception' i handle edebilir
            ve exception olustugunda NORMAL calismaya devam etmesini saglayabiliriz.

            2- Eger exception' i kontrol altina almak istemiyorsaniz
                sadece kodu calisir hale gelmesi icin
                kirmizi cizgiyi kaldirmak istiyorsaniz
                Java' ya sorumlulugu aldiginizi beyan etmelisiniz.

                Bunun icin method signature' ina muhtemel exception class ismini yazmalisiniz

                signature' a "throws FileNotFoundException" yazmak
                "bu method' da throws FileNotFoundException olusma riski var" demektir.

                signature' a bunu eklemenin 2 faydasi var
                    -Java' ya sorumlulugu aldigimizi soyleriz
                    -Bu class' i sonradan kullanacak kisiler
                        veya parent edinecek class' lar bu riskin farkina varmis olurlar
         */


        //String str)45;    //CTE required type: String     Provided:int

        //
        //
        // List<String> isimler=new List<>();
        //'list' is abstract; cannot be instantiated
        int[] arr1={3,4,5};
        //arr1={5,6,7,8};   //Array initializer is not allowed here

        //Java kodlari ile txt dosyalarindaki bilgilere ulasabiliriz.

        //Java ile txt veya excel gibi dosyalara ulasmak icin
        //FileInputStream class' i kullanilir

        String dosyaYolu ="src/day50_exceptions/deneme.txt";
        FileInputStream fileInputStream= new FileInputStream(dosyaYolu);
        //Unhandled exception: java.io.FileNotFoundException


    }
}
