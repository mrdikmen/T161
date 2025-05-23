package day23_scope;

public class C04_HastaneRunner {


    public static void main(String[] args) {


        C03_Hastane pers1=new C03_Hastane();


        System.out.println(pers1.persIsmi);         //isim atanmadi
        System.out.println(pers1.persAdres);        //adres atanmadi
        System.out.println(pers1.hastaneIsmi);      //Yildiz
        System.out.println(pers1.bashekim);         //Dr Mertcan


        pers1.persIsmi="Kartal";
        pers1.persAdres="Antalya";
        pers1.persTel="231432523";

        C03_Hastane pers2=new C03_Hastane();

        pers2.persIsmi="Melek";
        pers2.persAdres="Kepez";
        pers2.persTel="345382";
        pers2.bashekim="Dr Alaz";
        pers2.hastaneAdresi="Istanbul";


        System.out.println(pers1.hastaneAdresi);    //Istanbul
        System.out.println(pers1.persIsmi);         //Kartal
        System.out.println(pers1.bashekim);         //Dr Alaz
        System.out.println(pers1.persAdres);        //Antalya


    }


}
