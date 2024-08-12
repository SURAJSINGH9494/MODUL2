package surajapplication;

import java.util.Scanner;

public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		
		user s=new user();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice:");
		n=sc.nextInt();
		switch (n) {
		case 1: 
			s.Accountopen();
			break;
		case 2: 
			s.Deposite();
			break;
		case 3: 
			s.Withdraw();
			break;
		default:
			System.out.println("invalid Choice!");
			break;
			
		}
		
	}

}
class user {
	String Name;
	long Aadhar_Number;
	long Pan_Number;
	int Balance;
	
	
	public void Accountopen() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		Name=sc.next();
		System.out.println("enter your Aadhar Number:");
		long Aadhar_Number = sc.nextLong();
		System.out.println("Enter your Pan_Number:");
		Pan_Number=sc.nextLong();
		System.out.println("your Name:"+Name);
		System.out.println("Your Adhar Number:"+Aadhar_Number);
		System.out.println("your pan number:"+Pan_Number);
		System.out.println("your Account has been successfully created!");
	}
	
		public void Deposite() {
			int Deposite_Amount;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your Deposite Amount:");
			Deposite_Amount=sc.nextInt();
			Balance=Deposite_Amount+Balance;
			System.out.println("Your Balance after deposite :"+Balance);
			
			
		}
		public void Withdraw() {
			int Withdraw_Amount;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your withdraw Amount:");
			Withdraw_Amount=sc.nextInt();
			
			if(Balance<Withdraw_Amount)
			{
				System.out.println("Low Blance");
				
			}else {
				Balance=Balance-Withdraw_Amount;
				System.out.println("your blance after Withdraw :"+Balance);
			}
			
		}
	
	
}
