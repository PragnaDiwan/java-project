package exceptionhandling;

public class Throws  {
	
	public void m1() 
	{
		System.out.println("m1");
		m2();
	}
	
	public void m2() 
	{
		System.out.println("m2");
		
		try {
		m3();}
		
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("exception is coming");
			
			
		}
	}
	
	public void m3() throws ArithmeticException
	{
		System.out.println("m3");
	
		
		int i=9/0;
	
		
	}

	public static void main(String[] args)  {
		
		Throws t1=new Throws();
		t1.m1();
		System.out.println("bye");
		

	}

}
