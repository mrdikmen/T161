package day27_MultiDimensionalArrays;

public class C03_CiftSayilariToplama {

    public static void main(String[] args) {

        int[][] sayilar = {{3, 5, 4}, {2, 3, 6, 8}, {2, 4}, {10}, {3, 9, 0, 2, 7}};
        ciftSayilariTopla(sayilar);
    }
    public static void ciftSayilariTopla(int[][] arr){

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {             //outer array


            for (int j = 0; j < arr[i].length; j++) {    //inner array

                if (arr[i][j] % 2 ==0)
                    toplam+= arr[i][j];

            }
        }
        System.out.println("array'deki cift sayilarin toplami: " + toplam);
        //array'deki cift sayilarin toplami: 38
    }


}
