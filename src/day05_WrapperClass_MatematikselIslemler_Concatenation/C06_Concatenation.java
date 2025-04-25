package day05_WrapperClass_MatematikselIslemler_Concatenation;

public class C06_Concatenation {
    public static void main(String[] args) {


        //Java String ile + islemini kullanmamiza izin verir
        //ancak bu + islemini string soz konusu oldugunda
        //TOPLAMA degil BIRLESTİRME (concatenation) anlami tasir.

        System.out.println("java" + true);      //Javatrue

        System.out.println("java" + '4');       //java4

        System.out.println("Java" + 65.765);    //Java65.765

        //string ile + isareti kullanilir. ama bu matematiksel anlamda degildir.
        //String ile -, *, / KULLANILAMAZ.

        //System.out.println("java" - "kartal");  //Operator '-' cannot be applied to 'java. lang. String', 'java. lang. String'
        //System.out.println("java" * "kartal");  //Operator '*' cannot be applied to 'java. lang. String', 'java. lang. String'
        //System.out.println("java" / "kartal");  //Operator '/' cannot be applied to 'java. lang. String', 'java. lang. String'
    }
}
