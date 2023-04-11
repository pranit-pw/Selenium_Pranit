package Methods;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handle {
	
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "E:\\Pranit\\Velocity Class\\chromedriver_win32\\chromedriver.exe") ;
		
		WebDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(3000);

		WebElement alert = driver.findElement(By.xpath("(//a[text() ='Try it Yourself »'])[1]"));
		//WebElement confirm = driver.findElement(By.xpath("(//a[text() ='Try it Yourself »'])[2]"));
		//WebElement prompt = driver.findElement(By.xpath("(//a[text() ='Try it Yourself »'])[3]"));
		//WebElement line = driver.findElement(By.xpath("(//a[text() ='Try it Yourself »'])[4]"));
		
		alert.click();
		Thread.sleep(1000);
		
		ArrayList<String> addr = new ArrayList<String>( driver.getWindowHandles() );
		
		System.out.println(driver.getWindowHandle());
		System.out.println(addr.get(0));
		System.out.println(addr.get(1));
	
		driver.switchTo().window(addr.get(1));
		
		WebElement getwebsite = driver.findElement(By.xpath("//a[text () ='Get your']"));
		
		getwebsite.click();
		Thread.sleep(3000);
		
		addr = new ArrayList<String>( driver.getWindowHandles() );
		
		System.out.println(addr.get(0));
		System.out.println(addr.get(1));
		System.out.println(addr.get(2));
		
		driver.switchTo().window(addr.get(0));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(addr.get(1));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(addr.get(2));
		System.out.println(driver.getCurrentUrl());
		
		WebElement login = driver.findElement(By.xpath("//a[text () ='Log in']"));
		
		login.click();
	}

}
