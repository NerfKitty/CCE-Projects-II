import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class bato2pick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String[] pick = { "Rock", "Scissor", "Paper" };
        int select = rand.nextInt(pick.length);
        int userInput;

        System.out.println("Bato-bato Pick");
        System.out.println("Legend\n0 - Rock\n1 - Scissor\n2 - Paper");
        System.out.println("-".repeat(20));

        while (true) {
            try {
                System.out.print("Enter a pick (____): ");
                userInput = scan.nextInt();
                if (userInput < 0 || userInput > 2) {
                    scan.nextLine();
                    System.out.println("Your input is out of range. Please try again...");
                } else {
                    scan.close();
                    break;
                }
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Invalid input. Please try again...");
            }
        }

        switch (userInput) {
            case 0:
                System.out.println("You pick Rock vs. Computer pick " + pick[select]);
                break;

            case 1:
                System.out.println("You pick Scissor vs. Computer pick " + pick[select]);
                break;

            case 2:
                System.out.println("You pick Paper vs. Computer pick " + pick[select]);
                break;
        }

        if (userInput == 0 && select == 0 || userInput == 1 && select == 1 || userInput == 2 && select == 2) {
            System.out.println("DRAW!");
        } else if (userInput == 0 && select == 1 || userInput == 1 && select == 2
                || userInput == 2 && select == 0) {
            System.out.println("YOU WIN!");
        } else if (select == 0 && userInput == 1 || select == 1 && userInput == 2
                || select == 2 && userInput == 0) {
            System.out.println("YOU LOSE!");
        }
    }

}
