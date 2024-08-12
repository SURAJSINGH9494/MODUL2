package surajapplication;

	import java.util.Scanner;

	public class ASCIIValue {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt the user to enter a character
	        System.out.print("Enter a character: ");
	        char ch = scanner.next().charAt(0);
	        
	        // Get the ASCII value of the character
	        int asciiValue = (int) ch;
	        
	        // Display the ASCII value
	        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);
	        
	       
	    }
	}
	

