
package day23_scope;

public class C02_BaskaClassdanKullanma {

    /*
        Local variable'lar olusturulduklari kod blogunun disindan KULLANILAMAZ

        Class level variable'lar olusturulduklari class'in her yerinden
        kullanilabildigi gibi
        baska class'lardan da KULLANILABILIRLER

        ANCAKK static keyword burada da erisim yontemini belirler

        static class uyeleri (variable/method)
        baska class'dan kullanilacaksa
        classIsmi.staticClassUyesiIsmi seklinde kullanilabilir

        instance variable'lari veya static olmayan method'lari
        kullanmak icin yine obje olusturmamiz gerekir

        static class uyeleri de istenirse
        obje uzerinden kullanilabilir
        ANCAK bu durumda Java,
        static olan bir class uyesine
        nicin instance referans ile ulasiyorsun
        diye kodu sariya boyar
     */

    public static void main(String[] args) {

        System.out.println(C01_ClassLevelVariables.strS);
        System.out.println(C01_ClassLevelVariables.sayiS);
        C01_ClassLevelVariables.method1();

        C01_ClassLevelVariables obj = new C01_ClassLevelVariables();
        System.out.println(obj.blI);
        obj.method2();

        System.out.println(obj.blS);
        // Static member 'blS' accessed via instance reference
        obj.method1();
        // Static member 'method1()' accessed via instance reference
    }
}
