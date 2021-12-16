package assignment;

public class Print_withoutloop {

	public static void main(String[] args) {
		
		
		Print_withoutloop p= new Print_withoutloop();
		
		p.printnum(1);
	}
	
	
	
	public void printnum(int num)
	{
		
		if(num<=100)
		{
			System.out.println("num:"+num);
			num++;
			printnum(num);
		}



}
}

