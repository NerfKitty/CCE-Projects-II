import java.util.Random;

public class password2 {
    public static void main(String[] args) {
      String letter = "abcdefghijklmnopqrstuvwxyz";
      String number = "1234567890";
      StringBuilder strb = new StringBuilder();
      Random rndm = new Random();

      for (int i = 1; i <= 2; i++){
        strb.append(number.charAt(rndm.nextInt(number.length()-1)));
      }
      for (int i = 1; i <= 1; i++){
        strb.append(letter.toUpperCase().charAt(rndm.nextInt(number.length()-1)));
      }
      for (int i =1; i <=5; i++){
        strb.append(letter.charAt(rndm.nextInt(number.length()-1)));
      }
      System.out.println("Your password is "+strb);
      
    }
}
