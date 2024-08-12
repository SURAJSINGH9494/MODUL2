package surajapplication;

public class Circle {
	
	public double radius,pi=3.14,area,circumfrence;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	public double getradius() {
		return radius;
	}
    public void setradius(double radius)
    {
	this.radius=radius;
    }
    public double area() {
    	return area=pi*radius*radius;
    }
    public double circumfrence() {
    	return circumfrence=2*pi*radius;
    }

    public static void main(String[] args) {
    	Circle c=new Circle(5);
    	c.area();
    	c.circumfrence();
    	System.out.println("area of circle is:"+c.area+"circumfrence of circle is:"+c.circumfrence);
    	c.setradius(7);
    	double area=c.area();
    	double circumfrence=c.circumfrence();
    	System.out.println("area of circle is:"+area+"circumfrence of circle is:"+circumfrence);
    	
    }
	
}
