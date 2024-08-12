package surajapplication;

public class pojo1 {

	public static  void main(String[] args) {
		
		pojo p=new pojo();
		
		p.setId(1);
		p.setName("suraj");
		p.setPhone_num(916680);
		p.setAddress("ahmdabad");
		p.setpincode(382430);
		
		System.out.println("id:"+p.getId());
		System.out.println("name:"+p.getName());
		System.out.println("phone no:"+p.getPhone_num());
		System.out.println("address:"+p.getAddress());
		System.out.println("pincode:"+p.pincode());
		
        add a = new add();
        a.addition();
        sub b = new sub();
        b.substraction();
        div c = new div ();
        c.division();
        multi1 d = new multi1();
         ((multi1) d).multiplication();
	}

}
