
public class DataType {

	public static void main(String[] args) {
		byte b=20;
		System.out.println(b);
		byte b1=10;
		System.out.println(b+b1);
		
		System.out.println(b); // 1-byte, Range= -128 to 127
		
		  short s1=1234;                   //2 byte,short range -32768 to 32767
		  System.out.println(s1);
		  //-------------------------------//
		  int i=-1234567890;
		  System.out.println(i);
		  
		                                 //4 byte,int range -2147
		  
		  
		  long g=12345627777777l;              // 8 byte
		  System.out.println(g);
		  // ---------------------------------// 
		  
		  float f1=12.33f;
		  float f2=(float)35.55;
		  System.out.println(f1);
		  System.out.println(f2);          // 4byte ,after point upto 7 digit declare
		  System.out.println(f1+f2);
		  
		  ////////////////////////////////////
		  
		  double d1=11111111111111.11; // 8 byte after point upto 16 decimal digit
		  System.out.println(d1);
		  
		  ///////////////////////////////////////
		  
		  char c1='a';
		  char c2='1';
		  char c3='+';
		  System.out.println(c1);
		  System.out.println(c2);
		  System.out.println(c3);  // char 2 byte
		  //////////////////////////////////////////////
		  
		  boolean a1=false;
		  System.out.println(a1);   // boolean size is 1 bit
		  
		  boolean a2=true;
		  System.out.println(a2);
		  
		  
		  
		  

		
	}
}
