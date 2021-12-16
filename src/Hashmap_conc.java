import java.util.HashMap;

public class Hashmap_conc {

	public static void main(String[] args) {
		
		HashMap<String,String>empmap=new HashMap<String,String>();
		
		empmap.put("A", "pragna");
		empmap.put("b", "test");
		empmap.put("c", "diwan");
		empmap.put(null, null);
		
		System.out.println(empmap.get("A"));
		
		
		HashMap<String,Integer>stumap=new HashMap<String,Integer>();
		stumap.put("A", 50);
		stumap.put("b", 70);
		stumap.put(null, 30);
		stumap.put("b", null);
		System.out.println(stumap.get(null));
		
		

	}

}
