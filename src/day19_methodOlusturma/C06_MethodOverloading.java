package day19_methodOlusturma;

public class C06_MethodOverloading {
    public static void main(String[] args) {

        String str = "Java ile hersey mumkun";

        System.out.println(str.substring(10));  //ersey mumkun

        System.out.println(str.substring(2,7));     //va il

        /*
        ayni isimde ama farkli isleve sahip methodlar olabilir
        java hangi methodu kullanacagina
        girdigimiz argumanlara gore karar verir

        ornegin 8. satirda 1 arguman girildigi icin bu arguman ile uyumlu substring() calisti
        buna karsilik 10. satirda 2 arguman girilince argumanlara uygun farkli bir substring() calistirildi.

         */
    }
}
