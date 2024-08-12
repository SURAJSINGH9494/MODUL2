package surajapplication;

public class rectangle {
	float l,w,p,area;
	rectangle(float l, float w){
		this.l=l;
		this.w=w;
		
		
	}
	public void area() {
		area=l*w;
		
	}
public void p() {
	p=2*l+w;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
rectangle r=new rectangle(10,10);
r.area();
r.p();

System.out.println("Area is:"+r.area+"\nPrimeter is:"+r.p);
	}

}
