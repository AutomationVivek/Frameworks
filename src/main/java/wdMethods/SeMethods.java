package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeMethods implements WdMethods{

	RemoteWebDriver driver = null;
	WebElement ele = null;
	String text =null;
	String title=null;
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			//Maximize the browser
			driver.manage().window().maximize();
			//Load the URL
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("The "+browser+" browser launched successfully");
			
		} catch (WebDriverException e) {
			System.out.println("webdriver execpion occured" );
			e.printStackTrace();
			throw new RuntimeException();
		}
		catch (NullPointerException e) {
			System.out.println("nullpointer execpion occured" );
			e.printStackTrace();
			throw new RuntimeException();
		}
		catch (Exception e) {
			System.out.println(" execpion occured" );
			e.printStackTrace();
			throw new RuntimeException();
		}
		finally {
			takeSnap();
		}
		
	}

	public WebElement locateElement(String locator, String locValue) {

		try {
			switch (locator) {
			case "id":
				ele = driver.findElementById(locValue);
				break;
			case "class":
				ele = driver.findElementByClassName(locValue);
				break;
			case "Linktext":
				ele = driver.findElementByLinkText(locValue);
				break;
			case "Name":
				ele = driver.findElementByName(locValue);
				break;
			case "Xpath":
				ele = driver.findElementByXPath(locValue);
				break;
			}
		} catch (NoSuchElementException e) {
			System.out.println("element not found execpion occured" );
			e.printStackTrace();
			throw new RuntimeException();
		}
		catch (Exception e) {
			System.out.println(" execpion occured" );
			e.printStackTrace();
			throw new RuntimeException();
		}
		finally {
			takeSnap();
		}
		return ele;

	}

	public WebElement locateElement(String locValue) {
		try {
			ele	 = driver.findElementById(locValue);
			return ele;
		} catch (NoSuchElementException e) {
			System.out.println("element not found execpion occured" );
			e.printStackTrace();
			throw new RuntimeException();
		}	catch (Exception e) {
			System.out.println(" execpion occured" );
			e.printStackTrace();
			throw new RuntimeException();
		}
		finally {
			takeSnap();
		}
	}
	
	public int locateElements(String locValue) {
		List<WebElement> findElementsByXPath = driver.findElementsByXPath(locValue);
		int size = findElementsByXPath.size();
		System.out.println(size);
		return size;
	}

	public void type(WebElement ele, String data) {
		try {
		ele.sendKeys(data);
		System.out.println("The given value is entered "+data);
		}
		catch (WebDriverException e) {
			System.out.println("webdriver execpion occured" );
			e.printStackTrace();
			throw new RuntimeException();
		}
		catch (NullPointerException e) {
			System.out.println("nullpointer execpion occured" );
			e.printStackTrace();
			throw new RuntimeException();
		}
		catch (Exception e) {
			System.out.println(" execpion occured" );
			e.printStackTrace();
			throw new RuntimeException();
		}
		finally {
			takeSnap();
		}
	}

	public void click(WebElement ele) {
		
		try
		{
		ele.click();
		System.out.println("The element is clicked successfully");
		}
		catch (WebDriverException e) {
			System.out.println("webdriver execpion occured" );
			e.printStackTrace();
			throw new RuntimeException();
		}
		catch (NullPointerException e) {
			System.out.println("nullpointer execpion occured" );
			e.printStackTrace();
			throw new RuntimeException();
		}
		catch (Exception e) {
			System.out.println(" execpion occured" );
			e.printStackTrace();
			throw new RuntimeException();
		}
		finally {
			takeSnap();
		}
	}
	
	public void clickWithoutSnap(WebElement ele) {
		try{
		ele.click();
		System.out.println("The element is clicked successfully");
		}
		catch (WebDriverException e) {
			System.out.println("webdriver execpion occured" );
			e.printStackTrace();
			throw new RuntimeException();
		}
		catch (NullPointerException e) {
			System.out.println("nullpointer execpion occured" );
			e.printStackTrace();
			throw new RuntimeException();
		}
		catch (Exception e) {
			System.out.println(" execpion occured" );
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public String getText(WebElement ele) {
		text = ele.getText();
		System.out.println("The returned value is  "+text);
		takeSnap();
		return text;
	}
	
	public String getTitle() {
		title = driver.getTitle();
		System.out.println("The returned value is  "+title);
		takeSnap();
		return title;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		Select dropdown= new Select(ele);
		dropdown.selectByVisibleText(value);
		System.out.println("The element "+value+" is selected from dropdown successfully");
		takeSnap();
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		Select dropdown= new Select(ele);
		dropdown.selectByIndex(index);
		System.out.println("The element of index "+index+" is selected from dropdown successfully");
		takeSnap();
	}

	public boolean verifyTitle(String expectedTitle) {
		if (driver.getTitle().equals(expectedTitle)) 
		{
			System.out.println("The title is "+expectedTitle+"displayed correctly");
			takeSnap();
			return true;
		}else
		{
			System.out.println("The title is "+expectedTitle+" not displayed");
			takeSnap();
			return false;
		}

	}

	public void verifyExactText(WebElement ele, String expectedText) {
		text = ele.getText();
		if (text.equals(expectedText)) {
			System.out.println("The text is "+expectedText+"verifed correctly");
			takeSnap();
		}else
		{
			System.out.println("The text is "+expectedText+" not verifed ");
			takeSnap();
		}

	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		text = ele.getText();
		if (text.contains(expectedText)) {
			System.out.println("The text is "+expectedText+" verifed partially correctly");
			takeSnap();
		}else
		{
			System.out.println("The text is "+expectedText+" not verifed ");
			takeSnap();
		}
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		text = ele.getAttribute(attribute);
		if (text.equals(value)) {

			System.out.println("The attribute is "+value+" verifed  correctly");
			takeSnap();
		}else
		{
			System.out.println("The attribute is "+value+" not verifed ");
			takeSnap();
		}


	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		text = ele.getAttribute(attribute);
		if (text.contains(value)) {

			System.out.println("The attribute is "+value+" verifed partially correctly");
			takeSnap();
		}else
		{
			System.out.println("The attribute is "+value+" not verifed ");
			takeSnap();
		}

	}

	public void verifySelected(WebElement ele) {
		if (ele.isSelected()) 
			System.out.println("radio/checkbox is selected");
		else
			System.out.println("radio/checkbox is not selected");

	}

	public void verifyDisplayed(WebElement ele) {
		if (ele.isDisplayed()) 
			System.out.println("radio/checkbox is displayed");
		else
			System.out.println("radio/checkbox is not dispalyed");

	}
	int index=0;
	public void switchToWindow(int index) {
		
		try {
			Set<String> allwindows = driver.getWindowHandles();
			List<String> winlist = new ArrayList<String>();
			winlist.addAll(allwindows);
			driver.switchTo().window(winlist.get(index));
			System.out.println("window is switced");
		} catch (NoSuchWindowException e) {
			System.out.println("nosuchwindow execpion occured" );
			e.printStackTrace();
			throw new RuntimeException();
		}catch (Exception e) {
			System.out.println(" execpion occured" );
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	}

	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);
		System.out.println("frame is switced");

	}

	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
			System.out.println("Alert handled accepted");
		} catch (NoAlertPresentException e) {
			System.out.println("noalert execpion occured" );
			e.printStackTrace();
			throw new RuntimeException();
		}catch (Exception e) {
			System.out.println(" execpion occured" );
			e.printStackTrace();
			throw new RuntimeException();
		}	
	}

	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
		System.out.println("Alert handled is dismissed");

	}

	public String getAlertText() {
		//driver.switchTo().alert().sendKeys("Aarthi");
		//driver.switchTo().alert().accept();
		text = driver.switchTo().alert().getText();
		return text;
	}

	int i =1;
	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
	}
	
	public void WebWait(String locValue) {
	WebDriverWait wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locValue)));
	}
	
	public void closeBrowser() {
		driver.close();

	}

	public void closeAllBrowsers() {
		driver.quit();

	}

}
