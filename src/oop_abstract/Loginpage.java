package oop_abstract;

public class Loginpage extends Page{

	@Override
	public void title() {
		System.out.println("lp -----title");		
	}

	@Override
	public void url() {
		System.out.println("lp -----url");		
		
	}
	
	public void dologin(String un,String pass)
	{
		System.out.println("login with "+un+" "+pass);
	}

	public void dologin(String un,String pass,long phone)
	{
		System.out.println("login with "+un+" "+pass+" "+phone);
	}
}
