package seleniumPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutheticationPopups {
	public class AuthenticationPopus {

		public void main(String[] args) 
		{
			// TODO Auto-generated method stub
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		}

}
}