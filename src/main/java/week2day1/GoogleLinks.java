package week2day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");
		driver.findElementByName("q").sendKeys("aarthi");
		Thread.sleep(3000);
		driver.findElementByName("btnK").click();
		Thread.sleep(3000);
		//using xpath
		List<WebElement> links = driver.findElementsByXPath("//a[contains(text(),'aarthi')]");
		System.out.println(links.size());

		//using partiallinktext
		List<WebElement> links1 = driver.findElementsByPartialLinkText("aarthi");
		System.out.println(links1.size());
		
		//tag name
		List<WebElement> links2 = driver.findElementsByTagName("a");
		int count=0;
		int size = links2.size();
		for (WebElement indilinks : links2) {
			
			String indivlinkname = indilinks.getText();
			if (indivlinkname.contains("aarthi")) {
				count++;
			}
		}
		System.out.println(count);
	}
	

}
