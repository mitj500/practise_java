import java.util.*;

class Check {
    private int count = 0;
    private int count2 = 0;

    public void counter(String s){
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                count2++;
            } else if (s.charAt(i) == '*') {
                count++;
            } else {
                System.out.println("The string contains other symbols");
                break;
            }
        }
    }

    public void printer(){
        int result = count - count2;
        System.out.println(result);

        if (count > count2) {
            System.out.println("The string contains more '*' than '#'");
        } else if (count < count2) {
            System.out.println("The string contains more '#' than '*'");
        } else if (count == count2) {
            System.out.println("The string contains equal number of '*' and '#'");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check for symbols: ");
        String s = sc.nextLine();

        Check check = new Check();
        check.counter(s);
        check.printer();
    }
}   