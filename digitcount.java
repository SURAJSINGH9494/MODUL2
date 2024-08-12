package surajapplication;

import java.util.Scanner;

public class digitcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a positive integer less than ten billion: ");
long num = scanner.nextLong();
if (num <=0 || num >= 10_000_000_000L) {
	System.out.print("please enter a positive integer less than ten billion.");
	return;
}
int count = 0;
long temp = num;
while (temp > 0) {
	temp = temp/10;
	count++;
}
System.out.println("number of digits in " + num + "=" +count);


	}

}
