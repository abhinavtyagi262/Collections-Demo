package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		
		List<String> countries = new ArrayList<String>();		//insertion order is maintained and it is not synchronized
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
