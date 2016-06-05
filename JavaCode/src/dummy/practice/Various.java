package dummy.practice;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class Various {

	  private int x; 
	    private int y; 

	    public static void main(String [] args) 
	    { 
	        Various that = new Various(); 
	        //(new Thread(that)).start( ); /* Line 8 */ 
	        //(new Thread(that)).start( ); /* Line 9 */ 
	    } 
	    public synchronized void run( ) /* Line 11 */ 
	    { 
	        for (;;) /* Line 13 */ 
	        { 
	            x++; 
	            y++; 
	            System.out.println("x = " + x + "y = " + y); 
	        } 
	    }
	
	

	    public final void lab()
	    {
	    	Map<String,String> nonsync= new TreeMap<String, String>();
	    	Collections.synchronizedMap(nonsync);
	    	 nonsync= new ConcurrentHashMap<String, String>();
	    	// Collections.sy
	    	 
	    }


}
