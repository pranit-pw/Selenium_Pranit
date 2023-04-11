package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Mouse_Action {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chromedriver", "E:\\Pranit\\Velocity Class\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement accandsingnin = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		WebElement youraccount = driver.findElement(By.xpath("//span[text()='Your Account']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(accandsingnin).perform();
		Thread.sleep(3000);
		
		act.moveToElement(youraccount).perform();
		Thread.sleep(3000);
		
		act.click().perform();
	}
}
