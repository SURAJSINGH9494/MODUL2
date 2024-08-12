package surajapplication;

public class Shape {
	public void printShaope() {
		System.out.println("this is a shape");
	}
}

class Rectangle extends Shape {
	public void printRectangle() {
		System.out.println("this is rectangular shape");
	}
}
class circulare2 extends Shape {
	public void printCircular2() {
		System.out.println("this is circular shape");
	}
}
class Square extends Rectangle {
	public void printSquare() {
		System.out.println("square is a rectangle");
	}


// class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Square square = new Square();
square.printShape();
square.printRectangle();

	}


private void printShape() {
	// TODO Auto-generated method stub
	System.out.println("Shape");
}
}
	
