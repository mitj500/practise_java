import java.util.Arrays;  
import java.util.Scanner;  

public class RiskSorter {  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.println("Enter the value of N:");  
        int n = scanner.nextInt();  

        int[] arr = new int[n];  
        System.out.println("Enter the elements of the array (only 0, 1, or 2):");  
        for (int i = 0; i < n; i++) {  
            arr[i] = scanner.nextInt();  
            if (arr[i] != 0 && arr[i] != 1 && arr[i] != 2) {
                System.out.println("Invalid input. Please enter only 0, 1, or 2.");
               break;
            }
            else {
                continue;
            }
        }  

        // Use Arrays.sort() to sort the array  
        Arrays.sort(arr);  

        System.out.println("Sorted array:");  
        for (int num : arr) {  
            System.out.print(num + " ");  
        }  

        scanner.close();  
    }  

}
/*  
 * import java.util.Scanner;  

public class RiskSorter {  

    public static void sortRiskLevels(int[] arr) {  
        int low = 0; // Pointer for the next position of 0  
        int mid = 0; // Pointer for the current element being examined  
        int high = arr.length - 1; // Pointer for the next position of 2  

        while (mid <= high) {  
            switch (arr[mid]) {  
                case 0:  
                    // Swap arr[low] and arr[mid]  
                    int temp0 = arr[low];  
                    arr[low] = arr[mid];  
                    arr[mid] = temp0;  
                    low++;  
                    mid++;  
                    break;  

                case 1:  
                    mid++;  
                    break;  

                case 2:  
                    // Swap arr[mid] and arr[high]  
                    int temp2 = arr[mid];  
                    arr[mid] = arr[high];  
                    arr[high] = temp2;  
                    high--;  
                    break;  
            }  
        }  
    }  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        System.out.println("Enter the value of N:");  
        int n = scanner.nextInt();  

        int[] arr = new int[n];  
        System.out.println("Enter the elements of the array (only 0, 1, or 2):");  
        for (int i = 0; i < n; i++) {  
            arr[i] = scanner.nextInt();  
        }  

        sortRiskLevels(arr);  

        System.out.println("Sorted array:");  
        for (int num : arr) {  
            System.out.print(num + " ");  
        }  

        scanner.close();  
    }  
}  
*/