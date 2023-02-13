import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class password3 {
    static String stuff = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    static Random rndm = new Random();
    static StringBuilder strb = new StringBuilder();
    static Scanner scan = new Scanner(System.in);
    static int num;
    static boolean repeat = false;

    public static void main(String[] args) {
        do {
            try {
                System.out.print(
                        "How many characters do you want in your password?: ");
                num = scan.nextInt();
                if (num >= 5) {
                    for (int i = 1; i <= num; i++) {
                        strb.append(stuff.charAt(rndm.nextInt(stuff.length() - 1)));
                    }
                    System.out.println("Your password is " + strb);
                    break;

                } else {
                    System.out.println(
                            "Your password must have 5 characters long.");
                    repeat = true;
                }

            } catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Invalid Input. Please try again...");
                repeat = true;

            }
        } while (repeat);

    }
}