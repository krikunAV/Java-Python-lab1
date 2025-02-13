package Task3;

import java.awt.Point;
import java.util.*;

public class TreasureMap {
    Point treasurePoint;
    List <Pair> instructions = new ArrayList<>();

    private static final Map<String, Point> move = new HashMap<>() {{
        put("Север", new Point(0, 1));
        put("Юг", new Point(0, -1));
        put("Восток", new Point(1, 0));
        put("Запад", new Point(-1, 0));

    }};

    public TreasureMap() {
        this.treasurePoint = setTreasure();
        this.instructions = inputInstructions();
    }

    private static List<Pair> inputInstructions() {
        String stopWord = "Стоп";
        List<Pair> instructions = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Enter direction or '" + stopWord + "' to stop:");

            String direction = setDirection(in, stopWord);

            if (direction.equalsIgnoreCase(stopWord)) {
                break;
            }

            if (move.containsKey(direction)) {
                int distance = setDistance(in);
                instructions.add(new Pair(direction, distance));
            } else {
                System.out.println("Invalid direction! Try again.");
            }
        }
        return instructions;
    }

    private static String setDirection(Scanner in, String stopWord) {
        while (true) {
            try {
                String direction = in.nextLine();
                if (move.containsKey(direction) || Objects.equals(direction, stopWord)) {
                    return direction;
                }
            }catch (InputMismatchException e) {
                in.nextLine();
                System.out.println("Invalid direction! Try again.");
            }
        }
    }

    private static int setDistance(Scanner in) {
        while (true) {
            System.out.println("Enter distance:");
            try {
                int distance = in.nextInt();
                if (distance > 0)
                    return distance;
            }catch (InputMismatchException e) {
                System.out.println("Invalid direction! Try again.");
            }
        }
    }

    private static Point setTreasure () {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter point of the treasure.");
                int positionX = in.nextInt();
                int positionY = in.nextInt();
                in.nextLine();
                return new Point(positionX, positionY);
            } catch (InputMismatchException e) {
                in.nextLine();
                System.out.println("Invalid direction! Try again.");
            }
        }
    }

    private int quantityOfStepsForTreasure() {
        int count = 0;
        Point currentPosition = new Point(0, 0);

        for (Task3.Pair entry : instructions) {
            Point moveDirection = move.get(entry.getKey());

            currentPosition.setLocation(
                    currentPosition.x + moveDirection.x * entry.getValue(),
                    currentPosition.y + moveDirection.y * entry.getValue()
            );

            count++;

            if (currentPosition.equals(treasurePoint)) {
                return count;
            }
        }
        return -1;
    }
    public void quantityOfSteps() {
        System.out.println(quantityOfStepsForTreasure());
    }
}