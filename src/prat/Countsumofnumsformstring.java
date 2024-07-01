package prat;

public class Countsumofnumsformstring {

	public static void main(String[] args) {
		String a="i have 10 pens you have 20 pens everybody has 10";
		String[]b=a.split(" ");
		int sum=0;
		int num=0;
	//	System.out.println(Arrays.toString(b));
		for(String x:b ) {
	//	System.out.println(x);
		if(x.matches("[0-9]+"))
		{	
    	 num=Integer.parseInt(x);
    	 sum=sum+num;
    	 }
		}	
		System.out.println(sum);
	}

}
