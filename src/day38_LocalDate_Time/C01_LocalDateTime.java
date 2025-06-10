package day38_LocalDate_Time;

import java.time.LocalTime;

public class C01_LocalDateTime {
    public static void main(String[] args) {

        LocalTime yerelSaat=LocalTime.now();
        System.out.println("Loop' dan once yerel saat: "+yerelSaat);

        /*LocalTime class' indaki now()' u calistigi bilgisayardaki
        zamani alip kodun calistigi satira getirir

        ANCAAAAAKKK bu method calistigi andaki degeri bize getirir.
        bir kronometre gibi zamani tutmaya devam etmez

        yerel saat degeri yeni bir atama olmadikca degismez
         */
        //asagidaki islemi kac saniyede bitirildigini yazdirin.

        LocalTime basSaat=LocalTime.now();
        System.out.println("Loop' dan once baslangic saati: "+basSaat);

        String str="";
        for (int i = 0; i < 100000; i++) {
            str+=i;

        }
        LocalTime bitisSaat=LocalTime.now();
        System.out.println("Loop' dan sonra bitis saati: "+bitisSaat);
    }
}
