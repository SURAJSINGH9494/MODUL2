package surajapplication;
import java.util.Scanner;
public class Grade {
	
	

	public static void displayGrade(int marks) {
		if(marks<0 || marks >100) {
			System.out.println("invalid marks enter marks between 0 and 100");
			
		}else if(marks >=90) {
			System.out.println("Grade:A");
		}else if(marks>=80) {
			System.out.println("Grade:B");
		}else if(marks >=70) {
			System.out.println("Grade:C");
		}else if(marks>=60) {
			System.out.println("Grade:D");
		}else if (marks>=40) {
			System.out.println("Grade:DD40");
			}else {
				System.out.println("Grade:Fali");
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter your marks out of 100");
    int marks = scanner.nextInt();
	displayGrade(marks);
    
	}

}
