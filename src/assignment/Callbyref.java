package assignment;

public class Callbyref {
	
	String vendor;
	String name;
	double version;
	
	public void getinfo(Callbyref c1)
	{
		System.out.println(c1.vendor+" "+c1.name+" "+c1.version);
	}
	
	
	

	public static void main(String[] args) {
		Callbyref b=new Callbyref();
		b.vendor="google";
		b.name="chrome";
		b.version=95.0;
		
		b.getinfo(b);
	}

}
