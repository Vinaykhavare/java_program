import java.util.*;

public class DuckNumber7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = sc.next();

        if (number.charAt(0) == '0') {
            System.out.println("Not a Duck Number (starts with 0)");
        } else if (number.contains("0")) {
            System.out.println("Duck Number");
        } else {
            System.out.println("Not a Duck Number");
        }
    }
}
