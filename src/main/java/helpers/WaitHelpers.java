package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelpers {

    //waitForInvisibilityOfElementLocatedBy();
    //waitForElementToBeClickable();
    //waitForElementNotToBeVisible();

        public static void waitForElementToBeVisible(WebElement element, WebDriver driver) {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOf(element));
        }
        public static void waitForVisibilityOfElementLocatedBy(By locator, WebDriver driver) {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        }
    }
