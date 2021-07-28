import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class UrbanLadder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		driver.findElement(By.xpath("//input[@class='typeahead tt-input']")).sendKeys("sofa",Keys.ENTER);
		driver.findElement(By.xpath("//img[@title='Weston Half Leather Sofa (Wine Italian Leather)']")).click();
		driver.findElement(By.xpath("//a[@data-gacategory='Sofa_Prod_Page']  ")).click();
		driver.findElement(By.xpath("//button[@data-id='94864']")).click();
		String title= driver.getTitle();
		System.out.println(title);
		
		
	}

}
