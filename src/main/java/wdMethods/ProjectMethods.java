package wdMethods;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectMethods extends SeMethods {
	@Parameters({"url","uname","pwd"})
	@BeforeMethod
	//@BeforeMethod//(groups="Common")
		public void login(String url,String uname,String pwd){
			startApp("chrome", url);
			type(locateElement("id", "username"), uname);
			type(locateElement("id", "password"), pwd);
			click(locateElement("class", "decorativeSubmit"));
			click(locateElement("Linktext", "CRM/SFA"));
			click(locateElement("Linktext", "Leads"));
		}
	
@AfterMethod//(groups="Common")
	public void closeApp() {
	closeBrowser();
	}
}
