package surajapplication;

abstract class Bank3 {
	public abstract int getBalance();}
class BankA extends Bank3 {
	private int balance;
	
	public BankA(int balance) {
		this.balance = balance;
	}
	@Override
	public int getBalance() {
		return balance;
	}
}
	
	class BankB extends Bank3 {
		private int balance;
		
		public BankB(int balance) {
			this.balance = balance;
		}
		
		public int getBalance() {
			return balance;
		}
	}
	class BankC extends Bank3 {
		private int balance;
		public BankC(int balance) {
			this.balance = balance;
		}
		public int getBalance() {
			return balance;
		}
	
	
	//public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bank3 bankA = new BankA(100);
        System.out.println("balance in bank A:$" + bankA.getBalance());
         
        Bank3 bankB = new BankB(150);
        System.out.println("Balance in bank B:$" + bankB.getBalance());
        
        Bank3 bankC= new BankC(200);
        System.out.println("balance in Bank C:$" + bankC.getBalance());
	}

	

	/*@Override
	public int getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}*/
}
