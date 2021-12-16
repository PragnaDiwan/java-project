package Webdriverarchtect;

public interface Webdriver extends searchcontext {
	
	@Override
	public void findelement();
	public void findelements();
	
	public void click();
	public void sendkeys(String Value);
	public void get(String url);
	public void gettitle();
	public void close();
}
