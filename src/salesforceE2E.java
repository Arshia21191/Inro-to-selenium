import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforceE2E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.rediff.com");
		driver.findElement(By.cssSelector("a.[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[id='login1']")).sendKeys("username");
		driver.findElement(By.cssSelector("input#password")).sendKeys("123");
		
	}

}
