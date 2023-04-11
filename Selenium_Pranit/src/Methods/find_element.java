package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class find_element {
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "E:\\Pranit\\Velocity Class\\chromedriver_win32\\chromedriver.exe") ;
			
			WebDriver driver = new ChromeDriver() ;
			
			driver.manage().window().maximize();
			
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			
			for (int i = 2 ; i <= 7 ; i++)
			{
				driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]"));
				System.out.println();
				
				for(int j = 1 ; j <= 3 ; j++)
				{
					WebElement Colum = driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]//td["+j+"]"));
					
					String c = Colum.getText();
					System.out.print(c + ", ");
				}
			}
	}
}
