import java.util.*;

public class StrongNumb10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        int original = n;

        while (n > 0) {
            int remainder = n % 10;
            int fact = 1;
            for (int i = 1; i <= remainder; i++) {
                fact = fact * i;
            }
            sum += fact;
           n = n / 10;  
        }

        if (sum == original) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a Strong Number");
        }
    }
}
