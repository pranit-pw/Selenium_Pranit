package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Element2 {
	
	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver", "E:\\Pranit\\Velocity Class\\chromedriver_win32\\chromedriver.exe") ;
		
		WebDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");

		WebElement Search = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")) ;
		Thread.sleep(3000) ;
		
		Search.sendKeys("Iphone" + Keys.ENTER) ;
		Thread.sleep(3000) ;
		
		WebElement Price = driver.findElement(By.xpath("((//div[@data-index='2']//div)[28]//span)[5]")) ;
		String p = Price.getText() ;
		
		System.out.println(p);
	}	
}
