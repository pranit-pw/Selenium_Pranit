package Methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {
	
	public static void main(String[] args) throws InterruptedException {
	
	 System.setProperty("webdriver.chrome.driver", "E:\\Pranit\\Velocity Class\\chromedriver_win32\\chromedriver.exe") ;
		
		WebDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(1000) ;

		WebElement Submit = driver.findElement(By.xpath("//input[@type='submit']")) ;
		WebElement Reset = driver.findElement(By.xpath("//input[@type='reset']")) ;
		
		Submit.click() ;
		
		Thread.sleep(1000) ;
		
		Reset.click() ;
		//Throws Exception [ unexpected alert open: Alert text ]
		
		
		Alert alrt = driver.switchTo().alert() ;
		
		alrt.accept() ;
	    Thread.sleep(1000);
		
		//alt.accept() ;
		
	}	
}
