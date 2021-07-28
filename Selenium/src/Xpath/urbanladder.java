package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class urbanladder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		Thread.sleep(1000);
		List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		Actions a= new Actions(driver);
		for (WebElement MenuName : menus) {
			System.out.println(MenuName.getText());
			a.moveToElement(MenuName).build().perform();
			Thread.sleep(1000);
			
			
		}
			
		}
		
		

	}


