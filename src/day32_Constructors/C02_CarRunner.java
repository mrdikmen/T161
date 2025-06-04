package day32_Constructors;

public class C02_CarRunner {
    public static void main(String[] args) {

        C01_Car car1=new C01_Car();

        //car1' in tum ozelliklerini yazin
        //eger car class' inda toString() yoksa
        //car1 objesini direkt yazdirirsak
        //objenin ozelliklerini degil, referansini yazdirir.
        //objenin ozelliklerini istersek tek tek yazdirmak gerekir.
        //System.out.println(car1);   //C01_Car@1d251891  referansını yazar



        //eger Car class' inda toString() olusturulursa,
        //objeyi direkt yazdirdigimizda, secilen ozelliklerini yazdirir
        System.out.println(car1);   //C01_Car{ilanNo=0, yil=1900, fiyat=0, model='Model Atanmadi', marka='Marka Atanmadi'}

        car1.yil=2010;
        car1.marka="Volvo";
        System.out.println(car1);   //C01_Car{ilanNo=0, yil=2010, fiyat=0, model='Model Atanmadi', marka='Volvo'}

        C01_Car car2=new C01_Car();
        System.out.println("car2: "+car2);  //car2: C01_Car{ilanNo=0, yil=1900, fiyat=0, model='Model Atanmadi', marka='Marka Atanmadi'}



    }
}
