package surajapplication;

import java.util.Scanner;

public class stringlength {
	public static int findLength(String str) {
		int length = 0;
		char[] charArray = str.toCharArray(); {
			for (char c : charArray) {
				length++;
			}
			return length;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("enter a string:");
    String inputString = scanner.nextLine();
    int length = findLength(inputString);
    System.out.println("the length of the string is:" + length);
	}

}
