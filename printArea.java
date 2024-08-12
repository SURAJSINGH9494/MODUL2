package surajapplication;

public class printArea {
	
public printArea(double side) {
	double area = side * side;
	System.out.println("Area of the square: "+area); 
	
}
public printArea(double length, double breadth) {
	  double area = length * breadth;
	  System.out.println("Area of the rectangle:"+area);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Shape();
		double squareSide = 5.0;
		shape.printArea(squareSide);
		double rectangleBreadth = 6.0;
		shape.printArea(rectangleBreadth);

	}



public void printArea(double squareSide) {
	// TODO Auto-generated method stub
	
}
}

