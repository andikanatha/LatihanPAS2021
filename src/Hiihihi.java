import java.util.Scanner;

public class Hiihihi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ///MENDEKLARASIKAN
        int bil1 , bil2 ;

        System.out.println("Masukan Bilangan Awal - ");
        bil1 = input.nextInt();

        System.out.println("Masukan Bilangan Akhir - ");
        bil2 = input.nextInt();

        ///For Loop
        System.out.println("Looping For -");

        for (int i = bil1 ; i < bil2 ; i++) {
            System.out.println("Looping For -" + i);
        }

        ///While Loop
        System.out.println("Looping While - ");
        int A = bil1;
        while (A < bil2) {
            System.out.println("Looping While - " + A);
            A++;
        }

        ///Do While Loop
        System.out.println("Looping Do While - ");
        int P = bil1;
        do {
            System.out.println("Do While " + P);
            P++;
        } while (P < bil2);


    }
}
