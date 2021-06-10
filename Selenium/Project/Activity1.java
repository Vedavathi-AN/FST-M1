package SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity1 {
WebDriver driver;
    
    @BeforeTest
    public void beforeMethod() {
        
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
    }
    
    @Test
    public void testCase() {
    	
    	//get title of the website
        String title = driver.getTitle();
        System.out.println("Title is: " + title);
        
      //verifying mathcing exactly
        Assert.assertEquals("Alchemy Jobs – Job Board Application",title);
    }

    @AfterMethod
    public void afterMethod() {
       
        driver.quit();
    }
}
