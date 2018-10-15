package week3day2.testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class IndeedJobPortal {
	@Test
	public void indeed()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.indeed.co.in/Fresher-jobs");
		List<WebElement> links = driver.findElementsByXPath("//div[contains(@class,'clickcard')]/h2/a");
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{	
			WebElement ele= links.get(i);
			Actions actions = new Actions(driver);
			actions.keyDown(Keys.COMMAND)
			.click(ele)
			.keyUp(Keys.COMMAND)
			.build()
			.perform();
			Set<String> allwindows = driver.getWindowHandles();
			List<String> winlist = new ArrayList<String>();
			winlist.addAll(allwindows);
			//System.out.println(	winlist.size());
			//to switch particular window
			driver.switchTo().window(winlist.get(i+2));
			System.out.println(driver.getTitle());
			driver.switchTo().window(winlist.get(0));
		}
		
	}

}
