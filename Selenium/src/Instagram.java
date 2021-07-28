import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement name=driver.findElement(By.name("username"));
		name.sendKeys("puja.love88@rediffmail.com");
	    WebElement pass=driver.findElement(By.name("password"));
	    pass.sendKeys("Sarang@4511", Keys.ENTER);
	    
		
		
		
		
	}

}
