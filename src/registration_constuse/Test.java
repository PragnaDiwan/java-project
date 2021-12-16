package registration_constuse;

public class Test {
	
	

	public static void main(String[] args) {
             
		Page p1=new Page();
	p1.setFname("tina");
	p1.setPasswd("global");
	p1.setLname("diwan");	
	p1.setPhonno("8141143966");
	p1.setCpasswd("global");
	
	System.out.println(p1.getFname()+" "+p1.getPasswd()+" "+p1.getLname()+" "+p1.getPhonno()+" "+p1.getCpasswd());
}}
