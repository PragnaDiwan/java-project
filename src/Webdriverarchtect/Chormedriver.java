package Webdriverarchtect;

public class Chormedriver implements Webdriver {
	
	
	public Chormedriver()
	
	{
		System.out.println("launch the chrome browser");
	}

	@Override
	public void findelement() {
         System.out.println("find element");		
	}

	@Override
	public void findelements() {
        System.out.println("find elements");		
		
	}

	@Override
	public void click() {
        System.out.println("click element");		
		
	}

	@Override
	public void sendkeys(String Value) {
        System.out.println("pass value:"+Value);		
		
	}

	@Override
	public void get(String url) {
        System.out.println("pass url:"+url);		
		
	}

	@Override
	public void gettitle() {
		System.out.println("give title:");		
	}

	@Override
	public void close() {
		System.out.println("close the browser" );
		
	}

}
