import java.util.Scanner;  

public class unielesum {  
    public static int findUniqueSum(int[] arr) {  
        int sum = 0;  

        for (int i = 0; i < arr.length; i++) {  
            boolean isUnique = true;  

            // Check if arr[i] is unique  
            for (int j = 0; j < arr.length; j++) {  
                if (i != j && arr[i] == arr[j]) {  
                    isUnique = false;  
                    break; // Break if a duplicate is found  
                }  
            }  

            // If unique, add to the sum  
            if (isUnique) {  
                sum += arr[i];  
            }  
        }  

        return sum;  
    }  

    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the size of the array: ");  
        int n = sc.nextInt();  
        int[] arr = new int[n];  
        System.out.println("Enter the elements of the array: ");  
        for (int i = 0; i < n; i++) {  
            arr[i] = sc.nextInt();  
        }  

        int sum = findUniqueSum(arr);  
        System.out.println("The sum of unique elements is: " + sum);  
        sc.close();  
    }  
}  