package day27_MultiDimensionalArrays;

import java.util.Arrays;

public class C07_AyniIndexdekiElementlerinToplami {

    public static void main(String[] args) {

        // Verilen 2 katli ve 2 inner array'e sahip int bir array'de
        // ayni index'e sahip elementleri toplayip,
        // yeni olusturacagimiz tek katli bir array'e bu toplamlari atayin.
        //    input :      int[][] arr =  {{3,4,5}, {2,3,6,7}};
        //    output:                       [5, 7, 11]

        int[][] arr = {{3, 4, 5}, {2, 3, 6, 7}};

        //once ortak index adedini bulmamiz lazim
        // iki inner array' den hangisinin element sayisi azsa
        //ortak index sayisi o inner array' in element sayisi olur.

        int ortakIndexSayisi = arr[0].length < arr[1].length ?arr[0].length:arr[1].length;

        //2. adim ortak elemanlari topladigimizda
        //koyacagimiz array' i olusturalim

        int[] outPutArr=new int[ortakIndexSayisi];


        for (int i = 0; i < outPutArr.length; i++) {
            outPutArr[i] = arr[0][i] + arr[1][i];

        }
        System.out.println(Arrays.toString(outPutArr));

    }
}
