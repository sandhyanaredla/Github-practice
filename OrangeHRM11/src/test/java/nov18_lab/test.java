package nov18_lab;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import CommonUtil.*;

public class test {

	static WebDriver driver;
	
@BeforeTest
public void OpenBrowser()throws Exception {
driver=TestBrowser.OpenChromeBrowser();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
	
@Test
public void Login_Test()throws Exception {
	test T1=new test();
	T1.OPenOrangeHRM1();
	T1.Login();
	//T1.AddNationalities();
 }

@AfterTest
public void closeBrowser()throws Exception {
	driver.close();
 }
public void OPenOrangeHRM1() throws Exception{
String TestURL="https://opensource-demo.orangehrmlive.com/";
}

public void Login() throws Exception {
 findElement(By.id("txtUsername")).sendKeys("Admin");
 findElement(By.id("txtPassword")).sendKeys("admin123");
 findElement(By.id("btnLogin")).click();
}
 
	
public void AddNationalities() throws Exception{
	findElement(By.id("menu_admin_viewAdminModule")).click();
	findElement(By.id("menu_admin_nationality")).click();
	findElement(By.id("btnAdd")).click();
	findElement(By.id("nationality_name")).sendKeys("Indian146");
	findElement(By.id("btnSave")).click();
}
	
	public static WebElement findElement(By by) throws Exception 
	 	{

	 		WebElement elem = driver.findElement(by);  
	 		
	 		if (driver instanceof JavascriptExecutor) 
	 		{
	 		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 	 
	 		}
	 		return elem;


}
}
