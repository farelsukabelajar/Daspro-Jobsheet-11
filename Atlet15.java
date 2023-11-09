import java.util.Scanner;

public class Atlet15 {
    public static void main(String[] args) {

        Scanner sc15 = new Scanner(System.in);

        String[] cabor = { "Badminton", "Tenis Meja", "Basket", "Bola Voly" };
        String[][] atlet = new String[cabor.length][5];

        for (int i = 0; i < cabor.length; i++) {

            System.out.println("\nMasukkan nama atlet untuk cabang olahraga " + cabor[i] + ":\n");

            for (int j = 0; j < 5; j++) {

                System.out.print("Atlet " + (j + 1) + ": ");
                atlet[i][j] = sc15.nextLine();

            }
        }

        for (int i = 0; i < cabor.length; i++) {
            System.out.println("Atlet Cabang Olahraga: " + cabor[i]+"\n");

            for (int j = 0; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {

                    if (atlet[i][j].compareTo(atlet[i][k]) > 0) {
                        String temp = atlet[i][j];
                        atlet[i][j] = atlet[i][k];
                        atlet[i][k] = temp;

                    }
                }
                System.out.println(atlet[i][j]);
            }
            System.out.println();
        }

        
    }
}
