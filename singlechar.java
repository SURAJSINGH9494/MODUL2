package surajapplication;

import java.util.Scanner;
public class singlechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a single character:");
String input = scanner.nextLine();


if (input.length() !=1) {
	System.out.println("Error : Please enter exactly one character.");
	return;
}
char ch = input.charAt(0);

if (!Character.isLetter(ch)) {
	System.out.println("Error: Input is not a letter.");
}else {
	ch=Character.toLowerCase(ch);
	
	if (ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u') {
		System.out.println("Input character '"+ch+"' is a consonant.");
	}
}
	}

}
