package assignment;

public class Browswer {
	
	String name;
	Double Version;
	String vendorname;
	
	public void getinfo(Browswer br)
	{
		//System.out.println(br.name +" "+br.vendorname +br.Version);
		System.out.println("hi");
	}
	
	public void sum(int a,int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) 
	{
		
		Browswer b=new Browswer();
		b.name="pragna";
		b.Version=10.0;
		b.vendorname="google";
		b.getinfo(b);
		
		
		b.sum(20, 300);
	}

}
