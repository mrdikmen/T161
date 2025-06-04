package day32_Constructors;

public class C01_Car {
    int ilanNo;
    String marka="Marka Atanmadi";
    String model="Model Atanmadi";
    int yil=1900;
    int fiyat;


    C01_Car(String mrk,String mdl,int yl,int fyt,int iNo){

        marka=mrk;
        model=mdl;
        yil=yl;
        fiyat=fyt;
        ilanNo=iNo;
    }

    /*
        biz gorunur bir constuctor olusturdugumuzda
        java default' u siler
        bu durumda daha once default constructor ile
        olusturulan objeler CTE verir.

        CTE vermesinin onune gecmek icin bir class' ta
        GORUNUR bir constructor olusturdugumuzda
        default constructor yerine parametresiz bir
        constructor da olustururuz.
     */
    C01_Car(){

    }

    /*
        Bir class olusturdugumuzda,
        baska class' larda bu class' tan obje olusturuldugunda
        objenin referansini degil,
        tum ozelliklerini yazdirmasini istersek
        toString ()'i Class' a uyarlamalıyız
     */


    @Override
    public String toString() {
        return "C01_Car{" +
                "ilanNo=" + ilanNo +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                ", model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                '}';
    }


}
