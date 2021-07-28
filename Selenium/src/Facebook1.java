import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	/*WebElement search=driver.findElement(By.id("email"));
	search.sendKeys("Sarang4511@gmail.com");
	WebElement srs=driver.findElement(By.id("pass"));
	srs.sendKeys("123456789");
	WebElement login=driver.findElement(By.name("login"));
	login.click();
	String title= driver.getTitle();
	System.out.println(title);*/
	driver.findElement(By.partialLinkText("password?")).click();
	
	
	}

}
