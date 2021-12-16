package constructorconcept;

public class User {

	String fname;
	int id;
	boolean isactive;
	String city;
	public User(String fname, int id, boolean isactive, String city) {
		
		this.fname = fname;
		this.id = id;
		this.isactive = isactive;
		this.city = city;
	}
	public User(String fname, boolean isactive) {
		
		this.fname = fname;
		this.isactive = isactive;
	}
	public User(String fname, String city) {
	
		this.fname = fname;
		this.city = city;
	}
	
	
	
}
