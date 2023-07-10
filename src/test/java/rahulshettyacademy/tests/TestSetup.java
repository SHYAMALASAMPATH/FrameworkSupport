package rahulshettyacademy.tests;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class TestSetup {
    public static ExtentReports extent;
    
    @BeforeSuite
    public void beforeSuite() {
//        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("path/to/report.html");
    	
    	String path =System.getProperty("user.dir")+"//reports//extentreport.html";
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter(path);
    
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
       
    }
    
    @AfterSuite
    public void afterSuite() {
        extent.flush();
    }
}
