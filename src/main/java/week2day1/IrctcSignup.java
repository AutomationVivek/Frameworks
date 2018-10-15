package week2day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSignup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");

		driver.findElementById("userRegistrationForm:userName").sendKeys("aarthi");
		driver.findElementById("userRegistrationForm:password").sendKeys("crmsfa");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("crmsfa");
		driver.findElementById("userRegistrationForm:securityQ").sendKeys("What is your pet name?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("cutting");
		driver.findElementById("userRegistrationForm:prelan").sendKeys("English");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("aarthi");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("mani");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("srinivasan");
		driver.findElementById("userRegistrationForm:gender:1").click();
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		driver.findElementById("userRegistrationForm:dobDay").sendKeys("24");
		driver.findElementById("userRegistrationForm:dobMonth").sendKeys("MAR");
		driver.findElementById("userRegistrationForm:dateOfBirth").sendKeys("1992");
		driver.findElementById("userRegistrationForm:occupation").sendKeys("Private");
		driver.findElementById("userRegistrationForm:uidno").sendKeys("123456789");
		driver.findElementById("userRegistrationForm:idno").sendKeys("123456789");
		driver.findElementById("userRegistrationForm:countries").sendKeys("India");
		driver.findElementById("userRegistrationForm:email").sendKeys("aarthi@gmail.com");
		//driver.findElementById("userRegistrationForm:isdCode").sendKeys("+91");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9600933396");
		driver.findElementById("userRegistrationForm:nationalityId").sendKeys("India");
		driver.findElementById("userRegistrationForm:address").sendKeys("abcdecsdf");
		driver.findElementById("userRegistrationForm:street").sendKeys("efhhekdll");
		driver.findElementById("userRegistrationForm:area").sendKeys("meddvakkam");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("620003" ,Keys.TAB);
		Thread.sleep(2000);
		//use select
		WebElement dropobj = driver.findElementById("userRegistrationForm:cityName");
		Select dd= new Select(dropobj);
		dd.selectByIndex(1);
		Thread.sleep(1000);

		WebElement dropobj1 = driver.findElementById("userRegistrationForm:postofficeName");
		Select d2= new Select(dropobj1);
		Thread.sleep(1000);
		d2.selectByIndex(1);
		Thread.sleep(1000);

		driver.findElementById("userRegistrationForm:landline").sendKeys("043127637");
		
		//to select the from dropdown which starts at E then select 2nd E option
		//userRegistrationForm:statesName case 1
		driver.findElementById("userRegistrationForm:countries").sendKeys("E",Keys.DOWN);
			//case2
		int count=0;
		Select coun =new Select(driver.findElementById("userRegistrationForm:countries"));
		List<WebElement> options = coun.getOptions();
		for (WebElement allOptions : options) {
			String text = allOptions.getText();
			if(text.startsWith("E")) {
				count++;
				if (count==2) {
					allOptions.click();
				}
			}
			
		}
		
		//to print all items
		
		Select coun1 =new Select(driver.findElementById("userRegistrationForm:countries"));
		List<WebElement> options2 = coun1.getOptions();
		for (WebElement allOptions1 : options2) {
			String text = allOptions1.getText();
			System.out.println(text);
		}
		
		//to select last but one
		
		Select country =new Select(driver.findElementById("userRegistrationForm:countries"));
		List<WebElement> options1 = country.getOptions();
		options1.size();
		country.selectByIndex(options1.size()-2);
		
		//to check radio button is slected or not
		//driver.findElementById("userRegistrationForm:gender:1").click();
		boolean selected = driver.findElementById("userRegistrationForm:gender:1").isSelected();
		if (selected==true) {
			System.out.println("checkbox selected: "+selected);
		}
		else
		{
			System.out.println("checkbox not selected: "+selected);
		}
		
			
	}

}
