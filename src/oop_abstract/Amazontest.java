package oop_abstract;

public class Amazontest {

	public static void main(String[] args) {
         Loginpage lp=new Loginpage();
         lp.title();
         lp.logo();
         lp.url();
         lp.header();
         lp.dologin("pragna", "global");
         lp.dologin("pragna", "global", 814114396);
         
         Homepage h=new Homepage();
         h.title();
         h.url();
         h.header();
         h.logo();
         h.logout();
         
         Page p=new Loginpage();
         p.title();
         p.url();
         p.logo();
         p.header();
         
	}

}
