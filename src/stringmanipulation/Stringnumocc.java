package stringmanipulation;

public class Stringnumocc {
	
	

	public static void main(String[] args) {
		
		int count=0;
		String s="This is my java code and I am so Happy and i am so happy";
		
//		for(char ch:s.toCharArray())
//		{
//			if(ch=='i')
//			{
//				count++;
//				
//			}
//			
//					
//		}
//		System.out.println("count:"+count);
//		
		
		
		
		for(int i=0;i<s.length();i++)
		
		{
			if(s.charAt(i)=='i')
			{						
				count++;
			System.out.println("index:"+i);
			
		}}
		
		System.out.println("count:"+count);
		
	}

}
