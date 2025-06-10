package day36_StaticBlocks_passByValue;

public class C05_PassByValue {

    public static void main(String[] args) {

        int sayi = 4;
        System.out.println(sayiyiDegistir(sayi));   //8

        System.out.println(sayi);       //4

        //sayinin kalici degismesini istersek

        sayi = sayiyiDegistir(sayi);
        System.out.println("main method' da sayinin son degeri: " + sayi);       //8

    }

    public static int sayiyiDegistir(int sayi) {
        //sayi cift ise sayinin degerini 2 katina cikarin
        //sayi tek ise sayinin degerini 5 artırın
        //sayinin son halini dondurun

        if (sayi % 2 == 0) {
            sayi = sayi * 2;

        } else {
            sayi = sayi + 5;
        }
        return sayi;
    }
}
