package Task4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class LogisticMaximum {
    List<Integer> pathWithMinHeight = new ArrayList<>();
    int quantityTunnels;

    public LogisticMaximum() {
        Scanner in = new Scanner(System.in);
        fillPath(in);
        in.close();
    }

    private void fillPath(Scanner in) {
        System.out.println("Enter the quantity of path:");
        try {
            int quantityPath = in.nextInt();
            for (int i = 0; i < quantityPath; i++) {
                System.out.print("Enter quantity tunnels for path - " +  (i + 1) +":\n");
                quantityTunnels = in.nextInt();

                while (true) {
                    if (quantityTunnels > 0) {
                        addMinHeight(in, quantityTunnels);
                        break;
                    }else System.out.println("Invalid direction! Try again.\n");
                }
            }
        }catch (InputMismatchException e) {
            in.nextLine();
            System.out.println("Invalid direction! Try again.\n");
        }
    }

    private void addMinHeight(Scanner in,int quantityTunnels) {
        int minHeights = Integer.MAX_VALUE;

        for (int j = 0; j < quantityTunnels; j++) {
            System.out.print("Enter height tunnels:\n");
            int height = in.nextInt();
            if (height > 0 && height < minHeights) {
                minHeights = height;}
        }
        pathWithMinHeight.add(minHeights);
    }

    public void findMaxHeightAndNumberPath() {
        int maxHeight = 0,numberPath = 0;
        for (int i = 0; i < pathWithMinHeight.size(); i++) {
            if (pathWithMinHeight.get(i) > maxHeight) {
                maxHeight = pathWithMinHeight.get(i);
                numberPath = i;
            }
        }
        System.out.println((numberPath + 1) + "\n" + maxHeight);
    }
}