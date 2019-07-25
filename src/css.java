import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("username");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("12345");
		//driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.cssSelector("#Login")).click();
		//#id
		//.classname=(replace the space with the dot)
		
		
		
		
		
		
		
		
		
		
		
		
		/*xpath= //Tagname[@attribute = 'value']
				css= Tagname[attribute='value']
					css=	div[class='identity first']
					xpath=			//*[@class='identity first']*/
           
	}

}
