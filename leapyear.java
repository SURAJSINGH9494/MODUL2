package surajapplication;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);

int i = 0;
System.out.println("enter a year :"+i);
i=obj.nextInt();
if(i%4==0)
	
{
	System.out.println("this year is leap year:");
}
else {
	System.out.println("this year is not leap year:");
}
	}

}
