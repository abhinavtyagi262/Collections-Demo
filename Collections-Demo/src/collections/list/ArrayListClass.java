package collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		
		List<String> countries = new ArrayList<String>();	//insertion order is maintained and it is not synchronized
		countries.add("India");
		countries.add("USA");
		countries.add("China");
		countries.add("Germany");
		countries.add("India");
		
		System.out.println(countries);				//printing object of list
		
		for(String country : countries) {			//iteration using for-each loop
			System.out.println(country);
		}
		
		for(int i=0; i<countries.length(); i++){		//iteration using for loop
			System.out.println(countries.get(i));
		}
	}
}
