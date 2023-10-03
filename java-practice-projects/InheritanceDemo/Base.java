package InheritanceDemo;

public class Base {

	// this is going to be my parent class
	
	public void openbrowser(String browser ) {
		System.out.println("Open the chrome browser" + browser);
	}
	// Static this method can be called without an object in any class
	public static void login(String username, String password)
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
		
		Base obj = new Base();
		
// call the method created in the class and pass the input value
		
		// object name .methodname
		
		obj.login("abantika", "user@123");
		obj.ComposeEmail("hii all");
		obj.login("admin", "admin");
		obj.logout();

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
