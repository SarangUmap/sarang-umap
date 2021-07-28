package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    WebElement username = driver.findElement(By.xpath("//b[text()='admin']"));
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username.getText());
		WebElement password = driver.findElement(By.xpath("//b[text()='manager']"));
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password.getText(),Keys.ENTER);
		
		

	}

}
