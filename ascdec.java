package surajapplication;

import java.util.Scanner;
import java.util.Arrays;
public class ascdec {
	
	public static void Ascending(int[] array) {
		Arrays.sort(array);
	}

	public static void Descending(int[] array) {
		Arrays.sort(array);
		for (int i=0;i< array.length/2;i++) {
			int temp = array[i];
			array[i] = array[array.length - i -1];
			array[array.length-i-1] =temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.print("enter the size of the first array:");
int size1 = scanner.nextInt();
int[] array1 = new int[size1];
System.out.println("enter elements of the first array:");
for (int i=0;i<size1;i++) {
	array1[i] = scanner.nextInt();
	
}
System.out.print("enter the size of the second array: ");
int size2 = scanner.nextInt();
int[] array2 = new int[size2];
System.out.println("enter element of the second array:");
for (int i =0;i<size2;i++) {
	array2[i]= scanner.nextInt();
}
System.out.print("enter 'a' for ascending order or 'd' for descending order:");
char order = scanner.next().charAt(0);
if (order == 'a') {
	Ascending(array1);
	Ascending(array2);
	
	
}else if (order == 'd') {
	Descending(array1);
	Descending(array2);
	
}else {
	System.out.println("invalid choice defaulting to ascending order");
	Ascending(array1);
	Ascending(array2);
}
System.out.println("sorted first array:" + Arrays.toString(array1));
System.out.println("sorted first array:" + Arrays.toString(array2));

	}
	

}
