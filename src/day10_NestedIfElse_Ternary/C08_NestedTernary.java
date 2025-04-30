package day10_NestedIfElse_Ternary;

import java.util.Scanner;

public class C08_NestedTernary {
    public static void main(String[] args) {

        //kullanicidan 1 tam sayi isteyin.
        //pozitif - negatif - notr seceneklerinden uygun olani yazdirin.

        Scanner scanner =new Scanner(System.in);
        System.out.println("1 tam sayi girin...");

        int sayi = scanner.nextInt();

        System.out.println(sayi > 0 ? "pozitif" :"burasi negatif veya notr olabilir"  );

        System.out.println(sayi > 0 ? "pozitif" :(sayi < 0 ? "negatif" : "notr")  );

        System.out.println(sayi > 0 ? "pozitif" :sayi < 0 ? "negatif" : "notr"  );

        //verilen sayi tek ise 3' un kati veya 3' un kati degil yazdir.

        //verilen sayi cift ise 3' un kati veya 3' un kati degil yazdir.

        System.out.println(
                sayi % 2 == 0 ?
                        //"cift"
                        sayi % 5 == 0 ? "5' in kati" : "5' in kati degil"
                        :
                        //"tek" ));
                        sayi % 3 == 0 ? "3' un kati" : "3' un kati degil.");



    }
}
