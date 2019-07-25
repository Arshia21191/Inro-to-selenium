import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loc {

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
	driver.get("http://www.facebook.com");// hit url on the browser
	/*driver.findElement(By.id("email")).sendKeys("hello");
	driver.findElement(By.name("pass")).sendKeys("123456");
	driver.findElement(By.linkText("Forgotten account?")).click()*/;
	driver.findElement(By.className("inputtext")).sendKeys("helloworld");// if two textboxes have the same classname it will fetch the first one
	
	}
}
