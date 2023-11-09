import java.util.Scanner;

public class Triangel15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        int i = 1; //modifikasi dari i = o menjadi i = 1

        while (i <= N) {
            int j = 1; // modifikasi dari j = o menjadi j = 1

            while (j <= i) { // modifikasi dari j < i menjadi j<= i
                System.out.print("*");
                j++;
            }
            System.out.println(); // modifikasi dengan menambah kode tersebut
            i++;
        }

    }
}
