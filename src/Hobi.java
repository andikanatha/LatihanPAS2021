
import java.util.Arrays;
import java.util.Scanner;

public class Hobi {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        System.out.println("___ List Hobi Saya ___");

//      Input Jumlah  Hobi User
        System.out.print("Masukkan Jumlah Hobi Yang Kamu Miliki : ");
        int JumlahHobi = scan1.nextInt();

//      Mendeklarasi Array
        String[] hobi = new String[JumlahHobi];

//      Input Hobi User
        for(int i = 0; i < JumlahHobi; i++) {
            System.out.print("Masukkan Hobi Kamu : ");
            hobi[i] = scan2.next();
        }

        System.out.println("");
        System.out.println("___ List Hobi Yang Anda Miliki ___");

      Arrays.sort(hobi);
//      List Hobi User FOREACH
        int A = 1;
        for( String B : hobi) {
            System.out.println("Hobi " + A + " : " + B);
            A++;
        }

    }
}