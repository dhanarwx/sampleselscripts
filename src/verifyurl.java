import org.openqa.selenium.firefox.FirefoxDriver;

public class verifyurl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver","geckodriver.exe");
          FirefoxDriver driver = new FirefoxDriver();
          driver.get("http://www.edureka.co");
         String x =  driver.getCurrentUrl();
         System.out.println(x);
	}

}
