import java.util.ArrayList;

public class ArrayList_generic {

	public static void main(String[] args) {

		ArrayList<Integer>ar=new ArrayList<Integer>();
		
		ar.add(500);
		ar.add(300);
		ar.add(600);
		ar.add(25);
		System.out.println(ar.size());
		System.out.println(ar.get(1));
		
		
		
		ArrayList<Double>d1=new ArrayList<Double>();
		d1.add(12.33);
		d1.add(36.00);
		d1.add(45.00);
		System.out.println(d1.get(0));
		
		
		
		ArrayList<String>c1=new ArrayList<String>();
		c1.add("pragna");
		c1.add("kamlesh");
		c1.add("tina");
		c1.add("tina");
		
		System.out.println(c1.get(1));
		
		
	    ArrayList<Object>emp=new ArrayList<Object>();
	    emp.add("pragna");
	    emp.add(25);
	    emp.add('f');
	    emp.add(12.33);
	    
	    emp.remove(0);
	    for(int i=0;i<emp.size();i++)
	    {
	    	System.out.println(emp.get(i));
	    }
	    
	    
	    
	    for(Object e:emp)
	    {
	    	System.out.println(e);
	    }
		
	}

}
