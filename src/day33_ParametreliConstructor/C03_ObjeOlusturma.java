package day33_ParametreliConstructor;

public class C03_ObjeOlusturma {

    public static void main(String[] args) {


        C01_Araba araba1 = new C01_Araba();
        System.out.println(araba1);
        //C01_Araba{ilanNo=0, marka='Marka Atanmadi', model='Model Atanmadi', yil=1900, fiyat=0

        C01_Araba araba2 = new C01_Araba("Porche", "910");
        System.out.println(araba2);
        //C01_Araba{ilanNo=0, marka='Porche', model='910', yil=1900, fiyat=0

        C01_Araba araba3 = new C01_Araba(1010, "Mini", "Country");
        System.out.println(araba3);
        //C01_Araba{ilanNo=1010, marka='Mini', model='Country', yil=1900, fiyat=0

        C01_Araba araba4 = new C01_Araba(1011,"Tofaş","Şahin",1990,130000);
        System.out.println(araba4);
        //C01_Araba{ilanNo=1011, marka='Tofaş', model='Şahin', yil=1990, fiyat=130000

    }
}
