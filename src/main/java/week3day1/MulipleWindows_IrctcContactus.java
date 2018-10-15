package week3day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class MulipleWindows_IrctcContactus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		driver.findElementByLinkText("Contact Us").click();
		Set<String> allwindows = driver.getWindowHandles();
		List<String> winlist = new ArrayList<String>();
		winlist.addAll(allwindows); 
		//to switch particular window
		driver.switchTo().window(winlist.get(2));
		
		//to switch last window
		int size = winlist.size();
		driver.switchTo().window(winlist.get(size-1));
		
		//to switch indi winndow
//		for (String indi : winlist) {
//			driver.switchTo().window(indi);
//		}
		System.out.println(driver.getTitle());
		System.out.println(driver.findElementByXPath("//div[@class='content-ele']/p[2]").getText());
		driver.switchTo().window(winlist.get(0));
		driver.findElementById("usernameId").sendKeys("saarthi92");
	}

}
