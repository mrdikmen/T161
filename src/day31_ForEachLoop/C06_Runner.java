package day31_ForEachLoop;

public class C06_Runner {
    public static void main(String[] args) {

        C05_Hastane per1=new C05_Hastane();

        /*
        Bir class' dan bir obje olusturup
        ilk deger atamasi yapabilmek icin
        mutlaka bir constructor CALISMALIDIR!!!

        Java bir class olusturuldugunda
        class'a gorunur bir constructor olusturulmazsa
        obje olusturulabilmesini saglamak icin
        class' a default bir costructor koyar

        default constructor GORUNMEZ!!!
        parametresizdir ve body' sinde kod olmaz

         */

        System.out.println(per1.perAdres);  //adres atanmadi
        per1.perAdres="Cankaya";
        System.out.println(per1.perAdres);  //Cankaya

        //esitligin sadece sol tarafini yazarsak
        C05_Hastane per2;
        //System.out.println(per2.perAdres);
        // variable per2 might not have been initialized
        // per2' ye ilk deger atamasi yapilmamis olabilir.


        System.out.println(new C05_Hastane().perAdres);     //adres atanmadi
        System.out.println(new C05_Hastane().persIsmi);     //isim atanmadi
    }
}
