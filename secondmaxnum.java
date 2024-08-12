package surajapplication;

public class secondmaxnum {
	public static int findSecondMax(int[] array) {
		int max = Integer.MIN_VALUE;
		int secoondMax = Integer.MIN_VALUE;
		
		int secondmax = 0;
		for(int num: array) {
			if(num > max) {
				secondmax = max;
				max = num;
			} else if (num > secondmax && num < max) {
				secondmax = num;
			}
		}
		return secondmax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {3,5,7,2,8,9,4};
		int secondMaxNumber = findSecondMax(numbers);
		System.out.println("the second maximum number in the array is: " + secondMaxNumber);

	}

}