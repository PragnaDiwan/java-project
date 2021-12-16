package oop_abstract;

public abstract class Page {
	
	
	public abstract void title();
	public abstract void url();
	
	public void header()
	{
		System.out.println("page header");
	}

	public final void logo()
	{
		System.out.println("page --------logo");
	}
}
