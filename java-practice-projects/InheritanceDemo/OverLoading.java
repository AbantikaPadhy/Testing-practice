package InheritanceDemo;

public class OverLoading {
	public int sum()
	{
		// local variables : variables within a method
		int a =10;
		int b =20;
		int result =a+b;
		return result; 
	}
	
	public int sum(int a, int b, int c)
	{
		// local variables : variables within a method
		 a =10;
		 b =20;
		 c =200;
		int result =a+b+c;
		return result; 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		 OverLoading obj = new OverLoading();
		 
		 System.out.println(obj.sum());
		 System.out.println(obj.sum(10,20,30));
	}
}
