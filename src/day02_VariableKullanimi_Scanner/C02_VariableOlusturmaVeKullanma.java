package day02_VariableKullanimi_Scanner;

public class C02_VariableOlusturmaVeKullanma {

    public static void main(String[] args) {




        int sayi = 20;

        System.out.println("10. satirda sayinin değeri: " + sayi  );
        // 10. satırda sayının değeri:20


        // sayi variable'ina yeni bir değer atayalım

        // int sayi = 30
        // sayi değeri zaten oluşturuldu bir daha oluşturamazsın



        sayi = 30;


        System.out.println("23. satirda sayinin değeri : " + sayi);
        //23. satirda sayinin değeri : 30

        /*  java da = assignment (atama) işaretidir,
            java = gördüğünde önce =' in sağına bakar ve o işlemi yapar
            işlem bittikten sonra bulunan değeri variable' ye atama yapar
        */

        sayi = sayi + 5 ;

        System.out.println("36. satirda sayinin değeri : " + sayi);
        //36. satirda sayinin değeri : 35

        int a = 10;

        a = 2 * a + 1;

        System.out.println("a' nin değeri : " + a);
        //a' nin değeri : 21




    }


}
