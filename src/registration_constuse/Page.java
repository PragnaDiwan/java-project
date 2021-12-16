package registration_constuse;

public class Page {

	
	private String fname;
	private String lname;
	private String email;
	private String phonno;
	private String passwd;
	private String cpasswd;
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonno() {
		return phonno;
	}

	public void setPhonno(String phonno) {
		this.phonno = phonno;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getCpasswd() {
		return cpasswd;
	}

	public void setCpasswd(String cpasswd) {
		this.cpasswd = cpasswd;
	}

	public  Page()
	{
		System.out.println("default Constructor");
	}
	
	public Page(String fname, String lname, String email) {
		
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}

	public  Page(String fname,String passwd)
	{
		this.fname=fname;
		this.passwd=passwd;
	}
	public  Page(String passwd,String fname,String email,String phone)
	{
		this.fname=fname;
		this.passwd=passwd;
	}
	
	
	
	

	
	
	
}
