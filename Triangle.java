package surajapplication;

public class Triangle {
	private double side1;
	private double side2;
	private double side3;
	public Triangle() {
		this.side1 = 3;
		this.side2= 4;
		this.side3 = 5;
	}

	public void printPerimeter() {
		double perimeter = side1 + side2 + side3;
		System.out.println("Perimeter of the triangle:"+ perimeter);
	}
	public void printArea() {
		double s =(side1+ side2 + side3) /2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.println("Area of the triangle: " + area);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Triangle triangle= new Triangle();
  triangle.printPerimeter();
  triangle.printArea();
	}

}
