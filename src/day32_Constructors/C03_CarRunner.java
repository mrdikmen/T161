package day32_Constructors;

public class C03_CarRunner {
    public static void main(String[] args) {

        C01_Car car1 = new C01_Car();
        System.out.println("car1: " + car1);
        //car1: C01_Car{ilanNo=0, yil=1900, fiyat=0, model='Model Atanmadi', marka='Marka Atanmadi'}
        // obje olustururken default constructor kullanilirsa
        //C01 class' indaki instance variable degerleine sahip
        //bir obje olusturur.

        //car1 objesine ozellikleri tek tek atamaliyiz.
        car1.marka = "Toyota";
        car1.model = "Corolla";
        car1.yil = 2010;
        car1.fiyat = 5000;
        car1.ilanNo = 1001;
        System.out.println("Car1 atanan: " + car1);
        //Car1 atanan: C01_Car{ilanNo=1001, yil=2010, fiyat=5000, model='Corolla', marka='Toyota'}


        /*
            olusturulan objenin istenen ozelliklere sahip olmasi icin
            mutlaka atama yapilmalidir.

            ANCAAAAKKK
            bu atamayi her obje icin tek tek atama yapmak yerine
            argument olarak constructor' a yollayip
            obje constructor' da olusturulurken
            atama islemini de aradan cikarabiliriz.
         */

        C01_Car car2 = new C01_Car("Mercedes", "E200", 2000, 3000, 1002);
        System.out.println("car2" + car2);
        //car2C01_Car{ilanNo=1002, yil=2000, fiyat=3000, model='E200', marka='Mercedes'}

        C01_Car car3 = new C01_Car("Opel", "Corsa", 2015, 5000, 1003);
        System.out.println("car3" + car3);
        //car3C01_Car{ilanNo=1003, yil=2015, fiyat=5000, model='Corsa', marka='Opel'}
    }
}
