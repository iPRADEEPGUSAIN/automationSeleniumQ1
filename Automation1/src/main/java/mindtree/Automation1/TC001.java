// test case 1 for signup
package mindtree.Automation1;
import java.util.concurrent.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC001 {

public static void main(String[] args) 
	{
   System.setProperty("webdriver.chrome.driver","C:\\Users\\mindsdet128\\Downloads\\chromedriver.exe");
   WebDriver driver= new ChromeDriver();
   driver.get("https://www.urbanladder.com/");
   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
   driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
   driver.findElement(By.xpath(" //a[@class='signup-link authentication_popup']")).click();
   driver.findElement(By.xpath("(//input[@id='spree_user_email'])[1]")).sendKeys("xyz121@gmail.com");
   driver.findElement(By.xpath("(//input[@id='spree_user_password'])[2]")).sendKeys("Password@123");
   driver.findElement(By.xpath(" //input[@value='Sign Up']")).click();
   
	}

}
