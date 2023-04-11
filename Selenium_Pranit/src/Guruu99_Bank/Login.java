package Guruu99_Bank;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "E:\\Pranit\\chromedriver.exe") ;
		
		WebDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize();
		
		driver.get("https://www.demo.guru99.com/V4/");
		
		WebElement Userid = driver.findElement(By.xpath("//input[@type='text']")); 
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));	
		WebElement Login = driver.findElement(By.xpath("//input[@type='submit']"));
		
		//mngr481167
		//dYqEheq
		Userid.sendKeys("mngr481167", Keys.TAB);
		Password.sendKeys("dYqEhdj" , Keys.TAB);
		Thread.sleep(3000);
		
		Login.click();
		
		//WebElement Title = driver.findElement(By.xpath("//h2[text()='Guru99 Bank']"));
		//String T = Title.getText();
		
		//System.out.println(T);
	}

}
