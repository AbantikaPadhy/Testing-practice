package javaprograms;

public class InbuiltDemo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String title = "Learning Java";
		
		// contain () method
		// this method will check if your expected string has desired set of charectors or not
		// this method will return boolean output (true or false)
		
		//title page ==> validate if title is correct or not
		// if title is correct print test case pass, else print testcase fail
		
		// method : using contains() method
		
		  if(title.contains("Simplilearn")) {
			  System.out.println("Title is valid. Test case pass");
			  
		  }
		  else {
			  System.out.println("Title is not valid. Test case failed");
		 
			  
		  }
		  
		  // method2: equals()
		  // this method compare 2 strings every character
		  // it will give output as true or false
		  
		  if(title.equals("Simplilearn online course")) {
			  System.out.println("Title is valid. Test case pass");
			  
			  
		  }
		  else {
			  System.out.println("Title is not valid. Test case failed");
		  }
	}
	
// method3: subtring()
	
   // String title2 = "Practice labs java";

// from string title2 extract only java
// store it in a new string result
  //  String result = title2.substring(14);

// write condition if result equals java. test case pass

   // if(result.equals("Java))"))
    {
    	//System.out.println("String is valid");
    }
// else test case failed
    //else {
    	//System.out.println("String is not valid");
   // }
//}
}
