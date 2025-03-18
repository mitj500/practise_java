import java.util.*;

public class monrem{

    public static void main(String[] args) {  
        Scanner sb = new Scanner(System.in);  

        int n, k, j, m, p;  
        System.out.println("this is total number of peanuts you want");
        p = sb.nextInt();  
        System.out.println("this is total number of bananas you want");
        m = sb.nextInt();  
        System.out.println("enter the number of eatable  bananas by monkey");
        k = sb.nextInt();  
        System.out.println("enter the number of eatable peanuts by monkey"); 
        j = sb.nextInt();
        System.out.println("enter the number of monkeys");
        n = sb.nextInt();  

        int bananaEat = m / k;  
        int remBanana = m % k;  

        int peanutEat = p / j;  
        int remPeanut = p % j;  

        int left = n - (bananaEat + peanutEat);  

        if (remBanana != 0 || remPeanut != 0) {  
            left--;  
        }  

        System.out.println(left); 
        sb.close(); 
    }  
}  


/*      import java.util.*;  

public class MonRem {  

    public static void main(String[] args) {  
        performMonkeyCalculations(); // Call the method to perform calculations  
    }  

    // Method to perform the calculations  
    public static void performMonkeyCalculations() {  
        Scanner sb = new Scanner(System.in);  

        int n, k, j, m, p;  
        System.out.println("This is the total number of peanuts you want:");  
        p = sb.nextInt();  
        System.out.println("This is the total number of bananas you want:");  
        m = sb.nextInt();  
        System.out.println("Enter the number of eatable bananas by the monkey:");  
        k = sb.nextInt();  
        System.out.println("Enter the number of eatable peanuts by the monkey:");   
        j = sb.nextInt();  
        System.out.println("Enter the number of monkeys:");  
        n = sb.nextInt();  

        int bananaEat = m / k;  
        int remBanana = m % k;  

        int peanutEat = p / j;  
        int remPeanut = p % j;  

        int left = n - (bananaEat + peanutEat);  

        if (remBanana != 0 || remPeanut != 0) {  
            left--;  
        }  

        printResult(left); // Call the print method  
        
        sb.close();   
    }  

    // Method to print the result  
    public static void printResult(int left) {  
        System.out.println("The number of remaining monkeys: " + left);   
    }  
}   */