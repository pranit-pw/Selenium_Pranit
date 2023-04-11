package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Facebook {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Pranit\\chromedriver.exe") ;
		
		WebDriver driver = new ChromeDriver(options);
		
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		
		driver.get("https://www.axisbank.com/");
		
		//To Enter a Email to Email Credential
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pranitwarhikar@gmail.com" + Keys.TAB);
		
		//To Enter a Email to Password Credential
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Pranit@5171" + Keys.ENTER);
		
		//To Click on Profile 
		//driver.findElement(By.xpath("//span[contains(text(),'PraNit WarHikar')]")).click();
		
		WebElement closedAdsButton = driver.findElement(By.xpath("//span[text()='X']"));
		closedAdsButton.click();
		
		WebElement exploreProducts = driver.findElement(By.xpath("//a[text()='Explore Products']"));
		act.moveToElement(exploreProducts).perform();
		
		WebElement depositsOption = driver.findElement(By.xpath("((//div[@class='fLevel'])[1]//li)[2]"));
		act.moveToElement(depositsOption).perform();
		
		for(int i = 14 ; i < 21 ; i++)
		{
			WebElement exploreProductsTabOptions = driver.findElement(By.xpath("((//div[@class='sLevel js-sLevel'])[1]//li)["+i+"]//a"));
			String text = exploreProductsTabOptions.getText();
			System.out.println(text);
		}
		
		driver.quit();
		
		//Explore products Xpath
//		((//div[@class='fLevel'])[1]//li)[1]
		
		//Account option Xpath 
//		((//div[@class='sLevel js-sLevel'])[1]//a)["+i+"]
		
		//Deposits option Xpath
//		((//div[@class='sLevel js-sLevel'])[1]//li)["+i+"]//a
		
		
		
		
		
	}

}
