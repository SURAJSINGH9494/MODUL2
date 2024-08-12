package surajapplication;

 abstract class Parent1 {
         public abstract void message(); 
 }   
         class FirstSubclass extends Parent1 {
        	 @Override
        	 public void message() {
        		 System.out.println("this is the first subclass.");
        	 }
         }
         class SecondSubclass extends Parent1 {
        	 public void message() {
        		 System.out.println("this is the second subclass.");
        	 }
         
        public class Main{
        	 
         
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   FirstSubclass firstSubclass = new FirstSubclass();
   Parent1 firstSubclass.message();
   
   SecondSubclass secondSubclass = new SecondSubclass();
   secondSubclass.message();
   
	}
        }
}
 