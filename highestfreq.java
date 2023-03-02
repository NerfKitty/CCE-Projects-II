import java.util.Scanner;

public class highestfreq {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int [] freq = new int [256];
        int maxfreq = 0;
        char maxChar = ' ';
        String text = scan.nextLine().trim();

        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

            
        for (int j = 0; j < text.length(); j++) {
            if (maxfreq < freq[text.charAt(j)]){
                maxfreq = freq[text.charAt(j)];
                maxChar = text.charAt(j);  
            } 
        }  
        System.out.println("'"+ maxChar +"'");

        
;  
         scan.close();   
    }
}
