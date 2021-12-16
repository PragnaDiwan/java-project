package assignment;



public class Static_array {

	public static void main(String[] args) {
//		Write a program to create a static Array, having following cricket data:
//			--name(String), age(age), team name(String), DOB(String), gender(char), Strike Rate(Double), isActive(boolean)
//			--Try to create multiple Object Arrays for different players 
//			--Try to print all the values of each player on the console using normal for/while loop and for 
//			each loop

		
            String name[]=new String[6];
            name[0]="pragna";
            name[1]="radha";
            name[2]="tina";
            name[3]="meena";
            name[4]="geeta";
            name[5]="reeta";
            System.out.println(name.length);
            System.out.println(name[0]);
            System.out.println(name[5]);
            
            for(String e:name)
            {
            	System.out.println(e);
            }
           // System.out.println(name[7]);//if we go beyond the limit then get array outofbond exception
            
            System.out.println("-------------------------------------------------------");
            
            int age[]=new int[6];
            age[0]=12;
            age[1]=15;
            age[3]=20;
            age[4]=60;
            age[5]=70;
            for(int i=0;i<age.length;i++)
            {
            	System.out.println(age[i]);       	
            	      	
         
            }
            
            String teamname[]=new String[6];
             teamname[0]="hyderabad";
             teamname[1]="gujarat";
             teamname[2]="mumbai";
             teamname[3]="puna";
             teamname[4]="mp";
             teamname[5]="banglore";
             
             String p[]=teamname.clone();
             
          
            
            if(teamname.equals(p))
            {
            	System.out.println("equal");
            	            	
            }
            else
            {
            	System.out.println("not equal");
            }
            
            
            String dob[]=new String[6];
            dob[0]="123646";
            dob[1]="536201";
            dob[2]="sdsdsd";
            dob[3]="123456";
            dob[4]="fdfddfd";
            dob[5]="dfdfdfdf";
            for(String e:dob)
            {
            	System.out.println(e);
            }
            
            char gender[]=new char[6];
            gender[0]='f';
            gender[1]='m';
            gender[2]='f';
            gender[3]='m';
            gender[4]='f';
            gender[5]='g';
            
            
            int k=0;
            for(char e:gender)
            	
            {
            	System.out.println(e);
            	k++;
            }
            
            boolean isactive[]=new boolean[6];
            isactive[0]=true;
            isactive[1]=false;
            for(boolean e:isactive)
            {
            	System.out.println(e);
            }
            
            Object player[]=new Object[6];
            player[0]="pragna";
            player[1]=21;
            player[2]="10682";
            player[3]=12.33;
            player[4]=true;
            player[5]='f';
            for(Object e:player)
            {
            	System.out.println(e);
            }
            
            
	}

}
