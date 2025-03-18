
class sumOFelement{

 static int sumR (int arr[],int n){
    if (n<= 0){
        return 0;
    } 
    else {
        return sumR(arr, n-1) +arr[n-1];
    }
}

public static void main (String[] args)
    {

        int arr[] = { 12, 3, 4, 15 };
        int s = sumR(arr, arr.length);

        System.out.println(s);
    }

}