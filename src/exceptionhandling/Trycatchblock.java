package exceptionhandling;

public class Trycatchblock {

	public static void main(String[] args) {
		
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try {
			int i=8/0;
		}
		catch(ArithmeticException e)
         {
			System.out.println("some exception");
			e.printStackTrace();
		}
		
		System.out.println("b");
		System.out.println("b");

		System.out.println("b");

	}

}
