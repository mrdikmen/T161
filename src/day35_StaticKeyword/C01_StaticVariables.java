
package day35_StaticKeyword;

import day34_ConstructorCall.C02_Hastane;

public class C01_StaticVariables {


    public static void main(String[] args) {

        // static variable'lar class variable'lari olarak da adlandirilir
        // baska class'lardan kullanirken
        // classIsmi ile kullanabilirsiniz

        System.out.println(C02_Hastane.hastaneAdresi);
        C02_Hastane.bashekim = "Dr Kartal";

        // instance variable'lar obje'ye baglidir
        // ve classIsmi ile kullanilamaz

        // C02_Hastane.perIsmi = "Mertcan";

        C02_Hastane per1 = new C02_Hastane();
        per1.persIsmi = "Mertcan";

        C02_Hastane per2 = new C02_Hastane();
        per2.persIsmi = "Melek";

        per2.bashekim = "Alaz";
        // Static member 'bashekim' accessed via instance reference



    }
}
