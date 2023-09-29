package CollectionsDemo;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListDemo {
public static void main(String[] args) {
		
		LinkedList<String> cities = new LinkedList<>();
		
		
		cities.add("london");
		cities.add("paris");
		cities.add(2,"new delhi"); // add value at an index in the list
		cities.add("mumbai");
		
		// size of the linked list
		
		System.out.println(cities.size());
		
		// print the values of the list
		
		Iterator itr = cities.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// get a value from the list
		
		System.out.println(cities.get(1));
		
		// does list contain a value
		
		System.out.println(cities.contains("Hyderbad")); //return true or false
}
}
