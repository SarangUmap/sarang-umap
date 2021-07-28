import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Face {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Sarang4511@gmail.com");
		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}

}
