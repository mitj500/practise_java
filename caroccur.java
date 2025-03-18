import java.util.Scanner;

class caroccur {
    static  void caroccur(){
        
        String s = "Program";
        int[] c = new int[256]; // Array for ASCII characters

        // Increment count for each character
        for (char ch : s.toCharArray()) {
            c[ch]++;
        }

        System.out.println("Character Occurrences:");

        // Print characters with non-zero counts
        for (int i = 0; i < c.length; i++) {
            if (c[i] > 0) {
                System.out.println((char) i + " : " + c[i]);
            }
        }

    }
  
    public static void main(String[] args) {
      Scanner sb = new  Scanner (System.in);
        System.out.println("Enter the string to check the occurence of characters");
        int a  = sb.nextLine();
        caroccur();
        sb.close();
    }
}
