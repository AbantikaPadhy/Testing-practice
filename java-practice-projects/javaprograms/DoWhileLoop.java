package javaprograms;

public class DoWhileLoop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Syntax of Do While loop
		
		//print a ststement 7 times, if the condition is true
		// if condition is not true , even then priint the statement atleast one.
		/* syntax of do while loop
		 * *
		 * * initialze the value
		 * 
		 * 
		 * do( // in this case thr loop will be executed atleast one
		 * 
		 * loop statement 
		 * increment operation
		 * 
		 * }
		 * while(condition)
		 
		 *
		 */
		int i = 1;
		
		do {
		
		System.out.println("today is wednesday");
		i++; // increment the value of i by 1
		
		
	}
		while(i<=7);
		
		System.out.println("Printed the massages. I am out of the loop");

}
}

