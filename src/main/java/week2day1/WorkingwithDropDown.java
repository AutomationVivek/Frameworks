package week2day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingwithDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		//index
		WebElement dropobj = driver.findElementById("dropdown1");
		Select indvdrop= new Select(dropobj);
		indvdrop.selectByIndex(1);
		
		//text
		WebElement dropobj1 = driver.findElementByName("dropdown2");
		Select indvdrop1= new Select(dropobj1);
		indvdrop1.selectByVisibleText("Appium");
		
		//using value
		WebElement dropobj2 = driver.findElementById("dropdown3");
		Select indvdrop2= new Select(dropobj2);
		indvdrop2.selectByValue("3");
		
		//get no of count		
		WebElement dropobj3 =driver.findElementByClassName("dropdown"); 
		Select indvdrop3= new Select(dropobj3);
		List<WebElement> alloptions = indvdrop3.getOptions();
		System.out.println(alloptions.size());
		indvdrop3.selectByVisibleText("Loadrunner");
		
		//sendkeys
		driver.findElementByXPath("//div[@class='example'][5]/select").sendKeys("UFT/QTP");
		
		//multiple select
		WebElement dropobj4 =driver.findElementByXPath("//div[@class='example'][6]/select"); 
		Select indvdrop4= new Select(dropobj4);
		indvdrop4.selectByVisibleText("Loadrunner");
		indvdrop4.selectByIndex(1);
		indvdrop4.selectByIndex(3);
		System.out.println(indvdrop4.isMultiple());
		
	}

}
