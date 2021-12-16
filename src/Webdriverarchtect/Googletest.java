package Webdriverarchtect;

public class Googletest {

	public static void main(String[] args) {
		
		Chormedriver driver=new Chormedriver();
		
		driver.click();
		driver.close();
		driver.findelement();
		driver.findelements();
		driver.gettitle();
		driver.get("google.com");
		driver.sendkeys("pragna");
	}

}
