import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://alaskatrips.poweredbygps.com/");
		driver.findElement(By.id("package-origin-hp-package")).sendKeys("nyc");
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.TAB);
		driver.findElement(By.id("package-destination-hp-package")).sendKeys("lon");
		driver.findElement(By.id("package-destination-hp-package")).sendKeys(Keys.TAB);
		driver.findElement(By.cssSelector(".text.datepicker-trigger-input.gcw-start-date.gcw-storeable.gcw-valid-date.gcw-required.package-max-range")).click();
		driver.findElement(By.cssSelector(".btn-primary.btn-action.gcw-submit")).click();
		
		
		
		

	}

}
