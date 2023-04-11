package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Pranit\\Velocity Class\\chromedriver_win32\\chromedriver.exe") ;
		
		WebDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile" + Keys.ENTER );
		
		//driver.findElement(By.xpath("//a[@data-csa-c-content-id=\"nav_avod_desktop_topnav\"]")).click();
		driver.findElement(By.xpath("//a[@data-csa-c-content-id=\"nav_avod_desktop_topnav\"]")).click();
		
		//driver.findElement(By.xpath("//h1[@data-testid=\"appnavbar_menuitem_webseries\"]")).click();
		driver.findElement(By.xpath("//h1[@data-testid=\"appnavbar_menuitem_webseries\"]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//WebElement series=driver.findElement(By.xpath("//img[@data-testid=\"webseries_thumbnailCarouselItem_9_thumbnailCard_1_cardImage\"]"));
		WebElement series=driver.findElement(By.xpath("//img[@data-testid=\"webseries_thumbnailCarouselItem_9_thumbnailCard_1_cardImage\"]"));
		
		//js.executeScript("arguments[0].scrollIntoView();", series);
		js.executeScript("arguments[0].scrollIntoView();", series);
		//js.executeScript("window.scrollBy(0,5000)","");
		//js.executeScript("window.scrollBy(0,10000)","");
	}
}