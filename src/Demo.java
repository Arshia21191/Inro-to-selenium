import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// selenium code
		// Create Driver Object for chrome browser
		// We will strictly implement methods of Web Driver
		
		
		
/*Class name = ChromeDriver;
x driver = new x(); */
		//invoke .exe file first
		
	System.setProperty("webdriver.chrome.driver", "D:\\Work\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.google.com");// hit url on the browser
	System.out.println(driver.getTitle());//Validate if your page title is correct
	System.out.println(driver.getCurrentUrl()); //Validate if you are landed on correct url
	System.out.println(driver.getPageSource());// Get the page source
	driver.get("http://www.yahoo.com");
	driver.navigate().back();
	driver.navigate().forward();
	driver.close();// close the current browser
	driver.quit();// close every browser opened by selenium script
	
		}

}
