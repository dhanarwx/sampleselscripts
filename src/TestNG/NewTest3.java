package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest3 {
  @Test
  public void verifytitle1() {
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
      ChromeDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("http://www.amazon.com");
      String x = driver.getTitle();
      System.out.println(x);
  }
}
