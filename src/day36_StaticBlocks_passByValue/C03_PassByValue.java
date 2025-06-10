package day36_StaticBlocks_passByValue;

public class C03_PassByValue {

    public static void main(String[] args) {

        int number=3;

        int sayi=12;

        kareAl(number);

        /*
        java da bir kod blogundan baska bir kod bloguna
        variable yollandiginda
        java gonderilen variable' in KENDISINI DEGIL
        DEGERINI (value) gonderir

        YANI variable' in kendisi degil value' su GECIS YAPAR
        buna Pass By Value denir
         */

        System.out.println(sayi);   //12
    }


    public static void kareAl(int sayi){
        System.out.println("sayinin karesi: " + sayi*sayi);     //9

        /*
        number' in scope' u main method' dur.
        number local variable oldugu icin kareAl methodunda kullanilamaz
                 */

        //System.out.println(number);


        System.out.println(sayi);       //3
        //burada kullanilan sayi variable' i main method' daki sayi variable' i degil
        //13. satirda nethod' un parametresi olarak olusturulan sayidir.
    }
}
