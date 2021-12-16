package oop_abstract;

public class Homepage extends Page {

	@Override
	public void title() {
		System.out.println("homepage ----------tit;e");
	}

	@Override
	public void url() {
		System.out.println("homepage ----------url");
	}
	@Override
	public void header()
	{
		System.out.println("homepage----------- header");
	}
	
	public void logout()
	
	{
		System.out.println("hp ----logout");
	}

}
