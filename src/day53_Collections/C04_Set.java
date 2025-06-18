package day53_Collections;

import java.util.HashSet;
import java.util.Set;

public class C04_Set {

    public static void main(String[] args) {


        //matematikteki kume gibidir.
        //her elemandan SADECE bir tane bulunur.
        //index desteklemez

        Set<String> isimler=new HashSet();

        isimler.add("Ali");
        isimler.add("Veli");
        isimler.add("Can");
        System.out.println(isimler);    //[Can, Veli, Ali]

        isimler.add("Kemal");
        //ismin nereye eklenecegini bilemeyiz
        //Set index kullanmaz ve siralamayi onemsemez
        System.out.println(isimler);    //[Can, Veli, Kemal, Ali]

        isimler.add("Veli");
        isimler.add("Can");
        //eski "Veli" ve "Can" ı siler yenilerini ekler
        System.out.println(isimler);

        //Sorun yok gibi duruyor
        //hocam bu projenin github bağlantısını kesmek istiyorum çünkü github' ı şuradan gönderiyorum
        //github.com daki hesabına gidip oradki repoyu silersen biter


    }
}
