import java.util.Scanner;
import java.lang.Math;

 class armstrong{
 static void calarm(){ 
    int num = 675, ognumber, remainder,result=0;
    ognumber = num;

    while (ognumber !=0)
    {
        remainder = ognumber%10;
        result += Math.pow(remainder, 3);
         ognumber /=10;
    }
    if  ( result ==num){
        System.out.println("it is an armstrong number");
    }
    else {
        System.out.println("it is not an armstrong number");
    }
 }
    public static void main (String[] args){
        Scanner sb = new Scanner (System.in);
        System.out.println (" enter the element to check if it is armstrong ");
        int n = sb.nextInt();
        calarm();
        sb.close();
    }
}
