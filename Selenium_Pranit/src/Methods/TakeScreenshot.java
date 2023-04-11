package Methods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Pranit\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(option);
		
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		
//		TakesScreenshot ts = (TakesScreenshot)driver ;
//		
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		
//		File dest = new File("E:\\Pranit\\amazon.jpeg");
//		
//		FileHandler.copy(src, dest);
		for(int i = 1 ; i < 3 ; i++)
		{
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest1 = new File("E:\\Pranit\\Amazon"+i+".jpeg");
		FileHandler.copy(src1, dest1);
		Thread.sleep(1000);
		}
		driver.quit();
	}
	
	


}
