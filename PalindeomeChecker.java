package surajapplication;
import java.util.Scanner;
public class PalindeomeChecker {
	public static String reverseString(String str) {
		StringBuilder reversed = new StringBuilder();
		for (int i=str.length()-1;i>=0;i--) {
			reversed.append(str.charAt(i));
		}
		return reversed.toString();
	}
  
	 public static boolean isPalindrome(String str) {
		 String reversed = reverseString(str);
		 return str.equals(reversed);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scanner = new Scanner(System.in);
     System.out.println("enter a string:");
     String inputString = scanner.nextLine();
     String reversedString = reverseString(inputString);
     System.out.println("Reversed string: "+reversedString);
     if(isPalindrome(inputString)) {
    	 System.out.println("the string is a palindrome.");
     }else {
    	 System.out.println("the string is not a palindrome.");
     }
	}

}




