package week3day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://erail.in/");
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("TPJ",Keys.TAB);
		driver.findElementById("chkSelectDateOnly").click();
		Thread.sleep(1000);
		//declare webtable
		WebElement webtable = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		//get rows , count
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		//System.out.println(rows.size());
		//get cols,count
		//List<WebElement> cols = rows.get(0).findElements(By.tagName("td"));
		//System.out.println(cols.size());
		//print 1st col name
		//System.out.println(cols.get(1).getText());
		
		//print all rows ,1st col value
		for (int i = 0; i < (rows.size()); i++) {
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			System.out.println(cols.get(1).getText());
		}
	}
	

}

