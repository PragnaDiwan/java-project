package practice;

public class page {
	
	int timeout=100;
	
	public page()
	{
		System.out.println("default constructor");
	}
	
	public page(int a)
	{
		System.out.println("constructor "+a);
	}
	
	
	
	public void display()
	{
		System.out.println("page display");
	}

	
	public void gettimeout()
	{
		System.out.println(timeout);
	}
}
