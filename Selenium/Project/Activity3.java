package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity3 {
WebDriver driver;
    
    @BeforeTest
    public void beforeMethod() {
        
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
    }
    
    @Test
    public void getImagesrc() {
        // locate the image
        WebElement image = driver.findElement(By.xpath("//img[@class='attachment-large size-large wp-post-image']"));
        String src=image.getAttribute("src");
  
        //Print the src of the image
        System.out.println("Page title is: " + src);
           
    
    }
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
