package week4.testng.account.tcs;


import org.testng.annotations.Test;


import wdMethods.ProjectMethods;

public class CreateAccountUsingInterface extends ProjectMethods {
	@Test(invocationCount=2)
	public void CreateAccount() throws InterruptedException{
		//login();
		closeBrowser();
	}
}
