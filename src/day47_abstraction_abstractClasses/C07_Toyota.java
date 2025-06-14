package day47_abstraction_abstractClasses;

public abstract class C07_Toyota extends C05_KuralciArabaClass{

/*
    Abstract bir parent' in
    Abstract bir child' i olabilir.

    Abstract child' in amaci
    parent' daki genel kurallari kendi child' lari icin uyarlama
    veya kendi child' lari icin yeni kurallar koyma olabilir.

    ornegin: toyota class' i
    arac Class' inda belirlenen genel kurallari
    tum toyota araclar icin UYARLAYABILIR
    veya tum toyotalarin sahip oldugu yeni kurallar ekleyebilir.
 */

    public void motor(){
        System.out.println("Toyota araclar Toyota motor kullanir");
    }

    public void klima(){
        System.out.println("Toyota araclar cevreci klima kullanir");
    }

    public void marka(){
        System.out.println("Toyota marka");
    }

    public abstract void guvenlikStandardi();


    public abstract void fren();


}
