import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.cssSelector("#email")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id=\'loginbutton\']")).click();
		}

}
