package day38_LocalDate_Time;

import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTimeMethodlari {
    public static void main(String[] args) {


        LocalTime yerelSaat=LocalTime.now();    //calistigi sistemdeki zamani getirir.
        System.out.println("yerel zaman: "+yerelSaat);                          //21:17:01.642362100

        LocalTime yerelSaatJaponya=LocalTime.now(ZoneId.of("Japan"));   //Japonya saati:03:17:01.653400700
        System.out.println("Japonya saati:" +yerelSaatJaponya);


        LocalTime yerelSaatNewyork=LocalTime.now(ZoneId.of("America/New_York"));    //New York saati: 14:17:01.655407700
        System.out.println("New York saati: "+yerelSaatNewyork);

        //get...() methodlari
        System.out.println(yerelSaat.getHour());    //21
        System.out.println(yerelSaat.getMinute());  //19

        //with...()
        System.out.println(yerelSaat.withMinute(0));    //21:00:28.622631600
        System.out.println(yerelSaat.withSecond(0).withNano(0));    //21:22

        //plus() ve minus()
        //zamanda istenen kadar ileri ya da geri goturur.
        System.out.println(yerelSaat.plusHours(100).plusMinutes(12));   //01:36:22.735403800
        System.out.println(yerelSaat.minusMinutes(12500));      //05:04:58.945506400

        System.out.println(yerelSaat.isBefore(yerelSaatJaponya));   //false
        System.out.println(yerelSaat.isAfter(yerelSaatNewyork));    //true

    }
}
