package java8.demo;

import java.util.Arrays;
import java.util.List;
import java8.helper.Sample;

public class LamdaComparator {
	
	public static void main(String [] args)
	{
		Sample [] sm = new Sample[10];
		 sm[0]=new Sample("Green","150","Apple");
		 sm[1]=new Sample("Green","650","Orange");
		 sm[2]=new Sample("Red","250","Apple");
		 sm[3]=new Sample("Green","150","Pear");
		 sm[4]=new Sample("Green","150","Banana");
		 sm[5]=new Sample("Green","450","Olive");
		 sm[6]=new Sample("Green","150","Kiwi");
		 sm[7]=new Sample("Red","850","Apple");
		 sm[8]=new Sample("Blue","150","Apple");
		 sm[9]=new Sample("Ornage","350","Apple");
		List<Sample> lst= Arrays.asList(sm);
		lst.sort((Sample s1, Sample s2)-> {
		return	(s1.getName().compareTo(s2.getName())) & ( s1.getWeight().compareTo(s2.getWeight()));
		});
		
		System.out.println(lst);
		 
		
	}

}
