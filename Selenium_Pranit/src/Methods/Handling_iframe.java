package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_iframe {
	
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "E:\\Pranit\\Velocity Class\\chromedriver_win32\\chromedriver.exe") ;
		
		WebDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(3000);
		
		WebElement Frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(Frame1);
		
		WebElement EnterText1 = driver.findElement(By.xpath("//input[@name='mytext1']"));
		EnterText1.sendKeys("Pranit");
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		
		WebElement Frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(Frame2);
		Thread.sleep(2000);
		
		WebElement EnterText2 = driver.findElement(By.xpath("//input[@name='mytext2']"));
		EnterText2.sendKeys("Pranit");
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		
		WebElement Frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(Frame3);
		Thread.sleep(2000);
		
		WebElement EnterText3 = driver.findElement(By.xpath("//input[@name='mytext3']"));
		EnterText3.sendKeys("Pranit");
		Thread.sleep(2000);
		
		WebElement ChildFrame = driver.findElement(By.xpath("//iframe[@height='350']"));
		driver.switchTo().frame(ChildFrame);
		Thread.sleep(2000);
		
		WebElement Option1 = driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[1]"));
		Option1.click();
	}

}
