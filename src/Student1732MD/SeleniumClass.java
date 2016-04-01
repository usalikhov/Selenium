/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student1732MD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author Lenovo-Yoga2
 */
public class SeleniumClass {

    WebDriver driver = new FirefoxDriver();
    Actions action = new Actions(driver);

    public SeleniumClass() {
        driver.get("https://ebay.com");
        driver.manage().window().maximize();
        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footer = driver.findElement(By.xpath(".//*[@id='glbfooter']"));

        for (int i = 0; i < footer.findElements(By.tagName("a")).size(); i++) {

            System.out.println(footer.findElements(By.tagName("a")).get(i).getText());
        }
    }
}
