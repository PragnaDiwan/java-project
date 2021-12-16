package assignment;

public class Misingnum_array {

	public static void main(String[] args) {
		
		
		//n(n+1)/2 formula
		
		
		int num[]= {1,2,3,4,5,6,8};
		int sum=0;
		
		//finding the sum of array
		for(int i=0;i<num.length;i++)
		{
						
			 sum=sum+num[i];
			
		}
		 System.out.println(sum);
		
		int expres=(num.length+1*num.length+2)/2;
		System.out.println(expres);
		
	}
	
	
	

}
