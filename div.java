package surajapplication;

import java.util.Scanner;
public class div {
	int num1,num2;
	float division;
	public static void main(String[] args) {
		
	}


			public void division() {
			
			 Scanner obj = new Scanner(System.in);
				System.out.println("enter first number");
				num1=obj.nextInt();
				System.out.println("enter sec number");
				num2=obj.nextInt();
				
				if(num2==0) {
					System.out.println("can not devide by zero");
					
				}else {
					division=num1/num2;
					System.out.println("divide by zero:"+division);
				}
				
				
		}

	}


