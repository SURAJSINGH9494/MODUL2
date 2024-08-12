package surajapplication;

public class animal12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     dog d= new dog();
     d.brak();
	}

}

interface creature{
	void brak();
	
}
 class dog implements creature{
	
	@Override
	public void brak() {
		System.out.println("dog is braking");
	}
}