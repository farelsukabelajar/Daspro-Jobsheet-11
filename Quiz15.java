import java.util.Scanner;
import java.util.Random;

public class Quiz15 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;

            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();

                if (answer == number) {
                    success = true;
                } else if (answer < number) {
                    System.out.println("Tebakan angka anda terlalu kecil.\n"); // ketika input angka terlalu kecil
                } else {
                    System.out.println("Tebakan angka anda terlalu besar.\n"); // ketika input angka terlalu besar
                }

            } while (!success);

            System.out.print("\nApakah Anda ingin mengulang permainan (Y/y)?");
            menu = input.nextLine().charAt(0);

        } while (menu == 'y' || menu == 'Y');
    }
}
