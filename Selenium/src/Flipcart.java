import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Software/ChromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	Set <String> wins = driver.getWindowHandle();
	for(String id;wins) {
		System.out.println(id);
		driver.switchTo().window(id);
		Thread.sleep(2000);
		driver.close()
	}
	
	}

}
