package Task1;
import java.util.Scanner;

public class InputUtils {
    public static int setNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number: ");
        if (in.hasNextInt()) {
            return in.nextInt();
        } else {
            in.close();
            System.out.println("Invalid input!");
            return 0;
        }
    }

    public static int[] setSequence() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a quantity of number: ");

        if (in.hasNextInt()) {
            return determinantSequence(in, in.nextInt());
        } else {
            System.out.println("Invalid input!");
            return new int[0];
        }
    }

    private static int[] determinantSequence(Scanner in, int quantityOfNumber) {
        int[] sequence = new int[quantityOfNumber];
        for (int i = 0; i < quantityOfNumber; i++) {
            if (in.hasNextInt())
                sequence[i] = in.nextInt();
        }
        return sequence;
    }


}