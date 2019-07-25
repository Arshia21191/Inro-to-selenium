import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("myownxpath");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("myownxpath");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();

	}

}
