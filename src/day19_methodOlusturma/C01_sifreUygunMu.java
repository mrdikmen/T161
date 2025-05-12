package day19_methodOlusturma;

public class C01_sifreUygunMu {

    //Soru 4 : verilen bir sifre icin
//         asagidaki sartlari kontrol eden
//         ve sifre uygun ise true,
//         sifre uygun degilse false donduren bir method olusturun
//         - ilk harf kucuk harf olmali
//         - son karakter rakam olmali
//         - sifre bosluk icermemeli
//         - uzunlugu en az 10 karakter olmali


    public static void main(String[] args) {

        sifreUygunMu("sanane");

        //17. satir sifreUygunMu() method' unu calistirir.
        //method calisir, verilen "sanane" sifresinin uygun olup olmadigini inceler
        //ve true ya da false dondurur
        //ama sout yapmadigimiz icin konsolda goremeyiz
        //bir degere atamadigimiz icin kodun devamında kullanamayiz.

        System.out.println(sifreUygunMu("naber"));  //false


        //25. satir sifreUygunMu() method' unu calistirir.
        //method calisir, verilen "naber" sifresinin uygun olup olmadigini inceler
        //ve true ya da false dondurur
        //method sout icinde cagirildigi icin konsolda gorebiliriz.
        //ama bir degere atamadigimiz icin kodun devamında kullanamayiz.


        boolean sonuc = sifreUygunMu("cennetbahcesi11");

        //35. satir sifreUygunMu() method' unu calistirir.
        //method calisir, verilen "cennetbahcesi" sifresinin uygun olup olmadigini inceler
        //ve true ya da false dondurur
        //ama sout yapmadigimiz icin konsolda goremeyiz
        //ama bir degere atamadigimiz icin kodun devamında ister yazdirir
        //istersek de farkli amaclar icin kullanabiliriz.

        System.out.println("cennetbahcesi11 icin inceleme sonucu: "+ sonuc);



    }

    public static boolean sifreUygunMu(String sifre) {




        int flag = 10;

        //         - ilk harf kucuk harf olmali

        char ilkHarf = sifre.charAt(0);

        if (!Character.isLowerCase(ilkHarf)) {


            flag = 11;
        }

        //         - son karakter rakam olmali

        char sonKarakter = sifre.charAt(sifre.length() - 1);

        if (sonKarakter < '0' || sonKarakter > '9') {

            flag = 11;
        }

        //         - sifre bosluk icermemeli

        if (sifre.contains(" ")) {

            flag = 11;
        }

        //         - uzunlugu en az 10 karakter olmali

        if (!(sifre.length() >= 10)) {


            flag = 11;
        }
/*
            Sona gelindiginde, flag 10 veya 11 degerini alabilir
            flag == 10 ==> hic bir hata mesaji yazdirilmadi demektir
            flag == 11 ==> hata mesaji yazdirildi, ama kac mesaj yazdirildigini bilemeyiz
         */

        if (flag == 10) System.out.println("sifre basariyla kaydedildi");

        //return type void disinda bir data turu secilmis ise
        //method' un sonunda secilen data turune uygun BIR DEGER return edilmelidir.
        if (flag==10) {
            return true;
        }else{
            return false;
        }

    }
}
