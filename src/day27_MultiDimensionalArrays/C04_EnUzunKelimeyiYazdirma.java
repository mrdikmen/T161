package day27_MultiDimensionalArrays;

public class C04_EnUzunKelimeyiYazdirma {
    public static void main(String[] args) {


        //verilen iki katli String bir array' deki
        //en uzun kelimeyi yazdirin

        String[][] arr = {{"Ali", "okula", "git"}, {"Merhabalar", "arkadaslar"}, {"Bu", "is", "olacak"}};

        String enUzunKelime = arr[0][0];

        for (int i = 0; i < arr.length; i++) {            //outer array kontrol
            for (int j = 0; j < arr[i].length; j++) {        //inner array kotrol
                if (arr[i][j].length() > enUzunKelime.length()) {
                    enUzunKelime=arr[i][j];
                }
            }
        }
        System.out.println("array' deki en uzun kelime: " + enUzunKelime);
        //array' deki en uzun kelime: Merhabalar
    }
}
