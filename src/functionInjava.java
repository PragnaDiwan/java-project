

public class functionInjava {
	
	
	public void test()
	{
		System.out.println("pass");
		int i=10;//local
		System.out.println(i);
	}
	// we can not create function in function
	//can call function with another fnction
	//1.no input no return
	
	//void means no return
	
	public void getPrint()
	{
		System.out.println("printmypaper");
	}
	
	
	//no input but some return
	public int getBalance()
	{
		System.out.println("get balance");
		int fee=10;
		int tax=20;
		int total=fee+tax;
		return total;
		
	}
	//no input but some return
	
	public String getTrainername()
	{
		System.out.println("print trainer name");
		
		String name="pragna";
		return name;
	}
	
	public boolean isempActive()
	{
		System.out.println("is emplouee active");
		return true;
	}
	
 //3 give input and return
	
	public int add(int a,int b) // and b method parameter
	{
		System.out.println("method add");
		
		int z=a+b;
		
		return z;
	}	
	
	//major advantage of function is  that we dont write the same code again& again
	
	public int getcoursefee(String coursename)
	{
		System.out.println("get course fee for "+coursename);
		if(coursename.equals("selenium"))
			return 100;
		else if(coursename.equals("mobile"))
			return 500;
		else if(coursename.equals("java"))
			return 300;
		else
			System.out.println("course not found");
		return -1;
			
	}
	
	public static void main(String[] args) {
	
		
		functionInjava obj=new functionInjava();
		
		obj.test();
		
		obj.getPrint();
		
		int p=obj.getBalance();
		
		System.out.println(p);
		obj.getTrainername();
		String s1=	obj.getTrainername();
		System.out.println(s1);
        obj.isempActive();
        if(obj.isempActive())
        {
        	System.out.println("prnt pass");
        }
		boolean b=obj.isempActive();
		System.out.println(b);
		
		int j=obj.add(10, 20); // 10,2o method argument
		System.out.println(j+20);
	    
		System.out.println(obj.getcoursefee("selenium"));
		int f2=obj.getcoursefee("csharp");
		System.out.println(f2);
	}
	

}
