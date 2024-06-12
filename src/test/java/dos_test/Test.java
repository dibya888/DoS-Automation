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
		Thread.sleep(1000);
		
		//Login Page
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[3]/a/div/div/img")).click();
		Thread.sleep(1000);
		
		//Provide Credential
		driver.findElement(By.id("username")).sendKeys("202403101996001");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("D987123a");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/section/div[2]/div/div/div/form/button")).click();
		Thread.sleep(1000);
		
		//New Application
		driver.findElement(By.linkText("আবেদনসমূহ")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div/div[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[2]/div[2]/div/div/div/div/div[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='react-select-4-option-0']")).click();
		Thread.sleep(1000);
		WebElement nidno = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/table/tbody/tr/td[3]/input"));
		nidno.clear();
		nidno.sendKeys("3434483878");
		WebElement nidissue = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/table/tbody/tr/td[4]/input"));
		nidissue.clear();
		nidissue.sendKeys("25022021");
		
		Thread.sleep(10000);
		driver.quit();
	

	}

}
