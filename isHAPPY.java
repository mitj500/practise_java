import java.util.HashSet;  
import java.util.Set;  
import java.util.Scanner;  

class isHAPPY {  
    public boolean isHappy(int n) {  
        
        Set<Integer> visit = new HashSet<>();  
        
        while (!visit.contains(n)) {  
            System.out.println("current number " + n);  
            visit.add(n);  
            int nextNum = getNextNumber(n);  
            
            System.out.println("nextNum (sum of squares of digit ):  " + nextNum );  
            
            if (nextNum == 1) {  
                System.out.println("Happy number is found");  
                return true;  
            }  
            n = nextNum;  
        }  
        
        System.out.println("Cycle detected ,not a happy number");  
        return false;  
    }  
    
    private int getNextNumber(int n) {  
        int output = 0;  
        while (n > 0) {  
            int digit = n % 10;  
            output += digit * digit;  
            n = n / 10;  
        }  
        return output;  
    }  
    
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter a number: ");  
        int number = scanner.nextInt();  
        isHAPPY sol = new isHAPPY();  
        boolean isHappy = sol.isHappy(number);  
        System.out.println(number + " is a Happy number: " + isHappy);  
        scanner.close();  
    }  
}  

// check if the number is happy or not 