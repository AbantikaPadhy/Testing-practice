package ExceptionPractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// scanner class provides us method that will help us to take input from the user runtime
       
		Scanner scan = new Scanner(System.in);
		try {
		
		System.out.println("Enter a number");
		int num1 = scan.nextInt();
		System.out.println("Enter a number");
		int num2 = scan.nextInt();
		
		int result = num1/num2;
		System.out.println(" The division of 2 numbers is: " +result);
	}
		catch(ArithmeticException e) {
			System.out.println("Please do not enter 0 in denominator");
		}
		catch(InputMismatchException e) {
			System.out.println("Please enter onlyinteger values");
		}
		catch (Exception e) {
			System.out.println("Please enter valid input");
		}
	}
}

