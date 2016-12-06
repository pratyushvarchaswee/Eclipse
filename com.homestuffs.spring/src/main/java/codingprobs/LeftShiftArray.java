package codingprobs;

import java.util.Arrays;
import java.util.Scanner;

public class LeftShiftArray {

	

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int a[] = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	       int result[]=leftShuffle(a, k);
	       System.out.println("Array");
	        for(int a_i=0; a_i < n; a_i++){
	        System.out.print("Array"+result[a_i]);
	        }
	    }
	    
	    public static int [] leftShuffle(int [] arr, int left)
	        {
	        int len= arr.length-1;
	        if(len<left||len<1)
	            return arr;
	        for(int i=0; i>= len;i++)
	            {
	            if(i-left<0)
	                {
	                arr[len-left-i-1]=arr[i];
	                
	            }
	            else
	            arr[i]=arr[i+left];
	        }
	        return arr;
	    }
	}

