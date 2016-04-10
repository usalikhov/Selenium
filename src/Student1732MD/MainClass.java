package Student1732MD;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
public class MainClass {

    public static void main(String[] args) {
//        SeleniumClass sc = new SeleniumClass();
//        JavaClass jc = new JavaClass();
//        ShowMonth sm = new ShowMonth();
//        
//        sm.WhichMonthIsIt(ShowMonth.Month.January);

        for (int i = 0; i < 6; i++) {
            for (int m = 0; m < i+1; m++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
