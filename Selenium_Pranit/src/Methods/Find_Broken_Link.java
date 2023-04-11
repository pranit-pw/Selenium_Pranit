package Methods;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Broken_Link {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Pranit\\Velocity Class\\chromedriver_win32\\chromedriver.exe") ;
		
		WebDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize();
		
		driver.get("https://www.fireboltt.com/");
		Thread.sleep(3000);
		
		for(int i = 1 ; i <= 300 ; i++)
		{
			WebElement a = driver.findElement(By.xpath("(//a[1])["+i+"]"));
				
            String attribute = a.getAttribute("href");

		if(attribute.equals(null) && attribute.equals(""))
		{
			System.out.println("link is Broken");
		}
		else
		{
			System.out.println(attribute);
		}
		}
	
	}

}
