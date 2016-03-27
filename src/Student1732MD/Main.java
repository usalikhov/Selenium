package Student1732MD;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author 1732MD
 */
public class Main {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions action = new Actions(driver);

        driver.get("https://ebay.com");
        driver.manage().window().maximize();
        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footer = driver.findElement(By.xpath(".//*[@id='glbfooter']"));

        for (int i = 0; i < footer.findElements(By.tagName("a")).size(); i++) {

            System.out.println(footer.findElements(By.tagName("a")).get(i).getText());
        }

    }
}
