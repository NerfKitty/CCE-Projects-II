import java.util.Random;

public class password1 {
    public static void main(String[] args) {
        String stuff = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder strb = new StringBuilder();
        Random rndm = new Random();

        for (int i = 1; i <= 8; i++){
            strb.append(stuff.charAt(rndm.nextInt(stuff.length()-1)));
        }

        System.out.println("Your password is "+strb);
  
    }
}
