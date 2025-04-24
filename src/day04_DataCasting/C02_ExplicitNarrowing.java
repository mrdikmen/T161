package day04_DataCasting;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {


        int a = 13;
        int b = 4567;

        //byte c = a;
        //byte d = b;

        /*
        java kodlari compile ederken (kodlari gozden gecirip bilgisayarın anlayacagi 1 ve 0'lara döndürürken)
        yani Run tuşuna basmadan once SADECE syntax (yazim sekli) ile ilgilenir.
        DEGERLERE bakmaz!

        Daha genis kapsamli data turundeki degeri, daha dar kapsamli data turundeki variable'a atamak istersek,
        java bu islemi OTOMATIK OLARAK YAPMAZ.

        Eger illa ki yapalim dersek java sorumlulugu almamizi ister.
        ve ne yapip eder, buyuk degeri kucuk kaba sigdirir.

         */
        byte c = (byte)a; //a = int ama biz byte olarak alsın istiyoruz
        byte d = (byte)b;

        System.out.println("13'un byte variable'a atanmis hali:" + c); //13
        System.out.println("4567'nin byte variable'a atanmis hali:" + d); //-41


        double dbl1 = 74.3;
        float fl1 = 57.98f;

        int sayi1 = (int)dbl1;
        int sayi2 = (int)fl1;

        System.out.println("74.3'un int variable'a atannmis hali : " + sayi1); //74
        System.out.println("57.98'in int variable'a atannmis hali : " + sayi2); //57

    }
}
