package dummy.practice;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class scannerClass {
	
	
	public static void main(String []args)
	{
		scannerClass scl=new scannerClass();
		List<String> lst= new ArrayList<String>();
		
		
		
		String spl="1234.5678.98098.90";
		
	String [] arr=	spl.split("\\.");
		
		System.out.println(Arrays.asList(arr));
		
		Scanner sc=new Scanner(System.in);
		//sc.useDelimiter("\\.");
		System.out.println(sc.delimiter());
		while(sc.hasNextLine())
		{
		String str=sc.nextLine();
		//System.out.println(scl.validUrl(str));
			//lst.add(str);
		System.out.println( str);
			
		}
		System.out.println("Print"+ lst);
		sc.close();
	}

	public String scanUse()
	{
	//	Scanner sc= new Scanner(source)
		return null;
	}
	
	public boolean validUrl(String str)
	{
		System.out.println("String"+str);
		int i= Integer.parseInt(str);
		if(i<4)
		return true;
		return false;
		
	}
	

}
