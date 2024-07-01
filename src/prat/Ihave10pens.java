package prat;

import java.util.Arrays;

public class Ihave10pens {

	public static void main(String[] args) {
		String a="i have 10 pens";
		String[]b=a.split(" ");
		int num=0;
	//	System.out.println(Arrays.toString(b));
		for(String x:b ) {
	//	System.out.println(x);
		if(x.matches("[0-9]+"))
		{	
    	 num=Integer.parseInt(x);}
		}
			
		System.out.println(num);
		}
		

	}


