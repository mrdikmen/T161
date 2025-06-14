package day47_abstraction_abstractClasses;

public abstract class C05_KuralciArabaClass {

    // Araba class' ini inherit edecek child class' lar
    // (Yani yeni araba uretecek markalar icin)
    // Arabalarin mutlaka bulundurmasi gereken ozellikleri
    // Bu class' ta belirleyebiliriz.

    public abstract void motor();
    public abstract void teker();
    public abstract void aku();


    //arabalarin bulundurmasi zorunlu olmayan
    //yani arabalarin tercihine bırakilan ozellikleri
    //concrete method olarak olusturabiliriz.

    public void klima(){

        System.out.println("Araba Klima");
    }

    public void sunroof(){

        System.out.println("Araba Sunroof");
    }
}
