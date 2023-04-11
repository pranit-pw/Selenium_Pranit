package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Button {
	
	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "E:\\Pranit\\Velocity Class\\chromedriver_win32\\chromedriver.exe") ;
		
		WebDriver driver = new ChromeDriver() ;
		
		driver.manage().window().maximize();
		
		driver.get("https://www.keynotesupport.com/");

		WebElement AllMenu = driver.findElement(By.xpath("//span[text () = 'All Menus']")) ;
		AllMenu.click() ;
		Thread.sleep(1000) ;
		
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		js.executeScript("window.scrollBy(0,1000)") ;
		Thread.sleep(2000) ;
		
		WebElement WebmasterTutorials = driver.findElement(By.xpath("//a[text () ='Webmaster Tutorials']")) ;
		WebmasterTutorials.click() ;
		Thread.sleep(2000) ;
		
		js.executeScript("window.scrollBy(0,300)") ;
		
		WebElement CHECKBOXES = driver.findElement(By.xpath("//a[text () ='Sample Contact Form: CHECKBOXES']")) ;
		CHECKBOXES.click() ;
		Thread.sleep(2000) ;
		
		js.executeScript("window.scrollBy(0,1500)") ;
		
		WebElement Desktop = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")) ;
		
		boolean result = Desktop.isSelected();
		
		if(result == false) {
			
			System.out.println(result);
			System.out.println("Button is not Selected");
			System.out.println("Pass");
			Desktop.click() ;
		}
		else {
			System.out.println(result);
			System.out.println("Button is Selected");
			System.out.println("Fail");
		}
		
		result = Desktop.isSelected() ;
		System.out.println(result);
		Thread.sleep(500) ;
		
		WebElement Notebook = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")) ;
		
         result = Notebook.isSelected();
		
		if(result == false) {
			
			System.out.println(result);
			System.out.println("Button is not Selected");
			System.out.println("Pass");
			Notebook.click() ;
		}
		else {
			System.out.println(result);
			System.out.println("Button is Selected");
			System.out.println("Fail");
		}
		
		result = Notebook.isSelected() ;
		System.out.println(result);
		Thread.sleep(500) ;
		
		WebElement Netbook = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")) ;
		
        result = Netbook.isSelected();
		
		if(result == false) {
			
			System.out.println(result);
			System.out.println("Button is not Selected");
			System.out.println("Pass");
			Netbook.click() ;
		}
		else {
			System.out.println(result);
			System.out.println("Button is Selected");
			System.out.println("Fail");
		}
		
		result = Netbook.isSelected() ;
		System.out.println(result);
		Thread.sleep(500) ;
		
        WebElement Server = driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")) ;
		
        result = Server.isSelected();
		
		if(result == false) {
			
			System.out.println(result);
			System.out.println("Button is not Selected");
			System.out.println("Pass");
			Server.click() ;
		}
		else {
			System.out.println(result);
			System.out.println("Button is Selected");
			System.out.println("Fail");
		}
		
		result = Server.isSelected() ;
		System.out.println(result);
		Thread.sleep(500) ;
		
        WebElement Other = driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")) ;
		
        result = Other.isSelected();
		
		if(result == false) {
			
			System.out.println(result);
			System.out.println("Button is not Selected");
			System.out.println("Pass");
			Other.click() ;
		}
		else {
			System.out.println(result);
			System.out.println("Button is Selected");
			System.out.println("Fail");
		}
		
		result = Other.isSelected() ;
		System.out.println(result);
		Thread.sleep(500) ;
		
		Other.click() ;
		Thread.sleep(500) ;
		Server.click() ;
		Thread.sleep(500) ;
		Netbook.click() ;
		Thread.sleep(500) ;
		Notebook.click() ;
		Thread.sleep(500) ;
		Desktop.click() ;
	}
}
