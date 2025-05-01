import java.util.*;

class unithree{
    private int singleNumber(int[] nums) {
        int ones =0;
        int twos =0;
    
        for (final int num : nums){
            ones^=(num & ~twos);
            twos ^= (num& ~ones);
        }
    
        return ones;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the elements of the array:  \t");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        unithree obj = new unithree();
        int result = obj.singleNumber(nums);
        System.out.println("The single number is: " + result);
        
        sc.close();

    }
}