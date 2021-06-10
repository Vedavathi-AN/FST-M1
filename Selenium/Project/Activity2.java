package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity2 {
WebDriver driver;
    
    @BeforeTest
    public void beforeMethod() {
        
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
    }
    
    @Test
    public void testCase() {
    	
    	//get heading of the website
    	String header = driver.findElement(By.xpath("//h1[@itemprop='headline']")).getText();
        System.out.println("Heading is: " + header);
        
        //verifying mathcing exactly
        Assert.assertEquals("Welcome to Alchemy Jobs",header);
    }

    @AfterMethod
    public void afterMethod() {
       
        driver.quit();
    }
}
