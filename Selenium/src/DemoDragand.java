import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoDragand {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropable = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(draggable, dropable).perform();
		Thread.sleep(1500);
		System.out.println(dropable.getText());
		System.out.println(dropable.getAttribute("background-color"));
	}

}
