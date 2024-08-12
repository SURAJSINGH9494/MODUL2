package surajapplication;

public class shap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      rectangle rectangle = new rectangle(5,6);
      Circle circle = new Circle(7);
      triangle triangle = new triangle(4,6);
      
      rectangle.getarea();
      circle.getarea();
      triangle.getarea();
      
	}

}
interface shape{
	public void getarea();
	
}

class rectangle implements shape{
	double length;
	double width;
	rectangle(double length,double width){
		this.length=length;
		this.width=width;
		
	}
	public void getarea() {
		double area=length*width;
		System.out.println("Area of rectangle:"+area);
	}
	
}
   class Circle implements shap {
	   double radius, pi=3.14;
	   public Circle(double radius) {
		   this.radius = radius;
	   }
	   @Override
	   public void getarea() {
		   double area = pi*radius*radius;
		   System.out.println("Area of Circle:"+area);
	   }
	   
   }
   class triangle implements shape {
	   double base;
	   double height;
	   
	   public triangle(double base, double height) {
		   this.base = base;
		   this.height = height;
	   }
	   
	   @Override
	   public void getarea() {
		   double area = 0.5 * base * height;
		   System.out.println("Area of triangleL:"+area);
	   }
   }
   