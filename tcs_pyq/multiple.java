import java.util.Scanner;

public class multiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += N * i;
        }
        
        System.out.println(sum);
    }
}
