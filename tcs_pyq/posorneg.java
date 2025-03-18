import java.util.*;

public class posorneg
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		int count1 =0, count2=0;
		
		for (int i =0;i<str.length();i++)
		{
		    if (str.charAt(i)=='*'){
		        count1++;
		        
		    }
		    else if (str.charAt(i)=='#'){
		        count2++;
		    }
		    
		}
		
		System.out.println(count1 - count2);
		if (count2>count1){
		    System.out.println("it is an negative number");
		}
		else
		{
		    System.out.println("it is an positive number");
		}
	}
}
