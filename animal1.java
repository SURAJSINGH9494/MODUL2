package surajapplication;

public class animal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    lion l= new lion();
    l.sound();
    tiger t= new tiger();
    t.sound();
    
	}

}

abstract class animal{
	abstract void sound();
}

class lion extends animal{
	@Override
	void sound() {
		System.out.println("lion");
	}

	public void eat() {
		// TODO Auto-generated method stub
		
	}
}
class tiger extends animal{
	@Override
	void sound() {
		System.out.println("tiger");
	}
}