package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTraining {
		
		WebDriver driver;
		// launching chrome
		public void LaunchBrowser()
		{
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.simplilearn.com/");
			
		}
		//searching
		public void search()
		{
			driver.findElement(By.id("header_srch")).sendKeys("Selenium");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			driver.findElement(By.xpath("//span[@class='search_icon]")).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//h2[text()='Selenium 3.0 Training]")).click();
			System.out.println("The page title is : " + driver.getTitle());
		}
		//close the browser
		public void closebrowser()
		{
			driver.quit();
		}
		
		public static void main(String[] args)
		{
			SearchTraining obj = new SearchTraining();
			obj.LaunchBrowser();
			obj.search();
			obj.closebrowser();
			
		}
	}


