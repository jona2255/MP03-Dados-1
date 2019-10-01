import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[12];

        System.out.println("¿Cuantas veces quieres tirar el dado?");

        int tiradas = scanner.nextInt();

        for (int i = 0; i < tiradas; i++) {

            int dado1 = (int)(Math.random() * 6) + 1;
            int dado2 = (int)(Math.random() * 6) + 1;

            ++array[dado1 + dado2 - 1];
        }

        for (int i = 1; i < array.length; i++) {

            System.out.println(i + 1 + " Ha salido ->" + array[i]);

        }
    }
}
