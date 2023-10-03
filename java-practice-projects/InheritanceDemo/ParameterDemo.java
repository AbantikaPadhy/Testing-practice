package InheritanceDemo;

public class ParameterDemo {
	public void login(String username, String password)
	{
		System.out.println("Enter Username" + username);
		System.out.println("Enter Password" + password);
		System.out.println("Sign into mailbox");
	}
	public void ComposeEmail(String text)
	{
		System.out.println("Compose an Emailwith text as: "+ text);
		
	}
	
	public void logout()
	{
		System.out.println("Click on logout button");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create java class object
		// give a name to the object
		
		ParameterDemo obj = new ParameterDemo();
		
// call the method created in the class and pass the input value
		
		// object name .methodname
		
		obj.login("himadri", "user@123");
		obj.ComposeEmail("hii all");
		obj.login("admin", "admin");
		obj.logout();
		
				

	}
}
