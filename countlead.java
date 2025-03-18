import java.util.*;  

public class countlead {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the size of the array:");  
        int n = sc.nextInt();  
        int[] arr = new int[n];  
        System.out.println("The array size is: " + n);  

        System.out.println("Enter the elements of the array:");  
        for (int i = 0; i < n; i++) {  
            arr[i] = sc.nextInt();  
        }  

        // Print the array in the desired format  
        System.out.print("The array is: [");  
        for (int i = 0; i < n; i++) {  
            System.out.print(arr[i]);  
            if (i < n - 1) {  
                System.out.print(", ");  
            }  
        }  
        System.out.println("]");  

        int maxi = arr[0];  
        int cnt = 1;  

        for (int i = 1; i < n; i++) {  
            if (maxi < arr[i]) {  
                cnt++;  
                maxi = arr[i];  
            }  
        }  
        System.out.println("The count of new maximums is: " + cnt);  
        sc.close();  
    }  
}  