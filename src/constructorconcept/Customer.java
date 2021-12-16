package constructorconcept;

public class Customer {

	private String name;
	private int age;
	private String Companyname;
	public Customer(String name, int age, String companyname) {
		
		this.name = name;
		this.age = age;
		Companyname = companyname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCompanyname() {
		return Companyname;
	}
	public void setCompanyname(String companyname) {
		Companyname = companyname;
	}
	
	public String getcustomeinfo()
	{
		return name+" "+age+" "+Companyname;
	}
	
	
	
}
