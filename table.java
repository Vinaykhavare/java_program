import java.util.*;
class table{
public static void main (String args[]){
Scanner sc=new Scanner(System.in);																
System.out.println("enter the number");
int n= sc.nextInt();
int table=1;
for(int i=1; i<=10;i++)
{
table=n*i;
System.out.println(n + "x" +i +"=" + table);
}
}
}