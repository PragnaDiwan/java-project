package assignment;

public class Customers_Static {
	
	String name;
	int id;
	static String city="banglore";
    static String paymnetmethod="cc";
    
    public void getinfo()
    {
    	System.out.println("get info");
    	sendmail();
    }
    
    public static void sendmail()
    {
    	System.out.println("sned  the mail"); 
    	
    }
	public static void main(String[] args) {
		
		Customers_Static c1=new Customers_Static();
		c1.getinfo();
		
		
	}

}
