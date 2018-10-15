package week3day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsandFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//driver.switchTo().frame(driver.findElementById("iframeResult"));
		driver.switchTo().frame(1);
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		driver.switchTo().alert().sendKeys("Aarthi");
		driver.switchTo().alert().accept();
		String alretname = driver.findElementById("demo").getText();
		if (alretname.contains("Aarthi")) {
			System.out.println("displayed correctly");
		}
	}

}
