import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class wbd1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	       driver.get("http://www.facebook.com");
	       driver.findElement(By.id("u_0_j")).sendKeys("Testing");
	       driver.findElement(By.id("u_0_l")).sendKeys("Selenium");
	       driver.findElement(By.name("reg_email__")).sendKeys("testing@gmail.com");
	       driver.findElement(By.name("reg_email_confirmation__")).sendKeys("testing@gmail.com");
	       driver.findElement(By.name("websubmit")).click();
	}

}
