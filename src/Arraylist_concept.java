import java.util.ArrayList;

public class Arraylist_concept {

	public static void main(String[] args) { 
		
		// ArrayList is a default class and new keyword help to create new object ar
		// it is used data are dynamic like numbe of order booking in website,number of user,number of product added on website
		ArrayList ar=new ArrayList();
		ar.add(100);
		ar.add(500);
		ar.add(400);
		System.out.println(ar.size());
		
		System.out.println(ar.get(1));
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
			
			
		}
		
		
		ArrayList ar1=new ArrayList();
		
		ar1.add(600);
		ar1.add(800);
	    ar1.add(990);
	    System.out.println(ar1.get(2));
		System.out.println(ar1.getClass());
		System.out.println(ar1.remove(0));
		//System.out.println(ar1.get(7)); // if we go beyond the limit then get arrayindex outof bond exception
	}

}
