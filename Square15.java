import java.util.Scanner;

public class Square15 {
    public static void main(String[] args) {

        Scanner sc15 = new Scanner(System.in);

        System.out.print("Masukan nilai N: ");
        int N = sc15.nextInt();

        for (int iOuter = 1; iOuter <= N; iOuter++) {
            for (int i = 1; i <= N; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
