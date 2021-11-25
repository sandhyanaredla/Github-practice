package praticelab1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver Driver;
	
  @Test
  public void OpenChromeBrowser()throws Exception 
  
  {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
      Driver =new ChromeDriver();
	  Driver.manage().window().maximize() ;	
	  Driver.get("https://opensource-demo.orangehrmlive.com/");  
	  
	  Driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  Driver.findElement(By.id("txtPassword")).sendKeys("admin1023");
	  Driver.findElement(By.id("btnLogin")).click();
	  
  }
}
