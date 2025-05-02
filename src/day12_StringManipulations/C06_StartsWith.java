package day12_StringManipulations;

public class C06_StartsWith {
    public static void main(String[] args) {



        String str = "Kod yazmak cok guzel";
        System.out.println(str.startsWith("K"));     //ilk harfi "K" mi?             //true
        System.out.println(str.startsWith("k"));     //ilk harfi "k" mi?             //false
        System.out.println(str.startsWith("Ko"));    //ilk iki harfi "Ko" mi?       //true
        System.out.println(str.startsWith("Kod y")); //ilk harfi "Kod y" mi?     //true
        System.out.println(str.startsWith("Kod  y"));//ilk harfi "Kod  y" mi?   //false
        System.out.println(str.startsWith(""));      //str' nin basinda "" var mi?   //true
        System.out.println(str.startsWith("Kod yazmak cok guzel"));      //"Kod yazmak cok guzel"ile mi basliyor?   //true

        //"Kod yazmak cok guzel"
        //str "yazmak" ile mi basliyor?
        System.out.println(str.startsWith("yazmak"));  //str' nin ilk 6 harfi "yazmak" mi? //false

        //str' in 4. index ve sonrasi "yazmak" ile mi basliyor?
        //yazmak cok guzel

        System.out.println(str.startsWith("yazmak", 4));        //true
        //2 parametreli kullanimda
        //java once toffset olarak verilen index ve sonrasindaki tum metni alir
        //ve aldigi bu parca sorulan "yazmak" ile mi basliyor kontrol eder.

        System.out.println(str.startsWith("cok" , 10));     //false
        System.out.println(str.startsWith("cok" , 11));     //true


    }
}
