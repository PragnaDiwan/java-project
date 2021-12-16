package Hashmap_concept;

import java.util.HashMap;

public class Loginpage {
	//RBAC USER/ROLES
	
	public  static String getusercred(String role)
	{
		
		HashMap<String,String>credmap=new HashMap<String,String>();
		
		credmap.put("user", "user@g.com;user@123");
		
		credmap.put("admin", "admin@g.com;admin123");
		credmap.put("customer", "cut@gmail.com;cust@123");
		
		return credmap.get(role);
	}
	public static void login(String un,String pwd)
	{
		System.out.println("login with"+un+":"+pwd+":");
	}
	
		
	
	
	

	public static void main(String[] args) {
		

		String cred[]=getusercred("customer").split(";");
		String un=cred[0].trim();
		String pwd=cred[1].trim();
		login(un,pwd);
		
	
		

	}

}
