package assignment;

public class Browser_encap {
	
	public void launchbrowser()
	{
		System.out.println("browser is launched");
		chkversion();
		chkram();
		
		}
	
	private void chkversion()
	{
		System.out.println("browser version" );
		
	}

	private void chkram()
	{
		System.out.println("browser required ram");
	}
}
