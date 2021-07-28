import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	WebElement search=driver.findElement(By.name("q"));
	search.sendKeys("selenium",Keys.ENTER);
	  List<WebElement> links = driver.findElements(By.tagName("a"));
	for(WebElement link : links) {
		System.out.println(link.getText());
		
	}
	}

}



