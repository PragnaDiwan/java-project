
public class Ecomm {

	public void login(int uname,String pwd)
	{
		System.out.println("login with"+":"+uname +":"+pwd);
	}
	
	public void login()
	{
		System.out.println("login with sucessfull");
	}
	
	public void login(int uname,String pwd,int otp)
	{
		System.out.println("login with"+":"+uname+":"+pwd+":"+otp);
	}
	
	public String login(String ph)
	{
		System.out.println(ph);
		return ph;
	}
	
	
	public void search(String productname)
	{
		System.out.println(productname);
	}
	public void search(String productname,int price)
	{
		
		System.out.println(productname+"," + price);
	}
	
	public void search(String productname,int price,String color)
	{
		System.out.println(productname + price +color);
	}
	public void search(String brandname,String productname)
	{
		System.out.println(brandname + productname);
	}
	public static void main(String[] args) {
		
		Ecomm e1=new Ecomm();
		e1.login("8141143966");
		e1.login(123,"global");
		
		e1.search("phone", 10000);
		
	}

}
