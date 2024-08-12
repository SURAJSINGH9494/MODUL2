package surajapplication;

import java.util.Scanner;

public class add {
	int num1,num2,addition;
	
	public static void main(String[] args) {
	}
	public void addition() {
		
		 Scanner obj = new Scanner(System.in);
		System.out.println("enter first number:");
		num1=obj.nextInt();
		System.out.println("enter second number:");
        num2=obj.nextInt();
        
addition= num2+num2;
System.out.println("Addition is:"+addition);
	}
}


