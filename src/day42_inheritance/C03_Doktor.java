package day42_inheritance;

public class C03_Doktor extends C02_IK{

    /*
        Bir class baska bir class' i parent edindiginde
        1- Baslangic itibariyle parent class' daki
           Tum ozelliklere (variable ve method) sahip olur

        2- Insanlar aleminden farkli olarak
           Java' da parent class' lar child edinmez,
           Child class' lar parent EDINIR

        3- Child class' lar istenirse
        parent class' daki ozellikleri
        kendilerine uyarlayabilirler

        4- Child class' lar isterlerse
        parent class' da olmayan yeni
        ozellikler ekleyebilirler
     */

    int asgariUcret = 50000;
    int donerSermaye = 10000;

    public static void main(String[] args) {

        C03_Doktor doktor=new C03_Doktor();

        System.out.println(doktor.yas);
        System.out.println(doktor.isim);
        System.out.println(doktor.emekliMi);
        System.out.println(doktor.bolumKisa);



    }
}
