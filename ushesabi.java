import java.util.Scanner;

public class ushesabi {


    static void data() {
        Scanner number = new Scanner(System.in);

        while (true) {

            System.out.print("taban sayısını giriniz :");
            int sayi1 = number.nextInt();



            System.out.print("üs sayısını griniz :");
            int sayi2 = number.nextInt();

            int result  = 1;

            for (int i = 1; i <= sayi2; i++) {
                result *= sayi1;
            }

            System.out.println(result);

        }

    }

    public static void main(String[] args) {
        data();


    }
}
