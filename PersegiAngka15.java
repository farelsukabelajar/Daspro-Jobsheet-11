import java.util.Scanner;

public class PersegiAngka15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);

        Boolean isNilai = false;

        while (!isNilai) {

            System.out.print("Masukkan nilai N (minimal 3): ");
            int N = sc15.nextInt();

            if (N < 3) {
                System.out.println("Nilai N kurang dari 3, silakan masukkan nilai kembali!\n");
            } else {

                for (int i = 1; i <= N; i++) {
                    for (int j = 1; j <= N; j++) {
                        if (i == 1 || i == N || j == 1 || j == N) {
                            System.out.print(N + " ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                isNilai = true;
            }
        }
    }
}
