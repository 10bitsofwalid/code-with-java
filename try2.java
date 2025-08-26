import java.util.Scanner;

public class try2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { 
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 0; i <= n; i++) {
                sum += i;
            }

            System.out.println(sum);
        }
    }
}
