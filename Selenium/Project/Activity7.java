package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity7 {
	WebDriver driver;

	@BeforeTest
	public void beforeMethod() {
	    
	    driver = new FirefoxDriver();
	    driver.get("https://alchemy.hguy.co/jobs");
	}

	@Test
	public void testCase() throws InterruptedException {
	    
		 driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/post-a-job/']")).click();
		 
		 //Fill in required details
		 driver.findElement(By.xpath("//input[@id = 'create_account_email']")).sendKeys("test24@nl.com");
		 driver.findElement(By.xpath("//input[@id = 'job_title']")).sendKeys("Testing Job2");
		 driver.findElement(By.xpath("//*[@id=\"job_description_ifr\"]")).sendKeys("Test Automation");
		 
		 driver.findElement(By.xpath("//input[@id = 'application']")).sendKeys("AN24@gmail.com");
		 driver.findElement(By.xpath("//input[@id = 'company_name']")).sendKeys("IBM");
		 
		 //click on preview
		 driver.findElement(By.xpath("//input[@class='button']")).click();
		 
		 //click on submit listing
		 driver.findElement(By.xpath("//input[@id='job_preview_submit_button']")).click();
		 
		 //Verify that the job listing was posted by visiting the jobs page
		 driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/jobs/']")).click();
		 driver.findElement(By.xpath("//input[@id = 'search_keywords']")).sendKeys("Testing Job");
		 driver.findElement(By.xpath("//input[@value= 'Search Jobs']")).click();
		 Thread.sleep(3000);

		 boolean job = driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/job/ibm-2-testing-job2/']")).isDisplayed();
	     System.out.println("Job is posted : " + job);
	}

	@AfterMethod
	public void afterMethod() {
	   
	    driver.quit();
	}
}
