package testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.group.maven_archetype_java.LoginPage;


public class Demo {
		WebDriver driver;

		  @BeforeMethod

		  public void setUp() {

		    String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

		    String driverPath = "C:\\chromedriver-win64\\chromedriver.exe";

		      // Khởi tạo WebDriver

		    System.setProperty("webdriver.chrome.driver", driverPath);

		// Create driver object for CHROME browser

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get(baseUrl);

		  }
		  @Test
		  public void loginTest() {
		      LoginPage loginPage = new LoginPage(driver);
		      // login
		      loginPage.enterUsername("Admin");
		      loginPage.enterPassword("admin123");
		      loginPage.clickLoginButton();
		}
		@AfterMethod
		  public void tearDown() {
			 
		  }
		
}