import java.util.*;
public class planMap{
    
    public static void main(String [] args){
        Scanner dc = new  Scanner(System.in);
        System.out.println("Enter the number of cases: ");  // read the number of test cases
        int t =dc.nextInt();
        dc.nextLine();
        
        while (t-->0){
            System.out.println("Enter the moves: ");
            String moves = dc.nextLine();
            int x=0,y=0;
            
            for (char move :moves.toCharArray()){
                if (move == 'U') y++;
                else if (move == 'D')y--;
                else if (move == 'L')x--;
                else if (move == 'R')x++;
                else if (!(move == 'R' ||move == 'L' ||move == 'U' ||move == 'D')){
                    System.out.println("Invalid Input"+""+ move );
                    break;
                };
            }
            System.out.println(x+ "" + y);
        }
    }
}