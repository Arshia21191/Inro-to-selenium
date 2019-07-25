import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.keynotesupport.com/websites/contact-form-example-radio-buttons.shtml");
		driver.findElement(By.xpath("//input[@value='QBP']")).click();
		System.out.println(driver.findElements(By.xpath("//input[@name='software']")).size());
		WebElement element = driver.findElement(By.xpath("//input[@value='QBP']"));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
	}

}
