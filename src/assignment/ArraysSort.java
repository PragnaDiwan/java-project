package assignment;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSort {

	public static void main(String[] args) {

		int i[]=new int[4];
		i[0]=12;
		i[1]=13;
		i[2]=4;
		i[3]=10;

		Arrays.sort(i);
		
		System.out.println(i[0]+i[1]);
		
	   String a1[]= {"tina","meeta","geeta"};
	   System.out.println(Arrays.toString(a1));
	   Arrays.sort(a1);
	   System.out.println(Arrays.toString(a1));
	}

}
