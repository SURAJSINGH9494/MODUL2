package surajapplication;

public class PrintNumber {

    // Method to print an integer
    public void printn(int num) {
        System.out.println("Integer: " + num);
    }

    // Method to print a double
    public void printn(double num) {
        System.out.println("Double: " + num);
    }

    // Method to print a float
    public void printn(float num) {
        System.out.println("Float: " + num);
    }

    // Method to print a long
    public void printn(long num) {
        System.out.println("Long: " + num);
    }

    // Method to print a short
    public void printn(short num) {
        System.out.println("Short: " + num);
    }

    // Method to print a byte
    public void printn(byte num) {
        System.out.println("Byte: " + num);
    }

    // Method to print a character
    public void printn(char ch) {
        System.out.println("Character: " + ch);
    }

    // Main method to test the printn methods
    public static void main(String[] args) {
        PrintNumber printer = new PrintNumber();
        
        // Testing various printn methods
        printer.printn(10);        // Calls the method for int
        printer.printn(10.5);      // Calls the method for double
        printer.printn(10.5f);    // Calls the method for float
        printer.printn(100000L);  // Calls the method for long
        printer.printn((short)5); // Calls the method for short
        printer.printn((byte)2);  // Calls the method for byte
        printer.printn('A');      // Calls the method for char
    }
}
