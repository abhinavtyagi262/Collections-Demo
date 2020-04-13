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
		
		System.out.println(countries);
		
		for(String country : countries) {
			System.out.println(country);
		}	
	}
}
