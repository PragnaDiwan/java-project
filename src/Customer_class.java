

import java.util.ArrayList;





public class Customer_class {
	
	
	public ArrayList<String> doSearch(String productname)
	{
		System.out.println("searching the product:"+productname);
		
		ArrayList<String>prodlist=new ArrayList<String>();
		
		switch (productname) {
		case "apple": {
			prodlist.add("iphone12");
			prodlist.add("mac");
			prodlist.add("headphone");
		  break;
		}
         case "samsung": {
			
        	 prodlist.add("tab");
 			prodlist.add("11");
 			break;
		}
case "nokia": {
	
	 prodlist.add("nokia11");
		prodlist.add("nokia12");
		break;}


		default:
			System.out.println("product not found");
			break;
		}
		return prodlist;
	}
	
	
	public String launchBrowser(String browsername)
	{
		System.out.println("print the browsername :" +browsername);
		if(browsername.equals("chrome"))
		{
			System.out.println("launch the browser :" +browsername);
		}
		else if(browsername.equals("ff"))
		{
			System.out.println("launch the browser :" +browsername);
		}
	 
		else
		{
			System.out.println("bowser is not avaialbel :" +browsername);
		}
		
		return browsername;
	}
	
	//using switchcase
	
	public String launch_Browser(String browser)
	{
		System.out.println("print browsername"+":"+browser);
		
		switch (browser) {
		case "chrome": 
		{
	      System.out.println("launch the chrome");
		break;
					}
		case "ff": 
		{
	      System.out.println("launch the ff");
		break;
					}
		
		case "opera": 
		{
	      System.out.println("launch the opera");
		break;
					}
		default:
			System.out.println("browser is not launch:"+browser);
			break;
		}
		
		return browser;

	}
	

	public static void main(String[] args)
	{
		//method are defining behaviour of objec and variable are defining the property of  object
		
		//method=feature like human do run,walk
			
		Customer_class c1=new  Customer_class();
		System.out.println(c1.doSearch("nokia"));
		
		ArrayList<String>appleprodlist=c1.doSearch("apple");
		System.out.println(appleprodlist);
		System.out.println(appleprodlist.size());
		
		c1.doSearch("samsung");
		
		ArrayList<String>samsunglist=c1.doSearch("samsung");
		
		System.out.println(samsunglist);
		
		for(String e:samsunglist)
		{
			System.out.println(e);
		}
		
		ArrayList<String>hplist=c1.doSearch("hp");
		
		System.out.println(hplist.size());
		System.out.println(hplist);
		
		c1.launchBrowser("opera");
		System.out.println("==========================================");
		c1.launch_Browser("safari");
	}

}
