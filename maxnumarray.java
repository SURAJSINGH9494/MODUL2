package surajapplication;

public class maxnumarray {
  public static int findMax(int[] array) {
	int max = array[0];
	for(int i=1;i< array.length;i++) {
		if(array[i] > max) {
			max = array[i];
		}
	}
	  return max;
  }
  public static void main(String[] args) {
	  int[] numbers = {3,5,7,2,8,9,4};
	  int maxNumber = findMax(numbers);
	  System.out.println("the maximum number in the array is:" +maxNumber);
  }
}

