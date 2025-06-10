package day38_LocalDate_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_LocalDateTimeveIstenenFormattaYazdirma {

    public static void main(String[] args) {


        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);    //2025-04-04T22:18:28.619877900


        //tarihi 4 April 25 formatinda yazdirin.

        System.out.println(ldt.getDayOfMonth() + " " +
                ldt.getMonth() + " " +
                (ldt.getYear()-2000));  //4 APRIL 25



 /*
            format icin oncelikle istenen yazim biciminin
            String olarak bir modelini (pattern) olusturmalisiniz,
            sonrasinda istediginiz tarihi hazirladiginiz pattern'e uygun formatta yazdirabilirsiniz.
            GUN
                 d : basta 0 varsa onu yazmadan gun numarasi
                 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
                 DDD : yilin kacinci gunu oldugunu yazar
                 E, EE, EEE : gun isminin ilk 3 harfi
                 EEEE : gun isminin tamamini
             AY (Ay icin M, dakika icin m kullanilir)
                 M : basta 0 varsa onu yazmadan ay numarasi
                 MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
                 MMM : Ay isminin ilk 3 harfi
                 MMMM : Ay isminin tamami
            Yil   y veya Y kullanilabilir
                 YY : yilin son iki rakamini
                 YYYY : Yilin tamamini
            Saat
                 Saat : 24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h
                 HH : saatin tamami, tek rakamli saat olursa 02 gibi
                 H  : tek rakamli saat olursa sadece saati
                 a yazarsak AM veya PM degerini yazar
         */




        //tarihi 04/04/2025 seklinde yazdirin.
        //once istedigimiz zaman formatini Java' ya bildirmemiz gerekir.

        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(ldt.format(format1));        //04/04/2025


        //tarihi 04 Nis 2025 seklinde yazdirin.
        DateTimeFormatter format2=DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println(ldt.format(format2));        //04/04/2025



        //tarihi 4 4 25 seklinde yazdirin.
        DateTimeFormatter format3=DateTimeFormatter.ofPattern("d M yy");
        System.out.println(ldt.format(format3));        //04 Nis 2025



        //tarihi 04 Nis 2025 Friday seklinde yazdirin.
        DateTimeFormatter format4=DateTimeFormatter.ofPattern("dd MMM yyyy EEEE");
        System.out.println(ldt.format(format4));        //04 Nis 2025 Cuma



        //saati 21:23 seklinde yazdirin
        DateTimeFormatter format5=DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(ldt.format(format5));        //22:38




        //saati 09:23 PM seklinde yazdirin.
        DateTimeFormatter format6=DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(ldt.format(format6));        //10:39 ÖS




        //saati 9:23:35 PM seklinde yazdirin.
        DateTimeFormatter format7=DateTimeFormatter.ofPattern("h:mm:ss a");
        System.out.println(ldt.format(format7));        //10:39:43 ÖS


    }
}
