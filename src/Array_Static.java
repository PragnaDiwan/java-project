
public class Array_Static {

	public static void main(String[] args) {
		
		// limitation of static array is that the size of the array is fixed and we can not store diffent type of data in array
	
		int[] emp=new int[4];
		
		emp[0]=20;
		emp[1]=40;
		emp[2]=50;
		emp[3]=60;
		//System.out.println(emp[4]); if we go beyond the limit then indexoutofbond exception error we get
		
		System.out.println(emp[0]);
		
		//use case:when size of the array is fixed like menu items,Static link in website,dropdown,number of row and column in webtable
		
		for(int i=0;i<emp.length;i++)
  
		{
			System.out.println(emp[i]);
			
		}
		
		
		
		
	}

}
