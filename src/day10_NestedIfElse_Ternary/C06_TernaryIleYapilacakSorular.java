package day10_NestedIfElse_Ternary;

public class C06_TernaryIleYapilacakSorular {
    public static void main(String[] args) {


        // Verilen bir notu kontrol edip
        // 50 veya daha buyukse "Sinifi Gectin",
        // 50’den kucukse "Maalesef kaldin" yazdirin.

        int not = 50;
        System.out.println(not>=50 ? "sinifi gectin" : "kaldin");


        //verilen 2 tam sayidan buyuk olmayanini yazdir.

        int sayi1 = 76;
        int sayi2 = 77;
        System.out.println(sayi1>sayi2 ?sayi1 : sayi1);

        //verilen sayi icin 3' un kati veya 3' un kati degil seceneklerinden
        //uygun olani yazdir.

        int sayi = 1765;
        System.out.println(sayi % 3 == 0 ? "3'un katidir" : "3' un kati degildir");


    }
}
