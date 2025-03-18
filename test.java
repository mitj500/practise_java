// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class test {
    static int[] arr;
    
    static int sum(){
        int sum =0;
        
        for ( int i =0;i <arr.length;i++ )
            sum += arr[i];
            return sum ;
        
    }

    public static void main(String[] args) {
    Scanner sb  = new Scanner(System.in);
    
    System.out.println("enter the no. of element s that u want in the array:");
    
    int n = sb.nextInt();
    
     arr =new int[n];
    
     System.out.println("enter the elements in the array");
     for (int i =0; i<n ;i++){
         arr[i] =sb.nextInt();
         
     }
     
    System.out.println("Sum of the given array is " + sum());
        sb.close();
    }
}