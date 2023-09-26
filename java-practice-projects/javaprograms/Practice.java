package javaprograms;

public class Practice {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// method3: subtring()
		
	    String title2 = "Practice labs java";

	// from string title2 extract only java
	// store it in a new string result
	    String result = title2.substring(14);

	// write condition if result equals java. test case pass

	    if(result.equals("Practice labs java))"))
	    {
	    	System.out.println("String is valid");
	    }
	// else test case failed
	    else {
	    	System.out.println("String is not valid");
	    }
	}
}