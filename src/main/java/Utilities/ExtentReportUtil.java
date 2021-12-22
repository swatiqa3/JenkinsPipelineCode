package Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUtil {
	public ExtentReports extent;
	ExtentSparkReporter spark;
	String strReportName = new SimpleDateFormat("ddmmyyyyss").format(new Date());

public void CreateReport() {
	extent = new ExtentReports();
	spark = new ExtentSparkReporter("C:\\Users\\SK\\eclipse-workspace\\JenkinsPipelineGitProject\\Reports\\Spark"+strReportName+".html");
	extent.createTest("MyFirstTest")
	  .log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");
	extent.attachReporter(spark);

}

public void CloseReport() {
	extent.flush();
}


}
