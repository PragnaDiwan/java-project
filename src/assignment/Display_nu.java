package assignment;

public class Display_nu {
	
	
	public String Marks(int mark)
	{
        
		
		if(mark>=91&&mark<=100)	
			
			return "aa";
		
		
		else if(mark>=81&&mark<=90)
		return "ab";
		else if(mark>=71&&mark<=80)
			return "bb";
		else if(mark>=61&&mark<=70)
			return "bc";

		else if(mark>=51&&mark<=60)
			return "cd";
		else if(mark>=41&&mark<=50)
			return "dd";
		else 
			return "fail";
		
		
			}	
	
	

	public static void main(String[] args) {
	
		Display_nu n1=new Display_nu();
           String p=n1.Marks(30);

          System.out.println(p);
}

}
