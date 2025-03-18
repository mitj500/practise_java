import java.util.Scanner;  

public class sumcu {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the value of a: ");  
        int a = sc.nextInt();  
        System.out.print("Enter the value of b: ");  
        int b = sc.nextInt();  
        
        int sum = 0;  
        
        // Calculate the sum of cubes from a to b  
        for (int i = a; i <= b; i++) {  
            sum += i * i * i; // or use Math.pow(i, 3)  
        }  
        
        System.out.println("The sum of the cubes from " + a + " to " + b + " is: " + sum);  
        sc.close();  
    }  
}  