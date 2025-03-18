import java.util.*;
class longpre {

    public static String longPre(String[] s) {
        StringBuilder result = new StringBuilder();

        Arrays.sort(s);
        char[] first = s[0].toCharArray();
        char[] last = s[s.length - 1].toCharArray();
        
        for (int i = 0; i < first.length; i++) {
            if (first[i] == last[i]) {
                result.append(first[i]);
            } else {
                System.out.println("strings are not equal to: " + first[i]);
                break;
            }
        }
        
        return result.toString();
    }
    public static void main(String[] args) {

        Scanner sb = new Scanner(System.in);
        System.out.println("Enter the strings: ");
        String[] s =sb.nextLine().split(" ");
        System.out.println("Longest common prefix: " + longPre(s));
        sb.close();
    }
}
