package day02_VariableKullanimi_Scanner;

public class C05_NamingConvention {
    public static void main(String[] args) {

        // 1- variable isimleri küçük-büyük harf duyarlıdır
        // Case Sensitive

        int not = 70;
        int noT = 90;
        int nOT = 50;

        System.out.println("not = " + not); // 70
        System.out.println("nOT = " + nOT); // 50
        System.out.println("noT = " + noT); // 90

        // 2- variable isimleri küçük harf ile başlar
        // bu uygulanmasa java hata vermez ancak genel kabullere aykırı olur


        // 3- Variable isminde harf, sayi ve ya $,_ sembolleri olabilir
        // ancak boşluk ya da özel karakterler olamaz!!!


        //int ogrenci yasi = 12;  // olmaz, boşluk var!
        //int ogrenci&yasi = 12;  //olmaz, özel karakter var!

        // int ogrenci1yasi = 12; olur
        // int ogrenci2yasi = 15; olur

        // 4- variable isimleri $ ya da _ kullanılabilir ama ismin bunla bşlanması istenmez!

        //String _okul = "Yildiz okulu";     olur
        //String $okul = "Yildiz Okulu";       olur


        // 5- variable isminde rakam kullanılabilir ama isim rakamla başlamaz

        String okul1ismi ="yildiz";
        //String 1okulismi = "yildiz"; olmaz


        // 6- eğer variable ismi birden fazla kelimeden oluşuyorsa "CamelCase" kullanılır

        Double ogrenciYasiOrtalamasi = 12.5;

        // 7- isim olarak anahtar kelimeler kullanılamaz

        //int int = 8; olmaz
        //String class = Kartal olmaz (Class)

        //boolean for = true;
    }
}
