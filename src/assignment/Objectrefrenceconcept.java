package assignment;

public class Objectrefrenceconcept {
	
	String name;
	int age;
	
	public void get()
	{
		System.out.println("get method");
	}

	public static void main(String[] args) {
		
		Objectrefrenceconcept e1=new Objectrefrenceconcept();
//		e1=null;
//		e1.name="om"; //null pointer exception
//		e1.age=6;
//		System.out.println(e1.name +":"+e1.age);
	
		
		new Objectrefrenceconcept();  //object can be created without refrence name. 
		
		new Objectrefrenceconcept().name="reeta"; //object can be created with no refrence
		
	}

}
