package codingprobs;

public class BalancePoint {



	
	public static void main(String []args){
	       
	       int[] a = {2, 7, 4, 5, -3, 8, 9, -1};
	       
	        System.out.println("Balance point for a is index "+indexPoint(a));
	     }
	     public static int indexPoint(int[] input)
	    {
	    		int leftSum = input[0];
	    		int rightSum = 0;;
	    		for(int i=0; i<input.length;i++)
	    			rightSum += input[i];
	    		
	    		for(int i=0; i<input.length-1;i++)
	    		{
	    			if(leftSum==rightSum)
	    				return i;
	    			leftSum+=input[i+1];
	    			rightSum-=input[i];
	    		}
	    		return -1;
		}

}
