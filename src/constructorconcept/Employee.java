package constructorconcept;

public class Employee {
	
	String empname;
	int id;
	int age;
	double salary;
	boolean ispermanent;
	char gender;
	
	public Employee()
	{
		System.out.println("default constructor");
	}

	public Employee(int a)
	{
		System.out.println(a);
	}
	
	public Employee(String empname,int id)
	{
		this.empname=empname;
		this.id=id;
	}

	public Employee(String empname, int id, int age, double salary, boolean ispermanent, char gender) {
		
		this.empname = empname;
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.ispermanent = ispermanent;
		this.gender = gender;
	}
}

