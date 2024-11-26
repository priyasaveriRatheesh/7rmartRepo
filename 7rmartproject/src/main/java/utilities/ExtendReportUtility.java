package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportUtility {
		
		public static final ExtentReports extentReports = new ExtentReports();//global declaraion 
		
		public synchronized static ExtentReports createExtentReports() {
		
			ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");//specify loaction
			//ExtentSparkReporter is  class
			reporter.config().setReportName("7RMart Project");//project name
			extentReports.attachReporter(reporter);
			extentReports.setSystemInfo("Organization", "Obsqura");//organization and tem member details
			extentReports.setSystemInfo("Name", "Priya");
			return extentReports;
		}
	}
	