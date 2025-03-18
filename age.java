import java.util.*;
class age{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        sc.nextLine();
        
        List <String> ans =new ArrayList<>();
        int totalFema=0;
        int totalgrade=0;

        while (n-->0){
                String name=sc.nextLine();
                String gender = sc.nextLine();
                int age = sc.nextInt();
                int grade =sc.next().charAt(0);
                sc.nextLine();

                if (age >20){
                     ans.add(name);
                  }
        
                  if (gender.equals("female")){
                  totalFema++;
                   totalgrade += grade;
                  }
            }
            for (String name : ans ){
                System.out.println(name);
            }
                double avg =totalFema==0?0: (double) totalgrade/totalFema;
                System.out.println (avg);
                sc.close();
        }
        

    }