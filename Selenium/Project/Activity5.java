package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Activity5 {
WebDriver driver;

@BeforeTest
public void beforeMethod() {
    
    driver = new FirefoxDriver();
    driver.get("https://alchemy.hguy.co/jobs");
}

@Test
public void testCase() {
    
	 driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/jobs/']")).click();
	 String pagetitle = driver.findElement(By.xpath("//h1[@itemprop='headline']")).getText();
	 System.out.println("PageTitle is: " + pagetitle);
	 Assert.assertEquals("Jobs",pagetitle);
}

@AfterMethod
public void afterMethod() {
   
    driver.quit();
}
}

