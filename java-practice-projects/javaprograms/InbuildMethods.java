package javaprograms;

public class InbuildMethods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// example of how to use inbuilt methods of string class
		
		String s1 = "Seleninm";
		String s2 = "training";
		
		// concatinate both the strings and print it
		// use + operator
		
		String s3 = s1+s2; //seleniinm training
		
		// concatinate using string classconcat method
		
		String s4 = s1.concat(s2); //seleniinm training
		
		String s5 = s1.concat("with Simplilearn");
		
		System.out.println("Concatination using + operator ; " + s3);
		
		System.out.println("Concatination using concat method ; " + s4);
		
		

	}
}
