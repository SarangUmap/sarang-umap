import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Set<String>wins=driver.getWindowHandles();
		System.out.println(wins.getClass());
		ArrayList<String> lst= new ArrayList<>(wins);
		for (int i =lst.size()-1; i >= 0; i--) {
			String id= lst.get(i);
			driver.switchTo().window(id);
			Thread.sleep(2000);
			driver.close();
			
		}
		/*for(String id: wins){
		System.out.println(id);
		driver.switchTo().window(id);
		Thread.sleep(2000);
		driver.close();
		}*/
		

	}

}
