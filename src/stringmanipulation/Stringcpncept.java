package stringmanipulation;


public class Stringcpncept {

	public static void main(String[] args) {
		
		String s="This is my java code and I am so Happy and i am so happy";
		
		System.out.println(s.length());
		
		System.out.println(s.charAt(0));  // give character for specific index
		System.out.println(s.charAt(6));
		System.out.println(s.indexOf('h'));  // give index for specific character
		System.out.println(s.indexOf('i'));

		
		
		System.out.println(s.indexOf('i', s.indexOf('i')+1));
		//number of occurence of character and index program 
		//Method 1
		
		int count =0;
//		for(int i=0;i<s.length();i++)
//			
//		{
//			if(s.charAt(i)=='i')
//			{						
//				count++;
//			System.out.println("index:"+i);
//			
//		}}
//		
//		System.out.println("count:"+count);
		
		
		//number of occurence of character and index program Method 2
		
		for(char ch:s.toCharArray())
		{
			if(ch=='i')
			{
				count++;
				
			}
			
					
		}
		System.out.println("count:"+count);
		

System.out.println("======================================");
		System.out.println(s.toLowerCase());
		
		System.out.println(s.trim());
		System.out.println(s.replace(" ",""));
		
		String dob="02-06-82";
		System.out.println(dob.replace("-", "/"));
		
		
		//Split
		
		String p1="java_ruby_python_php";

		String langarray[]=p1.split("_");
		System.out.println(langarray[0]);
		
		for(String e:langarray)
		{
			System.out.println(e);
		}
		
		
		String name="XXtestingXXseleniumXXjavaXX";
		String namearr[]=name.split("XX");
		System.out.println(namearr.length);
		
		for(String e:namearr)
		{
			System.out.println(e);
		}
		
		String mes="the order id is:12346";
		System.out.println(mes.substring(10));
		System.out.println(mes.substring(0, 6));
		System.out.println(mes.substring(mes.indexOf("is")+3, mes.length()));
		String orderid=(mes.substring(mes.indexOf("is")+3, mes.length()));
		System.out.println("orderid is:"+orderid);
	}

}
