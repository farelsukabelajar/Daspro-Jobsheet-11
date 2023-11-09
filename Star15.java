import java.util.Scanner;

public class Star15 {
    public static void main(String[] args) {

        Scanner sc15 = new Scanner(System.in);

        System.out.print("Masukan nilai N: ");
        int N = sc15.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print("*");
        }

    }
}
