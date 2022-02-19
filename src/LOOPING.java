public class LOOPING {
    public static void main(String[] args) {
        int nilaiSatu = 0, nilaiDua = 10;

//      LOOPING FOR
        System.out.println("- Looping for -");
        for( int i = nilaiSatu; i < nilaiDua; i++) {
            System.out.println("looping for " + i);
        }

        System.out.println("");

//      LOOPING WHILE
        System.out.println("- Looping while -");
        int j = nilaiSatu;
        while ( j < nilaiDua) {
            System.out.println("looping while " + j);
            j++;
        }

        System.out.println("");

//      LOOPING DO WHILE
        System.out.println("- Looping do while -");
        int k = nilaiSatu;
        do{
            System.out.println("looping do while " + k);
            k++;
        } while ( k < nilaiDua);
    }
}
