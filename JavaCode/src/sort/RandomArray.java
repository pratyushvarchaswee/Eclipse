package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RandomArray {

	public static void main(String[] args) {
		RandomArray ra= new RandomArray();
		ra.randomNumUsingScuffle();
		
		
	}
	
	public void randomNumUsingScuffle()
	{
		Integer [] arr={16,17,184,98,16};
		List<Integer> lst=new ArrayList<Integer>();
		lst=Arrays.asList(arr);
		Collections.shuffle(lst);
	    System.out.println(lst);	
	}
	

		
}
