package day05_WrapperClass_MatematikselIslemler_Concatenation;

public class C02_WrapperClassDikkatEdilecekKonu {
    public static void main(String[] args) {

        int sayiInt = 23;
        double sayiDouble = 45.3;


        double a = sayiInt;

        int b = (int) sayiDouble;

        // Auto widening ve expilicit narrowing Wrapper Class'lar için de gecerli midir?

        Short shrtWrap = 24;
        Integer intWrap = 34;

        //Wrapper Class' lar non-primitive data turleridir.
        //non-primitive data turlerinde casting sadece Parent-Child class'lar arasında olur.
        //Wrapper class'larin arasinda boyle bir iliski olmadigindan casting yapilamaz.

        /*
        Integer ab = shrtWrap;              //short ve intager birbirine donusturulemez.
        Integer ac = (Integer) shrtWrap;    //short ve intager birbirine donusturulemez.

        Short bc = intWrap
        Short bd = (Short) intWrap;
        */
        //Eger illa da cast yapmamiz istenirse
        // intWrap variable' inin degerini double bir degiskene atayin.

        //once intWrap'i primitive int bir variable'a atarız.
        int geciciInt = intWrap;

        //sonra gecici primitive int variable'i double varaiable'a cast ederiz.
        double geciciDouble = geciciInt;

        //artik wrapper double variable'a atama yapabiliriz.

        Double wrapDouble = geciciDouble;

        System.out.println("double'a cast edilen sayi: " + wrapDouble);     //34.0


    }
}
