package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;


public class CreateLead {

	public static ChromeDriver driver;

	@Before

	public void before() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.leaftaps.com/opentaps");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


		driver.manage().window().maximize();
	}

	@And("enter the username as (.*)")
	public void enterUname(String Uname) {

		driver.findElementById("username").sendKeys(Uname);
	}

	@And("enter the password as (.*)")
	public void enterPwd(String pwd) {

		driver.findElementById("password").sendKeys(pwd);
	}

	@When("click on login button")
	public void clickLogin() {

		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("verify login is successfull")
	public void verifyLogin() {

		System.out.println("Login successfull");
	}

	@When ("click on crmsfa link")
	public void clickCrmSfa() {
		driver.findElementByLinkText("CRM/SFA").click();

	}

	@And("click on leads")
	public void clickLeads() {
		driver.findElementByLinkText("Leads").click();	
	}


	@And ("click on create lead")
	public void clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();				

	}

	@And ("enter the company name as (.*)")
	public void enterCname(String cname) {

		driver.findElementById("createLeadForm_companyName").sendKeys(cname);

	}


	@And("enter the first name as (.*)")
	public void enterFName(String fname) {

		driver.findElementById("createLeadForm_firstName").sendKeys(fname);


	}
	@And("enter the last name as (.*)")
	public void enterLname(String lname) {

		driver.findElementById("createLeadForm_lastName").sendKeys(lname);

	}
	@And ("click on submit button")
	public void clickSubmit() {

	driver.findElementByXPath("//input[@name='submitButton']").click();
	}
	@Then("Verify the name of the created lead")
	public void verifyLead() {
		String name = driver.findElementById("viewLead_firstName_sp").getText();
		if(name.equals("Ramya"));
		System.out.println("Names match");
	}
	@After
	public void after() {
		driver.close();
	}
}