package recursive;

public class recursiveFact {
	
	private static int index=0;
	private static int  stop=0;

	public static void main(String[] args) {
		System.out.println(fact(6));
	System.out.println(fib(6));
		
		String st="Print";
		char x='a';
		char y='b';
		
		System.out.println("char :"+x+y);
		
//		System.out.println(rev(st.toCharArray()));

	}

	
	public static int fact(int n)
	{
		if(n<=1)
			return 1;
		
		return n*fact(n-1);
	}
	
	public static int fib(int n)
	{
		if(n<=0)
	      return 0;
		if(n==1)
			return 1;
		int sum= fib(n-1)+fib(n-2);
		return sum;
	}
	
	public static String rev(char [] arr)
	{ String temp="";
		int i=arr.length-1;
		  while(i>=0) {
			 temp= temp+String.valueOf(arr[i]);
			 i--;
		  }
			  return temp;
	}
	
	/**
	 * public static String recRev(char[] arr){
	 
		
		int len= arr.length-1;
		if(len==0)
			return arr[0];
	 
	    return   arr[len]+recRev(arr[len-1]);
		
	}
**/
	 
}
