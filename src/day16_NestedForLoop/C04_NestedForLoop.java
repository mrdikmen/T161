package day16_NestedForLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {


        //bir for loop ile 1 2 3 4 yazdirin.

        for (int i = 1; i <= 4; i++) {
            System.out.print(i + " ");
        }

        //ayni loop' u kullanarak 2 4 6 8 yazdirin

        System.out.println("");
        for (int i = 1; i <= 4; i++) {
            System.out.print(2 * i + " ");
        }
        System.out.println("");
        //ayni loop' u kullanarak 2 4 6 8 yazdirin
        for (int i = 1; i <= 4; i++) {
            System.out.print(3 * i + " ");
        }
        System.out.println("");
        //ayni loop' u kullanarak 4 8 12 16 yazdirin
        for (int i = 1; i <= 4; i++) {
            System.out.print(4 * i + " ");
        }

        /*
        tek bir islem ile asagidaki gibi yazdirin
        1 2 3 4
        2 4 6 8
        3 6 9 12
        4 8 12 16

        eger farkli satirlar ve her satirda esit miktarda eleman yazdiralacaksa
        ic ice (nested) loop kullanırız

        eger olusturulacak sekil dikdortgen seklinde ise
        disaridaki loop ile kac satir olacaginı
        icerideki loop ile her satirda kac eleman olacagini belirleriz
         */
        System.out.println("");
        for (int i = 1; i <= 4; i++) {          //outer loop , kac satir olacagini belirler
            for (int j = 1; j <= 4; j++) {      //inner loop , her satirda kac eleman olacagini belirler
                System.out.print(i * j + " ");
            }
            System.out.println();

        }
    }
}