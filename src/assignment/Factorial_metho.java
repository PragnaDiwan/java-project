package assignment;




public class Factorial_metho {
	
	public int Facto(int n)
	{
		int res=1;
		for(int i=1;i<=n;i++)
		{
			res=res*i;
		}
		return res;
	}
	

	public static void main(String[] args) {
//		Write a program to print the factorial of a number by defining a method named 'Factorial'.
//		Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
//		4! = 1*2*3*4 = 24
//		3! = 3*2*1 = 6
//		2! = 2*1 = 2
//		Also,
//		1! = 1
//		0! = 0
		
//		
//		int n=5;int result =1;
//		
//	for(int i=1;i<=n;i++)
//	{
//		
//		result=result*i;
//		
//	}
//	System.out.println(result);
	Factorial_metho f1=new Factorial_metho();
	int res=f1.Facto(5);
	System.out.println(res);
		
	}

}
