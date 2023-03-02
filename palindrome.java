import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine().trim();
        pal(text);
        scan.close();
    }

    public static String pal(String text) {
        StringBuilder strb = new StringBuilder();
        for (int j = (text.length() - 1); j >= 0; j--) {
            strb.append(text.charAt(j));
        }
        if (strb.toString().equals(text)) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
        return text;
    }
}
