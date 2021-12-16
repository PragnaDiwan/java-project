package constructorconcept;

public class Testcustomer {

	public static void main(String[] args) {
		
		 Customer c1=new Customer("pragna", 20, "global");
		 
System.out.println(c1.getAge());
System.out.println(c1.getCompanyname());
System.out.println(c1.getName());
System.out.println(c1.getcustomeinfo());

c1.setCompanyname("ibm");
System.out.println(c1.getCompanyname());

	}
	
	

}
