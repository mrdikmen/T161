package day33_ParametreliConstructor;

public class C02_Runner {

    public static void main(String[] args) {

        C01_Araba araba1 = new C01_Araba();
        System.out.println("Araba1:" + araba1);
        //C01_Araba{ilanNo=0, marka='Marka Atanmadi', model='Model Atanmadi', yil=1900, fiyat=0


        C01_Araba araba2=new C01_Araba("BMW","5.20");
        System.out.println("araba2: " + araba2);
        //araba2: C01_Araba{ilanNo=0, marka='BMW', model='5.20', yil=1900, fiyat=0


        C01_Araba araba3=new C01_Araba(1001,"Nissan","Note");
        System.out.println("araba3: " + araba3);
        //araba3: C01_Araba{ilanNo=1001, marka='Nissan', model='Note', yil=1900, fiyat=0

        C01_Araba araba4 = new C01_Araba(10002,"Tesla","Y",2010,10000);
        System.out.println("Araba4: " + araba4);
        //Araba4: C01_Araba{ilanNo=10002, marka='Tesla', model='Y', yil=2010, fiyat=10000

    }
}
