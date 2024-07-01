package prat;

import java.util.Arrays;

public class Thisismylaptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String s = "this is my laptop";
           String output="";
           String[]a=s.split(" ");
         //  System.out.println(Arrays.toString(a));
           for(int i=a.length-1;i>=0;i--)
           {
        	   System.out.print(a[i]+" ");
        	 //  output=a[i]+" "+output;
           }
        //  System.out.println(output);
	}

}
