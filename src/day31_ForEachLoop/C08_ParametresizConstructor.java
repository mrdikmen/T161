package day31_ForEachLoop;

public class C08_ParametresizConstructor {

    /*
        Default Constructor
            -Java tarafindan olusturulur
            -Gorunmez
            -Parametresi yoktur
            -Body' sinde kod olmaz
     */

    C08_ParametresizConstructor() {
        sayi=30;

    }

    /*
        Parametresiz Constructor
            -kod yazanlar tarafindan olusturulur
            -parametresi yoktur
            -Body' sinde kod olabilir
     */

    int sayi = 10;
    int num = 20;

    public static void main(String[] args) {

        C08_ParametresizConstructor obj1 = new C08_ParametresizConstructor();
        System.out.println(obj1.sayi);      //30
        System.out.println(obj1.num);       //20
    }

}
