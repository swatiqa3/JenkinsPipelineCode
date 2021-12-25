package Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUtil {
	public ExtentReports extent = new ExtentReports();
	String strReportName = new SimpleDateFormat("ddmmyyyyss").format(new Date());
	ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\SK\\eclipse-workspace\\JenkinsPipelineGitProject\\Reports\\Spark"+strReportName+".html");
	
	public static ExtentTest Testfeature;
	public static ExtentTest Testscenario;
	public static ExtentTest TestStep;


public void CloseReport() {
	extent.attachReporter(spark);
	extent.flush();
}


}
