package surajapplication;
import java.util.Scanner;
public class banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     savingaccount s=new savingaccount();
     s.deposite();
     s.withdraw();
     currentaccount c=new currentaccount();
     c.deposite();
     c.withdraw();
	}

}

abstract class bankaccount {
	abstract void deposite();
	abstract void withdraw();
}
class savingaccount extends bankaccount{
	
	float balance,dep_amt,with_amt;
	@Override
	
	void deposite() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount you want to deposite to savingaccount:");
		dep_amt=sc.nextFloat();
		balance=balance+dep_amt;
		System.out.println("balance after deposite:"+balance);
	}
	
	@Override
	void withdraw() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount you want to withdraw from savingaccount:");
		with_amt=sc.nextFloat();
		if(with_amt>balance)
		{
			System.out.println("low blance !");
		} 
		else {
			balance=balance-with_amt;
			System.out.println("blance after withdrawal:"+balance);
		}
			
	}
}



class currentaccount extends bankaccount{
	float balance,dep_amt,with_amt;
	@Override
	void deposite() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter amount you want to deposite to  currentaccount:");
		dep_amt=sc.nextFloat();
		balance=balance+dep_amt;
		System.out.println("balance after deposite:"+balance);
	}
	
	@Override
	void withdraw() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount you want to withdraw from currentaccount:");
		with_amt=sc.nextFloat();
		if(with_amt>balance) {
			System.out.println("low balance");
		}
		else {
			balance= balance-with_amt;
			System.out.println("blance after withdrawal:"+balance);
		}
	}
}

