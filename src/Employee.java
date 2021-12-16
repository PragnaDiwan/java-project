
public class Employee {
	
	String name;
	int age;
	double salary;

	public static void main(String[] args) {
		
		Employee e1=new Employee(); //Employee is class
		                             // e1 is object refrence name
		                            // RHS -new Employee is the object
		                            //non Primitive data type
		                             // type of e1 is employee
		
		
		
		                  e1.name="tom"; e1.age=20; e1.salary=123.00;
		                  
		                  System.out.println(e1.name+ " " + e1.age +" "+e1.salary);
		                  
		                  Employee e2=new Employee();
		                  
		                  System.out.println(e2.name +"" + e2.age +e2.salary);
		                  
		                  //default value of string=null,integer=o,double=0.0,character=space,boolean=false
		                  
		                  
		                  Employee u1=new Employee();
		                  u1.name="pragna";
		                  u1.age=20;
		                  
		                  Employee u2=new Employee();
		                  u2.name="sita";
		                  u2.age=30;
		                  Employee u3=new Employee();
		                  u3.name="pinkle";
		                  u3.age=25;
		                  
		                  System.out.println(u1.name + " " + u1.age );
		                  System.out.println(u2.age +" "+u2.name);
		                  System.out.println(u3.name+ " " +u2.age);
		                  
		                  u1=u2;
		                  System.out.println("---------------------------");
		                  
		                  System.out.println(u1.name + " " + u1.age );
		                  System.out.println(u2.age +" "+u2.name);
		                  System.out.println(u3.name+ " " +u2.age);
		                  
		                  u2=u3;
 System.out.println("---------------------------");
		                  
		                  System.out.println(u1.name + " " + u1.age );
		                  System.out.println(u2.age +" "+u2.name);
		                  System.out.println(u3.name+ " " +u2.age);
		                  
		                  
 System.out.println("---------------------------");
 u3=u1;
 
		                  System.out.println(u1.name + " " + u1.age );
		                  System.out.println(u2.age +" "+u2.name);
		                  System.out.println(u3.name+ " " +u2.age);
		                  
		                  
              // can we have object have multiple refrecne ? yes 
		                  //one single oject have different refrence name and it is allowed
		                  //oject have one refrence
		                  //object have no refrence 
		                  
		                 // above all are true
		                  
	}

}


