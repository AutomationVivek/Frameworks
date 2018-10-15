package week4day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReport {

	public static void main(String[] args) throws IOException {
		
		//create html file 
		ExtentHtmlReporter html=new ExtentHtmlReporter("./Reports/Result.html");
		
		//to maintain history of exectued tc
		html.setAppendExisting(true);
		
		//to attach created html file 
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(html);
		
		//to initate test
		ExtentTest test = extent.createTest("Testcase1", "login");
		//to mention author, testcase category
		test.assignAuthor("aarthi");
		test.assignCategory("regression");
		//details of test step
		test.pass("enter user name", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
		test.fail("enter password ", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img10.png").build());
		test.info("enter deails", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img11.png").build());
		test.warning("enter warning", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img12.png").build());
		
		extent.flush();
	}

}
