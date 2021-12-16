package superkeyword;

public class Loginpage extends Page {
	int timeout=200;
	
	
	public Loginpage()
	{super(10);
	
		System.out.println("loginpage constructor");
		
	}
	
	
	
	
	
	
	public void logininfo()
	{
		System.out.println("login info methos");
		
	}

  public void display()
	
	{
		System.out.println("lp  display");
		
		super.display();
		System.out.println(super.timeout);
	}
	
	public void gettimeout()
	{
		System.out.println(timeout);
		
		System.out.println(super.timeout);
	}
}
