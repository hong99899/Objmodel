package testpackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class Demo {
		public String baseUrl = "https://opensource-demo.orangehrmlive.com";  
		String driverPath = "C://chromedriver-win64//chromedriver.exe";  
		public WebDriver driver ;
		@SuppressWarnings("deprecation")
		@Test             
		public void test() throws InterruptedException {      
		// set the system property for Chrome driver      
		System.setProperty("webdriver.chrome.driver", driverPath);  
		// Create driver object for CHROME browser  
		driver = new ChromeDriver();  
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);  
		// get the current URL of the page  
		String URL= driver.getCurrentUrl();  
		System.out.print(URL);  
		//get the title of the page  
		String title = driver.getTitle();                  
		System.out.println(title); 
		
		WebElement textBoxAcc = driver.findElement(By.name("username"));
		WebElement textBoxPass = driver.findElement(By.name("password"));
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	
		
		textBoxAcc.sendKeys("Admin");
		textBoxPass.sendKeys("admin123");
		loginButton.click();
		
		WebElement accountName = driver.findElement(By.className("oxd-userdropdown-name"));
		String accountNameText = accountName.getText();
		System.out.println("Tên Tài Khoản: " + accountNameText);
		
		WebElement adminTab = driver.findElement(By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']"));
		adminTab.click();
		driver.quit(); 
		}     
}
