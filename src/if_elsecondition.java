
public class if_elsecondition {

	public static void main(String[] args) {
		
		//whenever we any comarision for primitive data types then we use== Assignment operator and for non primitive data type then we use equalto method//
		
		int a=10;
		int b=20;
		
		if(a>b)
		{
			System.out.println("b is greater than a");
		}
		
		if(b>a)
		{
			System.out.println("a is greater then a");
		}
		
		//dead code -complier is not reach to code   when condition true then no need to go elese print
		
//		if(true)
//		{
//			System.out.println("hi");
//		}
//		else
//		{
//			System.out.println("bye");
//		}
	
	//-------------------------------------Bleow is not dead code when first declare variable because vaiable value any time change------//	
		boolean flag=false;
		
		if(flag)
			
		{
			System.out.println("hi");            
		}
		
		else
		{
			System.out.println("bye");
						
		}
		
		//in if condition till condition not satisfied number of if condition check and performance hamper so we use switch case
		// when we have number of choices ,and in choice we have to perform different action then we use switch statement
		
		
		
		String browser="chrome";
		
		if(browser.equals("ie"))
		{
			System.out.println("ie");
		}
		
		else if(browser.equals("opera"))
			{
			System.out.println("launch opera");
			}
		
		else if(browser.equals("firefox"))
			
		{
			System.out.println("launch firefox");
		}
		else 
		{
			System.out.println("please pass the right browse");
		}
			
		
		
			}
	
	}
	
	
	


