import java.util.Scanner;

public class RandomNumberGame {
    public int RandomNumGeneration() {
        int random = (int) (Math.random() * 100); // Generate a random number between 0 and 99
        return random;
    }

    public String DisplayResult(int guess) {
        int random = RandomNumGeneration();
        if (guess == random) {
            return ("Your guess is right");
        } else if (guess > random) {
            return ("Your guess is higher than the number");
        } else if (guess < random) {
            return ("Your guess is lower than the number");
        } else {
            return ("Invalid input");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the guess number between 0 and 99 : ");
        int guess = sc.nextInt();
        RandomNumberGame obj = new RandomNumberGame();
        System.out.println(obj.DisplayResult(guess));
    }
}
