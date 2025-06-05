package day34_ConstructorCall;

public class C01 {

    /*
        Java da C01(ilgiliParametreler) syntax'i method call icin kullanir.


        method icinde obje olusturulurken C01() yazarsak constructor' ı,
        obje olusturma disinda C01() yazarsak methodu calistirir.

        ihyiyac oldugunda constuctor icinde
        obje olusturmadan baska constructor call yapilabilmesi icin
        this() kullanilir.

        Kurallar:
        1- constructor call ilk satirda yapilmalidir.
        2-birinci kuraldan dolayi
        bir constructor icinden birden fazla constuctor call YAPILAMAZ
     */

    C01(){


    }

    C01(String isim){
        this(5);
        //this();     //Call to 'this()' must be first statement in constuctod body

        C01();      //method call
    }
    C01(int sayi){}

    public static void main(String[] args) {

        C01 obj1=new C01();     //constructor' i calistirir.

        C01();                  //method call
    }

    public void method1(){
        C01 obj2=new C01();

    }

    public static void C01(){
        C01 obj2=new C01();
    }
}
