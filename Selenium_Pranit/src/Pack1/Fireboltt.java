package Pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fireboltt {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.driver.chromedriver", "E:\\Pranit\\Velocity Class\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.fireboltt.com/");
		
		
	}

}
