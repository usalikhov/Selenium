/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student1732MD;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Lenovo-Yoga2
 */
public class SeleniumClassNGTest {
    
    public String baseUrl = "http://newtours.demoaut.com";
    public WebDriver driver = new FirefoxDriver();
    
    
    public SeleniumClassNGTest() {
    }

    @Test
    public void VerifyHomepageTitle() {
        driver.get(baseUrl);
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        
    }
    
}
