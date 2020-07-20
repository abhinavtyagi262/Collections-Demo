package collections.list;

import java.util.List;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		
		List<String> countries = new Vector<String>();		//insertion order is maintained and it is synchronized
		countries.add("India");
		countries.add("USA");
		countries.add("China");
		countries.add("Germany");
		countries.add("India");
		
		System.out.println(countries);				//printing object of list
		
		for(String country : countries) {			//iteration using for-each loop (works on element)
			System.out.println(country);
		}
		
		for(int i=0; i<countries.length(); i++){		//iteration using for loop (works on index)
			System.out.println(countries.get(i));
		}	
	}
}
