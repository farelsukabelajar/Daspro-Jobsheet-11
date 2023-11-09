import java.util.Scanner;

public class SegitigaBintang15 {

    public static void main(String[] args) {

        Scanner sc15 = new Scanner(System.in);

        Boolean isNilai = false;
        while (!isNilai) {

            System.out.print("Masukkan nilai N (minimal 5): ");
            int N = sc15.nextInt();

            if (N < 5) {
                System.out.println("Nilai N kurang dari 5, silahkan masukan nilai kembali!\n");
            } else {

                for (int i = N; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    isNilai = true;
                }
            }

        }

    }
}
