import java.util.HashMap;  
import java.util.Map;  
import java.util.Scanner;  

public class oddstring {  

    public static String findOddColoredBalloons(int N, String[] B) {  
        // Count occurrences of each color  
        Map<String, Integer> colorCount = new HashMap<>();  

        for (String color : B) {  
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);  
        }  

        // Find the first color with an odd count  
        for (String color : B) {  
            if (colorCount.get(color) % 2 != 0) {  
                return color; // Return the first color with an odd count  
            }  
        }  

        return "All are even"; // If no odd occurrence found  
    }  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
        try {  
            System.out.print("Enter the number of balloons: ");  
            int N = scanner.nextInt(); // Read the number of balloons  
            String[] B = new String[N]; // Initialize the array for colors  
            
            System.out.println("Enter the colors of the balloons: ");  
            for (int i = 0; i < N; i++) {  
                B[i] = scanner.next(); // Read each color  
            }  

            String result = findOddColoredBalloons(N, B);  
            System.out.println(result); // Output the result  
        } catch (Exception e) {  
            System.out.println("Invalid input. Please enter numbers and strings correctly.");  
        } finally {  
            scanner.close(); // Close the scanner to free up resources  
        }  
    }  
}  