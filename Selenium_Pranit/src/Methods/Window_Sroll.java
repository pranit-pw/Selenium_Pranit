package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Window_Sroll {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions() ;
		options.addArguments("--disable-notifications") ;
		options.addArguments("--remote-allow-origins=*");
		
		 System.setProperty("webdriver.chrome.driver", "E:\\Pranit\\chromedriver.exe") ;
		
		WebDriver driver = new ChromeDriver(options) ;
		
		driver.manage().window().maximize();
		
		driver.get("https://www.netflix.com/");
		
		WebElement Singin = driver.findElement(By.xpath("//a[text()= 'Sign In']")) ;
		
		Singin.click() ;
		Thread.sleep(1000);
		
		WebElement Email = driver.findElement(By.xpath("(//label[@class='input_id'])[1]")) ;
		
		Email.sendKeys("pranitwarhikar@gmail.com" + Keys.TAB) ;
		Thread.sleep(2000) ;
		
		WebElement Pass = driver.findElement(By.xpath("(//label[@class='input_id'])[2]")) ;
		
		Pass.sendKeys("Pranit@5172" + Keys.ENTER) ;
		Thread.sleep(2000) ;
		
		WebElement Profile = driver.findElement(By.xpath("//span[text () = 'pranitwarhikar']")) ;
		
		Profile.click() ;
		Thread.sleep(4000) ;
		
		WebElement TrendingNow = driver.findElement(By.xpath("//div[contains(@data-list-context,'trendingNow')]//div[3]//a")) ;
		
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		
		js.executeScript("arguments[0].scrollIntoView(true);", TrendingNow) ; 
		Thread.sleep(3000) ;
		
		js.executeScript("window.scrollBy(0,-200)") ;
		Thread.sleep(2000) ;
		
        Actions act = new Actions(driver) ;
		
		act.moveToElement(TrendingNow).click().perform() ;
		Thread.sleep(4000) ;
		
		js.executeScript("window.scrollBy(0,500)") ;
		Thread.sleep(2000) ;
		
		js.executeScript("window.scrollBy(0,-500)") ;
		Thread.sleep(2000) ;
		
		WebElement CloseTab1 = driver.findElement(By.xpath("//div[@class='previewModal-close']")) ;
		CloseTab1.click() ;	
		
        WebElement OnlyOnNetflix1 = driver.findElement(By.xpath("(//div[@id='row-5']//div)[9]")) ;
		
		//js = (JavascriptExecutor)driver ;
		
		js.executeScript("arguments[0].scrollIntoView(true);", OnlyOnNetflix1) ; 
		Thread.sleep(3000) ;
		
		js.executeScript("window.scrollBy(0,-200)") ;
		Thread.sleep(2000) ;
		
        //act = new Actions(driver) ;
		
		act.moveToElement(OnlyOnNetflix1).click().perform() ;
		Thread.sleep(4000) ;
		
		js.executeScript("window.scrollBy(0,500)") ;
		Thread.sleep(2000) ;
		
		js.executeScript("window.scrollBy(0,-500)") ;
		Thread.sleep(2000) ;
		
		WebElement CloseTab2 = driver.findElement(By.xpath("//div[@class='previewModal-close']")) ;
		CloseTab2.click() ;	
		

	}

}
