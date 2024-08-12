package surajapplication;

public class divisiblenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("number divisible by 3:");
       for (int i=1;i<=100;i++) {
    	   if(i%3 == 0) {
    		   System.out.print(i+" "); 
    	   }
       }
       System.out.println("number divisible by 5:");
       for(int i=1; i<=100;i++) {
    	   if(i%5 ==0) {
    		   System.out.print(i+" ");
    	   }
       }
       System.out.println("\n\nNUmber divisible by both 3 and 5:");
       for(int i=1;i<=100;i++) {
    	   if (i%3==0 && i%5 ==0) {
    		   System.out.print(i+" ");
    	   }
       }
	}

}
