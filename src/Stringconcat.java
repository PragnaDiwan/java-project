
public class Stringconcat {

	public static void main(String[] args)
	{
		String s="pragna diwan"; //string is a class and it is non primitive data type
		
		String s1="100";
		System.out.println(s1+" "+s);
		String Mobile="81411413966";
		String Account="5123456789012346";
		String x="hello";
		String y="testing";
		int a=100;
		int b=200;
		
		System.out.println(a+b);//addition
		System.out.println(x+y);//concatenation
		System.out.println(x+y+a+b);
		System.out.println(Mobile+Account);
		System.out.println(Mobile+" "+Account);
		System.out.println(x+y+(a+b));
        System.out.println(x+a);
        System.out.println(x+a+b);
        System.out.println(a+b+x);
        System.out.println(b+x+a);  // calculation start always from left to right
        System.out.println((x+y)+(a+b));
        System.out.println((x+y)+a+b);
        System.out.println("the value of a:" +a);
        double d1=12.33;
        double d2=12.35;
        System.out.println(d1+d2);
        
        char c1='a';
        char c2='b';
        System.out.println(c1+c2); // range a-z 97 to 122 ,A-Z =65 to 90  0-9 = 48 to 57
        System.out.println(c1+""+c2);
        
        byte b1=100;
        
        byte b2=120;		
                 
        System.out.println(b1+b2);
        
        int g =10;                  //both are integer then result is integer
        int h =3;
        System.out.println(g/h);
        
       System.out.println(10.0/2);        // if any float number then result is float
       System.out.println(10/2.0);
       System.out.println(10/3.0);
       System.out.println(10.0/3);
      // System.out.println(10/0); // both are integer and devided by zero then arithmetic exception get
       System.out.println(0/9);
      // System.out.println(0/0);//         // zero is a integer range so output will get arithmetic exception
       System.out.println(0.0/0);
       System.out.println(0/0.0); // when one of the zero is float number then NAN(not in number) will get
       System.out.println(5/0.0); //when number will devided by 0.0  then we get infinity
       System.out.println(5.0/0.0);
       char t='a';
       System.out.println(t);
       System.out.println((int)t);
          

	}

}
