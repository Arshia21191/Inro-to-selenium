import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();

		Thread.sleep(3000);

		WebElement source=driver.findElement(By.xpath("//input[@placeholder='From']"));

		source.sendKeys("Mum");

		source.sendKeys(Keys.ARROW_DOWN);

		source.sendKeys(Keys.ENTER);

		WebElement destination=driver.findElement(By.xpath("//input[@placeholder='To']"));

		destination.sendKeys("s");

		Thread.sleep(2000);

		destination.sendKeys("a");

		Thread.sleep(2000);

		destination.sendKeys("n");

		Thread.sleep(3000);

		int i=0;

		while(i<3)

		{

		Thread.sleep(3000);

		destination.sendKeys(Keys.DOWN);

		i++;

		}

		destination.sendKeys(Keys.ENTER);
		
		
		
	}

}
