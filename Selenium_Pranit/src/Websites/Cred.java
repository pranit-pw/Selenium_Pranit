package Websites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cred {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Pranit\\Velocity Class\\chromedriver_win32\\chromedriver.exe") ;
		
		WebDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize() ;
		
		driver.get("https://cred.club/check-your-credit-score");
		
		WebElement CheckScore = driver.findElement(By.xpath("//div[text ()='Check credit score']")) ;
		CheckScore.click() ;
		Thread.sleep(2000) ;
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@class='firstName']")) ;
		WebElement LastName = driver.findElement(By.xpath("(//input[@class='inputField'])[1]")) ;
		WebElement Phone = driver.findElement(By.xpath("(//input[@class='inputField'])[2]")) ;
		WebElement Email = driver.findElement(By.xpath("(//input[@class='inputField'])[3]")) ;
		WebElement Check = driver.findElement(By.xpath("//span[@class='sc-1r121k1-5 gqSSvN']")) ;
		
		
		FirstName.sendKeys("Pranit") ;
		Thread.sleep(2000) ;
		
		LastName.sendKeys("Warahikar") ;
		Thread.sleep(2000) ;
		
		Phone.sendKeys("9881411928") ;
		Thread.sleep(2000) ;
		
		Email.sendKeys("Pranitwarhikar@gmail.com") ;
		Thread.sleep(2000) ;
		
		Check.click() ;
		
		//Submit.click() ;
		
		//FirstName.getText() ;
		//Thread.sleep(2000) ;
		
		//FirstName.sendKeys("Pranit") ;
		
	}

}
