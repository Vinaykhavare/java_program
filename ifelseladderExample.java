import java.util.*;
public class ifelseladderExample{
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int no=sc.nextInt();
if(no<0){
System.out.println("Number is Negative");
}
else if(no>0){
System.out.println("Number is Possitive");
}
else{
System.out.println("Number is zero`");
}
}
}
