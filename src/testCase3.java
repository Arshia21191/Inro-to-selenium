import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class testCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// selenium code
		// Create Driver Object for chrome browser
		// We will strictly implement methods of Web Driver
		
		
		
/*Class name = ChromeDriver;
x driver = new x(); */
		//invoke .exe file first
       // gecko driver
		
	System.setProperty("webdriver.ie.driver", "D:\\Work\\MicrosoftWebDriver.exe");
	WebDriver driver = new InternetExplorerDriver();
	driver.get("http://www.google.com");
	System.out.println(driver.getTitle());
	}

}
