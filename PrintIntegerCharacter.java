package surajapplication;

public class PrintIntegerCharacter {

    // Method to print an integer followed by a character
    public void print(int num, char ch) {
        System.out.println("Integer: " + num + ", Character: " + ch);
    }

    // Method to print a character followed by an integer
    public void print(char ch, int num) {
        System.out.println("Character: " + ch + ", Integer: " + num);
    }

    // Main method to test the print methods
    public static void main(String[] args) {
        PrintIntegerCharacter printer = new PrintIntegerCharacter();
        
        // Testing the print methods
        printer.print(10, 'A');  
        printer.print('B', 20);  
    }
}
