package prat;

import java.util.Arrays;

public class Countnumofwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="todays is friday";
		int count=0;
		 String[]b=a.split(" ");
	//	 System.out.println(Arrays.toString(b));
		 for(String x:b)
		 {
		 if(x.matches("\\w+"))
		 {
			 count++;
		 }
		 }
		 System.out.println(count);
		 }
		 }


