import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("Rolling dice...");
        int die1 = rand.nextInt(6) + 1;
        int die2 = rand.nextInt(6) + 1;

        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total value: " + (die1 + die2));
    }
}
