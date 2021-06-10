package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity4 {
WebDriver driver;
    
    @BeforeTest
    public void beforeMethod() {
        
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
    }
    
    @Test
    public void testCase() {
        
    	//get second heading of the website
    	String secondheader = driver.findElement(By.xpath("//h2")).getText();
        System.out.println("Heading is: " + secondheader);
        
      //verifying mathcing exactly
        Assert.assertEquals("Quia quis non",secondheader);
    }

    @AfterMethod
    public void afterMethod() {
    	
        driver.quit();
    }
}
