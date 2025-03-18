import java.io.*;  
import java.util.Scanner; // Import Scanner for user input  

class fibo1 {  

    // Computes value of first Fibonacci numbers  
    static int calculateSum(int n) {  
        if (n <= 0)  
            return 0;  

        int fibo[] = new int[n + 1];  
        fibo[0] = 0;  
        fibo[1] = 1;  

        // Initialize result  
        int sum = fibo[0] + fibo[1];  

        // Add remaining terms  
        for (int i = 2; i <= n; i++) {  
            fibo[i] = fibo[i - 1] + fibo[i - 2];  
            sum += fibo[i];  
        }  

        return sum;  
    }  

    // Driver program to test above function  
    public static void main(String args[]) {  
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input  
        
        System.out.print("Enter the value of n: "); // Prompt user for input  
        int n = scanner.nextInt(); // Read user input  
        
        // Call calculateSum and display the output  
        System.out.println("Sum of Fibonacci numbers is: " + calculateSum(n));  
        
        scanner.close(); // Close the scanner to prevent resource leaks  
    }  
}  

