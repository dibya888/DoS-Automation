package dos_test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//WebDriver initialization
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://114.130.119.78/");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		//Login Page
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[3]/a/div/div/img")).click();
		Thread.sleep(100);
		
		//Provide Credential
		driver.findElement(By.id("username")).sendKeys("202403101996001");
		Thread.sleep(100);
		driver.findElement(By.id("password")).sendKeys("D987123a");
		Thread.sleep(100);
		driver.findElement(By.xpath("/html/body/section/div[2]/div/div/div/form/button")).click();
		Thread.sleep(1000);
		
		//New Application
		driver.findElement(By.linkText("আবেদনসমূহ")).click();
		Thread.sleep(1000);
		//Select Application Type
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div/div[1]")).click();
		Thread.sleep(1000);
		//Select Certificate Type
		driver.findElement(By.xpath("//div[2]/div[2]/div/div/div/div/div[2]")).click();
		Thread.sleep(1000);
		//Select 1st Class Driver
		driver.findElement(By.xpath("//div[@id='react-select-4-option-0']")).click();
		Thread.sleep(1000);
		//Enter NID Number
		WebElement nidno = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/table/tbody/tr/td[2]/input"));
		nidno.clear();
		nidno.sendKeys("3434483878");
		//Enter NID Issue Date
		WebElement nidissue = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/table/tbody/tr/td[3]/input"));
		nidissue.clear();
		nidissue.sendKeys("25022021");
		//Enter NID Expire Date
		WebElement nidexpire = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/table/tbody/tr/td[4]/input"));
		nidexpire.clear();
		nidexpire.sendKeys("31122999");
		Thread.sleep(1000);
		//Upload NID
		WebElement fileInput = driver.findElement(By.cssSelector("input[type='file']"));
		String filePath = "C:\\Users\\Dibya\\Downloads\\DoS Certificates\\NID Certificate.pdf";
		fileInput.sendKeys(filePath);
		Thread.sleep(1000);
		//Click Upload
		WebElement nidUpload = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/table/tbody/tr/td[5]/div/div/button"));
		nidUpload.click();
		//২য় শ্রেনির ড্রাইভার যোগ্যতা সনদ Number
	    WebElement driverCertiNo = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/table/tbody/tr/td[2]/input"));
	    driverCertiNo.clear();
	    driverCertiNo.sendKeys("123456789");
	    //২য় শ্রেনির ড্রাইভার যোগ্যতা সনদ Issue Date
	    WebElement driverCertiIssue = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/table/tbody/tr/td[3]/input"));
	    driverCertiIssue.clear();
	    driverCertiIssue.sendKeys("01012010");
	    //২য় শ্রেনির ড্রাইভার যোগ্যতা সনদ Expire Date
	    WebElement driverCertiExpire = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/table/tbody/tr/td[4]/input"));
	    driverCertiExpire.clear();
	    driverCertiExpire.sendKeys("31122029");
	    Thread.sleep(1000);
	    //Upload ২য় শ্রেনির ড্রাইভার যোগ্যতা সনদ
	  	WebElement fileInputCer = driver.findElement(By.xpath("(//input[@type='file'])[2]"));//
	  	String filePathCer = "C:\\Users\\Dibya\\Downloads\\DoS Certificates\\2nd Class Driver License.pdf";
	  	fileInputCer.sendKeys(filePathCer);
	  	Thread.sleep(1000);
	  	//Click Upload
	  	WebElement driverCerTiUpload = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/table/tbody/tr/td[5]/div/div/button"));
	  	driverCerTiUpload.click();
	  	//১ম শ্রেনির ড্রাইভার প্রস্তুতিমূলক কোর্স সনদ Number
	    WebElement driverPrepCertiNo = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[3]/table/tbody/tr[1]/td[2]/input"));
	    driverPrepCertiNo.clear();
	    driverPrepCertiNo.sendKeys("7854689545");
	    //১ম শ্রেনির ড্রাইভার প্রস্তুতিমূলক কোর্স সনদ Issue Date
	    WebElement driverPrepCertiIssue = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[3]/table/tbody/tr[1]/td[3]/input"));
	    driverPrepCertiIssue.clear();
	    driverPrepCertiIssue.sendKeys("01062011");
	    //১ম শ্রেনির ড্রাইভার প্রস্তুতিমূলক কোর্স সনদ Expire Date
	    WebElement driverPrepCertiExpire = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[3]/table/tbody/tr[1]/td[4]/input"));
	    driverPrepCertiExpire.clear();
	    driverPrepCertiExpire.sendKeys("31052030");
	    Thread.sleep(1000);
	    //Upload ১ম শ্রেনির ড্রাইভার প্রস্তুতিমূলক কোর্স সনদ
	  	WebElement fileInputPrepCer = driver.findElement(By.xpath("(//input[@type='file'])[3]"));//
	  	String filePathPrepCer = "C:\\Users\\Dibya\\Downloads\\DoS Certificates\\1st Class Driver Preparatory Course Certificate.pdf";
	  	fileInputPrepCer.sendKeys(filePathPrepCer);
	  	Thread.sleep(1000);
	  	//Click Upload
	  	WebElement driverPrepCerTiUpload = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[3]/table/tbody/tr[1]/td[5]/div/div/button"));
	  	driverPrepCerTiUpload.click();
	 	//Safety Course Certificate Number
	    WebElement driverSeftyCertiNo = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[3]/table/tbody/tr[2]/td[2]/input"));
	    driverSeftyCertiNo.clear();
	    driverSeftyCertiNo.sendKeys("475869362514");
	    //Safety Course Certificate Issue Date
	    WebElement driverSeftyCertiIssue = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[3]/table/tbody/tr[2]/td[3]/input"));
	    driverSeftyCertiIssue.clear();
	    driverSeftyCertiIssue.sendKeys("05062014");
	    //Safety Course Certificate Expire Date
	    WebElement driverSeftyCertiExpire = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[3]/table/tbody/tr[2]/td[4]/input"));
	    driverSeftyCertiExpire.clear();
	    driverSeftyCertiExpire.sendKeys("04062034");
	    Thread.sleep(1000);
	    //Upload Safety Course Certificate
	  	WebElement fileInputSeftyCer = driver.findElement(By.xpath("(//input[@type='file'])[4]"));//
	  	String filePathSeftyCer = "C:\\Users\\Dibya\\Downloads\\DoS Certificates\\Basic Fire Prevention and Fire Fighting Technique Course.pdf";
	  	fileInputSeftyCer.sendKeys(filePathSeftyCer);
	  	Thread.sleep(1000);
	  	//Click Upload
	  	WebElement driverSeftyCerTiUpload = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[3]/table/tbody/tr[2]/td[5]/div/div/button"));
	  	driverSeftyCerTiUpload.click();
	  	//মেরিন টেকনোলজি/মেকানিক্যাল/পাওয়ার টেকনোলজিতে ডিপ্লোমা সনদ Number
	    WebElement driverDiplomaCertiNo = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[4]/table/tbody/tr[1]/td[2]/input"));
	    driverDiplomaCertiNo.clear();
	    driverDiplomaCertiNo.sendKeys("987654321");
	    //মেরিন টেকনোলজি/মেকানিক্যাল/পাওয়ার টেকনোলজিতে ডিপ্লোমা সনদ Issue Date
	    WebElement driverDiplomaCertiIssue = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[4]/table/tbody/tr[1]/td[3]/input"));
	    driverDiplomaCertiIssue.clear();
	    driverDiplomaCertiIssue.sendKeys("03102015");
	    //মেরিন টেকনোলজি/মেকানিক্যাল/পাওয়ার টেকনোলজিতে ডিপ্লোমা সনদ Expire Date
	    WebElement driverDiplomaCertiExpire = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[4]/table/tbody/tr[1]/td[4]/input"));
	    driverDiplomaCertiExpire.clear();
	    driverDiplomaCertiExpire.sendKeys("02102035");
	    Thread.sleep(1000);
	    //Upload মেরিন টেকনোলজি/মেকানিক্যাল/পাওয়ার টেকনোলজিতে ডিপ্লোমা সনদ
	  	WebElement fileInputDiplomaCer = driver.findElement(By.xpath("(//input[@type='file'])[8]"));//
	  	String filePathDiplomaCer = "C:\\Users\\Dibya\\Downloads\\DoS Certificates\\Diploma Certificate in Marine Technology.pdf";
	  	fileInputDiplomaCer.sendKeys(filePathDiplomaCer);
	  	Thread.sleep(1000);
	  	//Click Upload
	  	WebElement driverDiplomaCerTiUpload = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[4]/table/tbody/tr[1]/td[5]/div/div/button"));
	  	driverDiplomaCerTiUpload.click();
	  	//মেরিন টেকনোলজি কোর্স সনদ Number
	    WebElement driverMarineCertiNo = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[4]/table/tbody/tr[2]/td[2]/input"));
	    driverMarineCertiNo.clear();
	    driverMarineCertiNo.sendKeys("MTC555874");
	    //মেরিন টেকনোলজি কোর্স সনদ Issue Date
	    WebElement driverMarineCertiIssue = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[4]/table/tbody/tr[2]/td[3]/input"));
	    driverMarineCertiIssue.clear();
	    driverMarineCertiIssue.sendKeys("06072020");
	    //মেরিন টেকনোলজি কোর্স সনদ Expire Date
	    WebElement driverMarineCertiExpire = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[4]/table/tbody/tr[2]/td[4]/input"));
	    driverMarineCertiExpire.clear();
	    driverMarineCertiExpire.sendKeys("05072030");
	    Thread.sleep(1000);
	    //Upload মেরিন টেকনোলজি কোর্স সনদ
	  	WebElement fileInputMarineCer = driver.findElement(By.xpath("(//input[@type='file'])[9]"));//
	  	String filePathMarineCer = "C:\\Users\\Dibya\\Downloads\\DoS Certificates\\Marine Technology Course Certificate.pdf";
	  	fileInputMarineCer.sendKeys(filePathMarineCer);
	  	Thread.sleep(1000);
	  	//Click Upload
	  	WebElement driverMarineCerTiUpload = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[4]/table/tbody/tr[2]/td[5]/div/div/button"));
	  	driverMarineCerTiUpload.click();
	  	//নৌ বাহিনীর অভিজ্ঞতার রেকর্ড Number
	    WebElement driverNavalCertiNo = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[4]/table/tbody/tr[3]/td[2]/input"));
	    driverNavalCertiNo.clear();
	    driverNavalCertiNo.sendKeys("BN 869857");
	    //নৌ বাহিনীর অভিজ্ঞতার রেকর্ড Issue Date
	    WebElement driverNavalCertiIssue = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[4]/table/tbody/tr[3]/td[3]/input"));
	    driverNavalCertiIssue.clear();
	    driverCertiIssue.sendKeys("20062024");
	    //নৌ বাহিনীর অভিজ্ঞতার রেকর্ড Expire Date
	    WebElement driverNavalCertiExpire = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[4]/table/tbody/tr[3]/td[4]/input"));
	    driverNavalCertiExpire.clear();
	    driverNavalCertiExpire.sendKeys("19062034");
	    Thread.sleep(1000);
	    //Upload নৌ বাহিনীর অভিজ্ঞতার রেকর্ড
	  	WebElement fileInputNavalCer = driver.findElement(By.xpath("(//input[@type='file'])[10]"));//
	  	String filePathNavalCer = "C:\\Users\\Dibya\\Downloads\\DoS Certificates\\Naval experience record.pdf";
	  	fileInputNavalCer.sendKeys(filePathNavalCer);
	  	Thread.sleep(1000);
	  	//Click Upload
	  	WebElement driverNavalCerTiUpload = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[4]/table/tbody/tr[3]/td[5]/div/div/button"));
	  	driverNavalCerTiUpload.click();
		
		Thread.sleep(1000);
		driver.quit();
	

	}

}
