import java.util.*;
public class switchcaseExample{
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the choice");
int ch=sc.nextInt(); 
switch(ch)
{
case 1:
System.out.println("First case executed");	
 break;
case 2:
System.out.println("2nd case executed");	
 break;
default:
System.out.println(" case not present");	
}
}	
}