package week2day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithCheckbox {

	public static void main(String[] args) {

		boolean bValue;

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/checkbox.html");

		//1st check box
		driver.findElementByXPath("//label[text()='Select the languages that you know?']/following-sibling::input[1]").click();
		driver.findElementByXPath("//label[text()='Select the languages that you know?']/following-sibling::input[2]").click();
		driver.findElementByXPath("//label[text()='Select the languages that you know?']/following-sibling::input[3]").click();
		driver.findElementByXPath("//label[text()='Select the languages that you know?']/following-sibling::input[4]").click();

		//2nd
		bValue = driver.findElementByXPath("//label[text()='Confirm Selenium is checked']/following-sibling::input").isSelected();
		if (bValue)
		{
			driver.findElementByXPath("//label[text()='Confirm Selenium is checked']/following-sibling::input").click();
			System.out.println("check box selected already");

			bValue = driver.findElementByXPath("//label[text()='Confirm Selenium is checked']/following-sibling::input").isSelected();
			if (bValue)
			{
				System.out.println("check box not unselected");
			}
			else
			{
				System.out.println("check box unselected");	
			}
		}
		else
		{
			System.out.println("check box already unselected");
		}
		
		//3rd
		bValue = driver.findElementByXPath("//label[text()='DeSelect only checked']/following-sibling::input[1]").isSelected();
		if (bValue) {
			System.out.println("checked already");
			driver.findElementByXPath("//label[text()='DeSelect only checked']/following-sibling::input[1]").click();
		}
		else {
			System.out.println("unchecked already");
		}
		
		bValue = driver.findElementByXPath("//label[text()='DeSelect only checked']/following-sibling::input[2]").isSelected();
		if (bValue) {
			System.out.println("checked already");
			driver.findElementByXPath("//label[text()='DeSelect only checked']/following-sibling::input[2]").click();
		}
		else {
			System.out.println("unchecked already");
		}
		
		// 4th  
		driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following-sibling::input[1]").click();
		driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following-sibling::input[2]").click();
		driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following-sibling::input[3]").click();
		driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following-sibling::input[4]").click();
		driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following-sibling::input[5]").click();
		driver.findElementByXPath("//label[text()='Select all below checkboxes ']/following-sibling::input[6]").click();
		
	}	
	

}


