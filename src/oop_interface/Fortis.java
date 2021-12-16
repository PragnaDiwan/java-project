package oop_interface;

public class Fortis extends Unhg implements Usmedical,Ukmedical,Indianmedi {

	@Override
	public void physioservice() {
System.out.println("fh------physio");		
	}

	@Override
	public void cardioservice() {
		System.out.println("fh------cardio");		
		
	}

	@Override
	public void oncologyservice() {
		System.out.println("fh------oncology");		

	}

	@Override
	public void ent() {
		System.out.println("fh------ent");		
		
	}

	@Override
	public void pedia() {
		System.out.println("fh------pedia");		

		
	}

	@Override
	public void ortho() {
		System.out.println("fh------ortho");		
		
	}

	@Override
	public void dental() {
		System.out.println("fh------dental");		
		
	}

	public void medicaltrain()
	{
		System.out.println("fh------medicaltraing");		

	}public void otpservice()
	{
		System.out.println("fh------otpservice");		

	}

	@Override
	public void emergencyservice() {
		System.out.println("fh==emergency services");
		
	}

	@Override
	public void covidtest() {
		System.out.println("Fh============covidtest");
		
	}
	
	
}
