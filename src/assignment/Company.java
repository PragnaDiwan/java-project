package assignment;

public class Company {

	public String name;
	private int shareprice;
	public String headquater;
	
	public void setshareprice(int sp)
	{
		shareprice=sp;
	}
	
	public int getshareprice()
	{
         
         return shareprice;
	}
	
	public static void main(String[] args) {
		
		Company c1=new Company();
		c1.name="Microsoft";
		c1.shareprice=1000;
		c1.headquater="mumbai";
		int p=c1.getshareprice();
		System.out.println(p);
	}

}
