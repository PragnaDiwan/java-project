package oop_interface;

public interface Usmedical extends Who {
	
	public void physioservice();
	public void cardioservice();
	public void oncologyservice();
	public void emergencyservice();
	
	public static void billing()
	
	{
		System.out.println("us medical   billing");
	}


}
