
public class Switchcase {

	public static void main(String[] args) {
	
//		String browser="Opera";
//		
//		 switch (browser.toLowerCase()) {
//		case "firefox":
//		{
//			System.out.println("launch the firefox");
//		}
//			break;
//			
//		case "ie":
//		{
//			System.out.println("launch the ie");
//		}
//			break;
//			
//		case "opera":
//		{
//			System.out.println("launch the opera");
//		}
//			break;
//		default:
//			
//		{
//			System.out.println("please pass the right browser");
//		}
//		break;
//		}
//	
	 int marks=100;
	 
	 switch(marks)
	 {
	 case 50:
	 {
		 System.out.println("grade B");
	 }
	 break;
	 case 60:
		 
	 {
	 System.out.println("grade A");
	 }
	 break;                                      // switch case is  not applicable for boolean expression
	 
	 case 90:
		 
	 {
		 System.out.println("grade c");        //practical example:when we want to change run diff environment like QA,DEV or production

	 }
	 default:
	 {
		 System.out.println("fail");
	 }
	 }
	 //--------------------------------------------//
	 boolean flag=false;
	 if(!flag)
	 {
		 System.out.println("hi");
	 }
	 
	}

}
