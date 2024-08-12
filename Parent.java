package surajapplication;
class Parent {
	
	public void display() {
		System.out.println("this is the parent class.");
		}

	class Child extends Parent {
		public void display() {
			System.out.println("this is the child class.");
			
		}
	}
public class Main {

	public static void main(String[] args) {
		Parent parentObject = new Parent();
		parentObject.display();
	   
	   Child childObject = new Child();
		childObject.display();
		
		Parent childAsParent = new Child();
		childAsParent.display();
	}
		// TODO Auto-generated method stub

	}
public void message() {
	// TODO Auto-generated method stub
	
}

}
