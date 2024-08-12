package surajapplication;

public class Member {
	private String name;
	private int age;
	private String phoneNumber;
	private String address;
	private double salary;
	
	public Member(String name, int age, String phoneNumber, String address, double salary) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address  = address;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getPhonenumber() {
		return phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public double getSalary() {
		return salary;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Member member = new Member("Suraj singh", 21, "123-456-7890", "123 main st ahamdabad,india", 50000.0);
  System.out.println("Name: "+member.getName());
  System.out.println("Age:"+ member.getAge());
  System.out.println("Phone Number:"+member.getPhonenumber());
  System.out.println("Address:" + member.getAddress());
  member.getSalary();
	}

}
