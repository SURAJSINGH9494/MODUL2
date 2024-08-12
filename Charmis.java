package surajapplication;

public class Charmis {




	public Charmis(String string, String string2) {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		String Name = null;
		return Name;
	}
	public void setName(String name) {
	}
	public String getBreed() {
		return getBreed();
	}
	public void setBreed(String breed) {
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Charmis c1 = new Charmis("tommy","german sephard");
   Charmis c2 = new Charmis("lucy","bulldog");
   c1.setName("Rocky");
   c1.setBreed("dephard");
   c2.setName("simba");
   c2.setBreed("bullydog");
   
   System.out.println("dog name:"+c1.getName()+"\ndog breed:"+c1.getBreed());
   System.out.println("dog name:"+c2.getName()+"\ndog breed:"+c2.getBreed());
	}

}
