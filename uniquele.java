import java.util.*;

public class uniquele {  
    public static int findUnique(int[] arr) {  
        int unique = 0;  
        for (int num : arr) {  
            unique ^= num; // Use XOR operation  
        }  
        return unique;  
    }  

    public static void main(String[] args) { 
        Scanner sb = new Scanner(System.in);
        System.out.println("enter the size of the array");
        
        int  size= sb.nextInt();
        int [] array = new int[size];
        
        System.out.println("enter the elements in the array");
        for (int i =0; i<size;i++){
            array[i] =sb.nextInt();
            
        }
        
        int output = findUnique(array);  
        System.out.println("Unique element: " + output); // Output: 5  
        sb.close();
    }  
}  