package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_Mouse_Actions {
	
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.driver.chromedriver", "E:\\Pranit\\Velocity Class\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@class=\'_2KpZ6l _2doB4z\']")).click();
	
	Thread.sleep(3000);
	
	WebElement Electronics = driver.findElement(By.xpath("//div[@class='eFQ30H'][4]"));
	
    Actions act = new Actions(driver);
	
	act.moveToElement(Electronics).perform();
	Thread.sleep(2000) ;
	
	WebElement Gaming = driver.findElement(By.xpath("//a[@class='_6WOcW9'][3]")) ;
	act.moveToElement(Gaming).perform();
	Thread.sleep(3000);
	
	WebElement GamingMouse = driver.findElement(By.xpath("//a[text()='Gaming Mouse']"));
	act.moveToElement(GamingMouse).click().perform() ;
	Thread.sleep(3000);
	
	}
}
