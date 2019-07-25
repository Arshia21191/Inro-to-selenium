import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		Select adult= new Select(driver.findElement(By.cssSelector("#Adults")));
		adult.selectByValue("3");
		Select child = new Select(driver.findElement(By.cssSelector("#Childrens")));
		child.selectByValue("4");
		driver.findElement(By.cssSelector("#DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		driver.findElement(By.cssSelector("#MoreOptionsLink")).click();
		driver.findElement(By.cssSelector("#AirlineAutocomplete")).sendKeys("Indigo");
		driver.findElement(By.cssSelector("#SearchBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("#homeErrorMessage")).getText());
		
		}

}
