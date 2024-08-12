package surajapplication;

import java.util.Scanner;
public class multiply {
	int num1,num2,multipication;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public void multipication(){
	Scanner obj = new Scanner(System.in);

	System.out.println("enter first number");
	num1=obj.nextInt();
	System.out.println("enter sec number");
	num2=obj.nextInt();
	multipication=num1*num2;
	System.out.println("multpication:+multipication");
	
}
}
