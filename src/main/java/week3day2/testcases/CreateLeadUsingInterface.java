package week3day2.testcases;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import wdMethods.ProjectMethods;
import week4day1.ReadExcel;


public class CreateLeadUsingInterface extends ProjectMethods{
	@Test(dataProvider="fetchdata")
	//@Test(invocationCount=2)
	//@Test(groups= {"smoke"})
	public void createLead(String cname,String fname,String lname){
		click(locateElement("Linktext", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cname);
		type(locateElement("id", "createLeadForm_firstName"), fname);
		type(locateElement("id", "createLeadForm_lastName"), lname);
		click(locateElement("Name", "submitButton"));
		
	}
	@DataProvider(name="fetchdata")
	public Object getdata() throws IOException
	{
		ReadExcel objexcel=new ReadExcel();
		Object[][] data1 = objexcel.readexcel();	
		//Object[][] data1 = objexcel.readexcel(1);	
		return data1;
		
	}
}
