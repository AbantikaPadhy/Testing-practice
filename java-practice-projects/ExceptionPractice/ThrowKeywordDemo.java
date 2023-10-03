package ExceptionPractice;
import java.util.InputMismatchException;
public class ThrowKeywordDemo {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ThrowKeywordDemo obj = new ThrowKeywordDemo();
		obj.div(12,0);
	}
		
	public void div(int a, int b)
	{
		// let us assume ArithemeticExecption class is our custom exexption class
		// throw keyword is used for giving custom exeption when the method is called it false
		
		if (b==0)
		{
			throw new InputMismatchException();
			
		}
		else {
			
		}
		int c =a/b;
		System.out.println("The division of 2 number is :" + c);
	}

	
	//public static void main(String[] args) {
		
		

	}