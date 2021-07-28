import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acti {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement demo=driver.findElement(By.name("username"));
		demo.sendKeys("admin");
		WebElement dem=driver.findElement(By.name("pwd"));
		dem.sendKeys("manager");
		WebElement login=driver.findElement(By.id("loginButton"));
		login.click();
		Thread.sleep(2000);
		String title= driver.getTitle();
		System.out.println(title);
		
		
	}

}
