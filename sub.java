package surajapplication;

import java.util.Scanner;

public class sub {
 int num1, num2,substraction;
 
 public void substraction() {
	 Scanner obj = new Scanner(System.in);
	 System.out.println("enter first number:");
	 num1 = obj.nextInt();
	 System.out.println("enter Sec number:");
	 num2 = obj.nextInt();
	 substraction = num1-num2;
	 System.out.println("substraction:"+ substraction);
 }
}
