package surajapplication;


	import java.util.Scanner;

	public class CharacterCounter {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt the user to enter a string
	        System.out.println("Enter a string: ");
	        String input = scanner.nextLine();
	        
	        // Initialize counters
	        int letters = 0, spaces = 0, numbers = 0, others = 0;
	        
	        // Iterate through the string and count each type of character
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            
	            if (Character.isLetter(ch)) {
	                letters++;
	            } else if (Character.isDigit(ch)) {
	                numbers++;
	            } else if (Character.isSpaceChar(ch)) {
	                spaces++;
	            } else {
	                others++;
	            }
	        }
	        
	        // Display the results
	        System.out.println("Letters: " + letters);
	        System.out.println("Spaces: " + spaces);
	        System.out.println("Numbers: " + numbers);
	        System.out.println("Other Characters: " + others);
	        
	       
	    }
	}
		