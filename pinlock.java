import java.util.*;

public class pinlock{
    public static  void main(String[] args){
        Scanner sc= new  Scanner (System.in);
        System.out.println("enter the times of pin you want to enter");
        int t = sc.nextInt();
        sc.nextLine();
        
        while (t-->0){
            String  pin = sc.nextLine();
            int sum =0;
            
             for (char digit : pin.toCharArray()){
                 sum += Character.getNumericValue(digit);
             }
            if (sum%4==0)
                {System.out.println("OPEN");
                System.out.println("you dont need more tries to enter");   
                break;
                }
                
            else
                 {System.out.println("LOCKED");}
        }
    }
}