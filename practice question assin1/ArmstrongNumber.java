import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int arm = 0;
        int temp = n;
        int digits = String.valueOf(n).length();

        while (n != 0) {
            int rem = n % 10;
            arm = arm + (int)Math.pow(rem, digits); 
            n = n / 10;
        }

        if (temp == arm) {
            System.out.println("This is an Armstrong number");
        } else {
            System.out.println("This is not an Armstrong number");
        }
    }
}
