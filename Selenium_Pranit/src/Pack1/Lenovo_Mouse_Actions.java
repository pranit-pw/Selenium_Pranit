package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lenovo_Mouse_Actions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chromedriver", "E:\\Pranit\\Velocity Class\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.qualcomm.com/snapdragon");
		
		Thread.sleep(3000);
		
		WebElement Lenovo = driver.findElement(By.xpath("//span[text()='Snapdragon Mobile Platfor...']"));
		
		WebElement DeviceFinder = driver.findElement(By.xpath("//div[text()='Device Finder']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(Lenovo).perform();
		
		Thread.sleep(3000);
		
		act.moveToElement(DeviceFinder).perform();
		
		act.click().perform();		
		
	}
}
