package Pack1;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazone {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "E:\\\\Pranit\\\\chromedriver.exe") ;
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options) ;
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		
		WebElement AccountandLists = driver.findElement(By.xpath("(//span[normalize-space()='Account & Lists'])[1]")) ;
		AccountandLists.click() ;
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='ap_email']"));
		Email.sendKeys("pranitwarhikar@gmail.com" + Keys.ENTER) ;
		Thread.sleep(2000) ;
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='ap_password']")) ;
		Password.sendKeys("Pranit@5172" + Keys.ENTER) ;
	    Thread.sleep(5000);
		
	    WebElement Search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")) ;
	    Search.sendKeys("iphone 14" + Keys.ENTER) ;
		
	    WebElement Mobile1 = driver.findElement(By.xpath("//div[contains(@data-index,'2')][1]//h2//span")) ;
	    Mobile1.click() ;
	    Thread.sleep(3000) ;
		
		driver.getWindowHandles();
		
		ArrayList<String> addr = new ArrayList<>(driver.getWindowHandles());
		
		driver.switchTo().window(addr.get(1));
		
		WebElement AddToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']")) ;
		AddToCart.click() ;
		Thread.sleep(2000) ;
		
		//WebElement iframe = driver.findElement(By.xpath(checkoutPrefetch)) ;
		driver.switchTo().frame("DAsis") ;
		Thread.sleep(3000) ;
		
		WebElement Cart = driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button-announce']"));
		Cart.click() ;	
		
		//driver.findElement(By.xpath("//input[@data-testid='Address_selectShipToThisAddress']")).click();
	}
}
