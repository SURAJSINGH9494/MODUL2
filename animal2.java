package surajapplication;

public class animal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       lion l= new lion();
       l.eat();
       l.sleep();
       tigers t= new tigers();
       t.eat();
       t.sleep();
       deers d=new deers();
       d.eat();
       d.sleep();
	}

}
abstract class a{
	@Override
	void eat() {
		System.out.println("lion is eating");
	}
	@Override 
	void sleep() {
		Sytem.out.println("lion is sleeping");
	}
}
class tigers extends a{
	@Override
	void eat() {
		System.out.println("tiger is sleeping");
	}
	@Override
	void sleep() {
		System.out.println("deer is sleeping");
	}
}
