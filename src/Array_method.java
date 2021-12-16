import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array_method {

	public static void main(String[] args) {
		
		ArrayList<Integer>number=new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		
		System.out.println(number);
		
		int i[]= {10,20,30,40};//Array Literals
		
		System.out.println(i);// if we use array.string method for static array then we get all array element
		System.out.println(Arrays.toString(i));
		
		
		ArrayList<String>lang=new ArrayList<String>(Arrays.asList("java","ruby","python","js"));
       
		System.out.println(lang);
		
		
		String lan[]= {"java","python"};
		System.out.println(Arrays.toString(lan));
		
		ArrayList<String>l1=new ArrayList<String>(Arrays.asList("a","b","c","d","f"));
		ArrayList<String>l2=new ArrayList<String>(Arrays.asList("a","b","c","e"));
		ArrayList<String>l3=new ArrayList<String>(Arrays.asList("d","b","c","a","f"));
		
		Collections.sort(l3); //to sort the array element list
		System.out.println(l3);
		System.out.println(l1.equals(l2));
		System.out.println(l1.equals(l3)); 
		
		if(l1.equals(l3))
		{
			System.out.println("pass value");
		}
		
		ArrayList<Character>l4=new ArrayList<Character>(Arrays.asList('a','b','c','e'));
		ArrayList<Character>l5=new ArrayList<Character>(Arrays.asList('a','b','c','f')); //add all element to l4
		//l5.removeAll(l4);
		//System.out.println(l5);
		
		l4.removeAll(l5);
		System.out.println(l4);
		
		// Find out the common element
		
		ArrayList<Double>d1=new ArrayList<Double>(Arrays.asList(12.00,35.2,41.0,20.15));
		ArrayList<Double>d2=new ArrayList<Double>(Arrays.asList(35.2,41.0,20.15));
		
		Collections.sort(d2);
		System.out.println(d2);
		Collections.sort(d1);
		System.out.println(d1);
		
		d1.retainAll(d2);
		System.out.println(d2);//print common element
		
		d1.addAll(d2);
		System.out.println(d1);
		
		
		ArrayList<String>lang1=new ArrayList<String>(Arrays.asList("java","ruby","python"));
		ArrayList<String>lang2=new ArrayList<String>(Arrays.asList("java","Ruby"));
		lang1.addAll(lang2);
		System.out.println(lang1);
	lang2.addAll(lang1);
	System.out.println(lang2);
	
	lang1.remove(2);
	System.out.println(lang1);
		lang1.add(0, "Gujarati");
		System.out.println(lang1);
		
		ArrayList<String>clonelist= (ArrayList<String>)lang1.clone(); //clone the method
		System.out.println(clonelist);
		
		
	}

}
