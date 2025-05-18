import java.util.Scanner;
class swappingno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("Before Swapping value is : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

       System.out.println("After Swapping value is : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

   
    }
}
