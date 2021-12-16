

public class car {

	String name;
	String color;
	int price;
	static int wheels=4;
	
	public static void main(String[] args) {
		
		car c1=new car();
		c1.name="honda";
		c1.color="red";
		c1.price=1000;
		
		car c2=new car();
		c2.name="maruti";
		c2.color="blue";
		c2.price=3000;
		
		System.out.println(c2.color+","+c2.name+","+c2.price);
	
		
		System.out.println(c1.color+"," +c1.name+"," +c1.price +":"+wheels);
		
		System.out.println(car.wheels);//static variable will be calling by classname
		System.out.println(c1.wheels);//calling by object // this is not right method to call static variable
	}

}
