import java.util.Scanner;

public class splitname {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine().trim();
        String[] fullname = name.split("[ ]");
        String midname = " ";

        for (int i = 0; i < fullname.length; i++) {
            if (fullname[i].contains("-")) {
                midname = Character.toString(fullname[i].charAt(1)) + ".";
                fullname[i] = midname;
            }
            System.out.print(fullname[i] + " ");
        }
        System.out.println();

        for (int j = 0; j < fullname.length; j++) {
            System.out.print(fullname[j].charAt(0));
        }

        System.out.println();
        scan.close();

    }
}
