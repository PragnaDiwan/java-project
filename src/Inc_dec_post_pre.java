
public class Inc_dec_post_pre {

	public static void main(String[] args) {
		
		//------------------------------Preincrement Post increment--------------------------------//
		int a=1;
		int b=a++;
		System.out.println(a);
		System.out.println(b); // first Assign the value and then increment done in post increment

		
      int j= -99;
      int h=j++;
		System.out.println(j);	
		System.out.println(h);
		
		int c=1;
		int d=++c;
		System.out.println(c);
		System.out.println(d); //First increment the value and then assign the value in pre increment
		
		int m =-97;
		int n=++m;
		System.out.println(m);
		System.out.println(n);
		
		//---------------------------post decrement and pre decrement------------------------//
		
		int a1=1;
		int a2=a1--;
		System.out.println(a1);
		System.out.println(a2);
		
		int b1=-20;
		int b2=b1--;
		System.out.println(b1);
		System.out.println(b2);
		
		int u=2;		
		int y=--u;
		System.out.println(u);
		System.out.println(y);
		
		
		int t1=2;
		System.out.println(t1++);
		System.out.println(t1);
		
		int l=5;
		System.out.println(++l);
		
		
		
	}

}
