package genrics;

import java.util.ArrayList;
import java.util.List;

public class B {

	public static void main(String[] args) {
		List<String>mh = new ArrayList<>();
		  mh.add("Pune");
		  mh.add("Nagpur");
		  
		List<String>jh = new ArrayList<>();
		 jh.add("Ranchi");
		 jh.add("Lohardaga");
		 
		 List<List<String>>india = new ArrayList<>();
		  india.add(mh);
		  india.add(jh);
		  
		 for(List<String> l:india)
		 {
			 for(String city :l)
			 {
				 System.out.println(city);
			 }
			 
		 }
			 
		  
		

	}

}
