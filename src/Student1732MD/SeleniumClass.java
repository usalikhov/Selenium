/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student1732MD;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author Lenovo-Yoga2
 */
public class SeleniumClass {

    WebDriver driver = new FirefoxDriver();
    Actions action = new Actions(driver);

    public SeleniumClass() throws InterruptedException {
        driver.get("http://facebook.com/");
        driver.manage().window().maximize();

        WebElement txtUserName = driver.findElement(By.id("email"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(1000);
        Action seriesOfActions = action
                .moveToElement(txtUserName)
                .click()
                .keyDown(txtUserName, Keys.SHIFT)
                .sendKeys(txtUserName, "hello")
                .keyUp(txtUserName, Keys.SHIFT)
                .doubleClick(txtUserName)
                .contextClick()
                .build();
        
        seriesOfActions.perform();
        
        
        
        
    }
}
