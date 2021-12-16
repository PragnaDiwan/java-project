package inhritance;

public class testcar {

	public static void main(String[] args) {
		
		Bmw b1=new Bmw();
		b1.refuel();
		b1.start();
		b1.stop();
		b1.autoparking();
		b1.engine();
		b1.refuel();
		
		Car c=new Car();
		c.engine();
		
		Car c1=new Bmw();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		
		Vehicle v=new Vehicle();
		v.engine();
		v.Auto();
		v.autostop();
		v.physic1();
		v.sciencestart();
		v.sciencestop();
		v.start();

		
		Vehicle v1=new Bmw();
		v1.engine();
		v1.start();
		
	
		
		Vehicle v2=new Car();
		v2.start();
		v2.engine();
		v2.Auto();
		v2.autostop();
		
		Audi a=new Audi();
		a.audisproty();
		a.auditrhedasafety();
		a.start();
		
		Science s1=new Bmw();
		s1.sciencestart();
		s1.sciencestop();
		s1.start();
		
		Physics p1=new Audi();
		p1.physic1();
		p1.sciencestart();
		p1.sciencestop();
		p1.start();
	    
		
	}

}
