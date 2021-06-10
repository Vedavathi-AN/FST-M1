package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity6 {
	WebDriver driver;

	@BeforeTest
	public void beforeMethod() {
	    
	    driver = new FirefoxDriver();
	    driver.get("https://alchemy.hguy.co/jobs");
	}

	@Test
	public void testCase() throws InterruptedException {
	    
		
		driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/jobs/']")).click();
		
		////Search for a particular job and wait for listings to show
		driver.findElement(By.xpath("//input[@id = 'search_keywords']")).sendKeys("Banking");
		driver.findElement(By.xpath("//input[@value = 'Search Jobs']")).click();
		Thread.sleep(5000);

		//open any one of the jobs listed
		driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/job/banking402/']")).click();
				
		//Click the apply button and print the email to the console
		driver.findElement(By.xpath("//input[contains(@class, 'application_button button')]")).click();
		String email = driver.findElement(By.xpath("//a[@class='job_application_email']")).getText();
		System.out.println("Email details to : " + email);
	}

	@AfterMethod
	public void afterMethod() {
	   
	    driver.quit();
	}
}
