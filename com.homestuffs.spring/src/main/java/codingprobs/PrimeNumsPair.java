package codingprobs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrimeNumsPair {

	public static void main(String[] args) {
	       Scanner sc= new Scanner(System.in);
	        int n= sc.nextInt();
	        int m= sc.nextInt();
	  //  System.out.println( primeNums(n,m).stream().distinct().collect(Collectors.toList()));
	        System.out.println(  primeNums(n,m));
	        primeNums(n,m).stream().distinct().forEach(System.out::println);
	    }
	    
	    public static List<Integer> primeNums(int n, int m)
	        {
	        List<Integer> lstPrime=new ArrayList<>();
	        boolean flag=false;
	        for(int i=n; i<m;i++)
	            {
	              
	            for(int j=2;j<i;j++)
	                {
	                
	                 if(i%j!=0)
	                     {
	                	 flag=true;
	                   
	                 }else{
	                	 flag=false;
	                	 break;
	                 }
	            }
	           
	            if(flag)
	            	  lstPrime.add(Integer.valueOf(i));
	            
	        }
	    return  lstPrime;}
	    
	    public static int  pairWithDiff2(List<Integer> lst)
	    {
	    	
	    	return 0;
	    }

}
