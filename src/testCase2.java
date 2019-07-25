import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// selenium code
				// Create Driver Object for chrome browser
				// We will strictly implement methods of Web Driver
				
				
				
		/*Class name = ChromeDriver;
		x driver = new x(); */
				//invoke .exe file first
		       // gecko driver
				
			System.setProperty("webdriver.gecko.driver", "D:\\Work\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://login.salesforce.com/");
			driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("username");
			driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
			System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
			
		
		}

}
