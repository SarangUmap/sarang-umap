import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent {
		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.naukri.com");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			Set<String>wins=driver.getWindowHandles();
			System.out.println(wins.getClass());
			String parent=driver.getWindowHandle();
			wins.remove(parent);
			for(String id : wins) {
			driver.switchTo().window(id);
			Thread.sleep(1000);
			driver.close();
			}
			}

	}


