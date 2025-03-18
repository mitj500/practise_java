import java.util.*;

class majele{

    public static void findMajorElement(int[] arr,int N){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for (int num: arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for (int key: freq.keySet()){
            if (freq.get(key)>=N/2){
                System.out.println("key :\t"+key );
            }
        }
        
    }

    public static void main (String [] args ){

        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] array = new int [n];
        int i=0;
        System.out.println("Enter the elements of the array:");
        for ( i =0;i<n;i++){
            array[i]=sc.nextInt();
        }
        findMajorElement(array,n);
        sc.close();
    }
}