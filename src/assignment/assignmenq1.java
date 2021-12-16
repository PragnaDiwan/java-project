package assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class assignmenq1 {

	public static void main(String[] args) {
		// Write a Java program to create a new array list, add some colours (string) and print out the collection
		
		ArrayList<String>color=new ArrayList<String>();
		color.add("blue");
		color.add("red");
		color.add("yellow");
		color.add("blue");
		color.add("white");
		color.add("pink");
		System.out.println(color.get(0));
		
		color.remove(5);
		System.out.println(color.size());
		for(String e:color)
		{
			System.out.println(e);
		}
		
		//2. Write a Java program to insert an element into the array list at the first and last positions.
		
		ArrayList<Integer>n1=new ArrayList<Integer>();
		n1.add(30);
		n1.add(1, 20);
		n1.add(2,25);
		for(int e:n1)
		{
			System.out.println(e);
		}
		
		//Write a Java program to retrieve an element (at a specified index) from a given array list.
		
		System.out.println(color.get(4));
		System.out.println(n1.get(1));
		
		//Write a Java program to update specific array element by given element.
		
		color.set(4, "black");
		System.out.println(color.get(4));
		System.out.println("-----------------------------------------------");
		
		
		
	    color.set(4, "parot");
	    
	    int i=0;
	
		for(String e:color)
		{
			System.out.println(e +":"+i );
			i++;
		}
		
	//	Write a Java program to remove the third element from a array list. 
		color.remove(3);
		System.out.println(color.size());
		
		
			
			for(String e:color)
			{
				System.out.println(e );
				
			}
			
			//Write a Java program to search an element in a array list.
			
			ArrayList<Character>a1=new ArrayList<Character>(Arrays.asList('a','b','c','d'));
			
			
			
			if(a1.contains('a'))
				
			{
				System.out.println("a is avaialble");
			}
			
			//Write a Java program to reverse elements in a array list
			System.out.println("--------------------------------------------------------");
			ArrayList<String>name=new ArrayList<String>();
			
			name.add("meeta");
			name.add("geeta");
			name.add("sita");
			
			
			for(int k=name.size()-1;k>=0;k--)
			{
				System.out.println(name.get(k));
			}
			
			//Write a Java program to extract a portion of a array list.
		
			
			ArrayList<Integer>n2=new ArrayList<Integer>(Arrays.asList(20,30,40,50,60,70));
			
			n2.subList(1, 3);
			
	}

}
