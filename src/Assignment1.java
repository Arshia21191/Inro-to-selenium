import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.cssSelector("#checkBoxOption1")).click();
		System.out.println(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		driver.findElement(By.cssSelector("#checkBoxOption1")).click();
		System.out.println(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
