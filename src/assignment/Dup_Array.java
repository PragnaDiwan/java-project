package assignment;

public class Dup_Array {

	public static void main(String[] args) {
		
		
		
		String word[]= {"pragna","tina","pragna","meet","tina","geeta"};
		
		System.out.println(word.length);
		
		for(int i=0;i<word.length;i++)
			
		{
			System.out.println(word[i]);
		}
		
		
		/**
		 //find duplicate in array
		 */
		System.out.println("=======================================");
		for(int j=0;j<word.length;j++)
		{
			for(int k=j+1;k<word.length;k++)
				
			{
				if(word[j].equals(word[k]))
					
					{System.out.println(word[j]);}
					
			}
		}
	}}
			
		
		
		
		
		
				
		
	
	
		
	
	
	
	
	
	

	


