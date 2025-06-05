package day33_ParametreliConstructor;

public class C01_Araba {

    int ilanNo;
    String marka="Marka Atanmadi";
    String model="Model Atanmadi";
    int yil=1900;
    int fiyat;

    C01_Araba(String mrk, String mdl){
        marka=mrk;
        model=mdl;
    }

    //biz gorunur bir constructor olusturunca
    //java default' u siler
    //daha onceden default constuctor'i kullanan objeler
    //CTE vermemesi icin
    //default constructor yerine
    //parametresiz constructor olusturmaliyiz.

    C01_Araba(){

    }


    public C01_Araba(int ilanNo, String marka, String model, int yil, int fiyat) {
        this.ilanNo = ilanNo;
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    C01_Araba(int ilanNo, String marka, String model){


        //constuctor' lari intelliJ' e de olusturtabiliriz.
        //sol üst 4 çizgi/Code/Generate/Constructor


        /*
        ilanNo=ilanNo;     //Variable is already assigned to this value
        esitligin sol tarafindaki variable'lara
        siz class level' daki variable' larsiniz DEMEMIZ GEREKİYOR!!!

        Java bu islem icin ozel bir keyword olusturmus
        this. .....
         */
        this.ilanNo=ilanNo;
        this.marka=marka;
        this.model=model;

    }





    //bu class' dan olusturulan objelerin
    //sout icerisinde kullanilabilmesini
    //ve tum ozellikleri yazdirmasini istiyorsak toString() olusturmaliyiz

    @Override
    public String toString() {
        return "C01_Araba{" +
                "ilanNo=" + ilanNo +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat;
    }
}
