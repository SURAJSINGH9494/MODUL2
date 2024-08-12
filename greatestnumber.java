package surajapplication;

import java.util.Scanner;
public class greatestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner= new Scanner(System.in);
int a,b,c,big = 0;
System.out.println("enter a first value:");
a=scanner.nextInt();
System.out.println("enter a second value:");
b=scanner.nextInt();
System.out.println("enter third value:");
c=scanner.nextInt();
a = big;
if(b > big ) {
	big=b;
}
 if (c > big){
	big=c;
}
System.out.print("the big value:" +big);
	}

}
