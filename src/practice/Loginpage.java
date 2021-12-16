package practice;

public class Loginpage extends page {

	
		int timeout =200;
		
		public Loginpage()
		
		{
			super(10);
			System.out.println("lp default constructor");
			
		}
		
		public void login()
		
		{
			System.out.println("login with");
			super.display();
			
		}
		
		@Override
		public void display()
		{
			System.out.println("lp display");
			System.out.println(timeout);
			System.out.println(super.timeout);
		}
	
}
