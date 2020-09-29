package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class CommonUtils {


    public static void scrollWindow(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver; js.executeScript("window.scrollBy(0,250)", "");
    }
}
