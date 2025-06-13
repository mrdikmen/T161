package day44_InheritanceDataTypeKullanimi;

public class C01_Hayvanlar {

    /*
        Kartal  hem hayvanlar class' inda
                hem kuslar class' inda
                hem de avci kuslar cllass' inda var

                PEKIII hayvanlar class' indaki kartal ile
                kuslar class' indaki kartal ve avci kuslar class' indaki kartal
                ayni ozellikleri mi tasir?

                Bu konuda iki farkli gorus var

                1- her obje class' indaki diger objelerle ORTAK OZELLIKLER tasimalidir.
                    orn. kartal da BUTUN HAYVANLAR GIBI hareket eder

                2- her obje class' indaki diger objelerle ORTAK OZELLIKLER tasimalidir
                    (hayvanlar class' indaki kartal icin gaga, kanat veya penceden bahsedemeyiz)
                    AMMAAAA var olan ortak ozelliklerin
                    mumkun ise en guncel halini alalim
                    orn... Kartal da BUTUN HAYVANLAR GIBI hareket eder
                           Hem de bu hareketi daha guncel bilgi olarak UCAR seklinde soyleyebiliriz.

                           Kartal da BUTUN HAYVANLAR GIBI beslenir
                           Hem de bu hareketi daha guncel bilgi olarak ET YER seklinde soyleyebiliriz.

                 Java kullanicilarina
                 obje' lerin iki sekilde davranabilmesi icin
                 bir opsiyon sunmustur

                 EGER ozelliklerin 1. maddedeki gibi davranmasini istiyorsaniz
                        ozellikleri VARIABLE olarak olusturmalisiniz

                 EGER ozelliklerin 2. maddedeki gibi davranmasini istiyorsaniz
                        ozellikleri METHOD olarak olusturmalisiniz
     */


    public String hareket =  "hareket ederler";
    public String solunum = "nefes alirlar";
    public String beslenme =  "beslenirler";
    public String cogalma = "cogalirlar";
    public String omur =  "yasar ve olurler";

}
