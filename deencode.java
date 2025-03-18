import java.util.Map;  
import java.util.Scanner;  
import java.util.TreeMap;  

public class deencode {  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Enter the number of test cases: ");
        int testCases = scanner.nextInt();  
        
        scanner.nextLine(); // Consume the newline after reading the integer  

        while (testCases-- > 0) {  
            String inputString = scanner.nextLine();  
            Map<Character, Integer> charCounts = new TreeMap<>();  

            // Count character occurrences  
            for (char character : inputString.toCharArray()) {  
                charCounts.put(character, charCounts.getOrDefault(character, 0) + 1);  
            }  

            // Build the output string  
            StringBuilder result = new StringBuilder();  
            for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {  
                result.append(entry.getKey()).append(":").append(entry.getValue()).append(" ");  
            }  

            // Print the result, trimming the trailing space  
            System.out.println(result.toString().trim());  
        }  

        scanner.close(); // Close the scanner to prevent resource leaks  
    }  
}  