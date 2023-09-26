package CollectionsDemo;
import java.util.ArrayList;
public class ArrayListDemo {
	public static void main(String[] args) {
	    // create an object of ArrayList class which is implementation mthod
			ArrayList<String> cities = new ArrayList<>();
			
			cities.add("london");
			cities.add("paris");
			cities.add(2,"new delhi"); // add value at an index in the list
			cities.add("mumbai");
			
			// size of arraylist
			
		System.out.println(cities.size()); // print the number of element 

		// print the items in the list
		
		// for each loop 
		
		for(String t: cities)
		{
			System.out.println(t);
		}
		}
}
