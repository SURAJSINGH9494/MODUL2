package surajapplication;

import java.util.Scanner;

public class FactorialCalculator {

	public static long Factorial(int n) {
		long result = 1;
		for (int i = 1;i<=n;i++) {
			result *=i;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a number to calculate its factorial:");
      int number = scanner.nextInt();
      
      if(number <0) {
    	  System.out.println("Factorial is not defined for negative number.");
      }else {
    	  long factorial = Factorial(number);
    	  System.out.println("Factorial of" +number+"is:" +factorial);
      }
	}

}
