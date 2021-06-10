package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity8 {
WebDriver driver;
    
    @BeforeTest
    public void beforeMethod() {
        
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
    }
    
    @Test
    public void testCase() {
        
    	//enter credentials 
    	WebElement userName = driver.findElement(By.xpath("//input[@id ='user_login']"));
        WebElement password = driver.findElement(By.xpath("//input[@id ='user_pass']"));
        
        userName.sendKeys("root");
        password.sendKeys("pa$$w0rd");
        
        //login
        driver.findElement(By.xpath("//input[@id ='wp-submit']")).click();
        
        //Verify that you have logged in
        boolean dasboard = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/h1")).isDisplayed();
        System.out.println("You are logged in : " + dasboard);
    
    }
    
    @AfterMethod
    public void afterMethod() {
       
        driver.quit();
    }
}
