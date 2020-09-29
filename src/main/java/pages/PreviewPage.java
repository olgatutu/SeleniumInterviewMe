package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PreviewPage {
    By nameInPreview = By.xpath("//*[@data-cy='builder-preview']//*[contains(text(),'Olga')]");
    By surnameInPreview = By.xpath("//input[@name='lastName']");
    private WebDriver driver;

    public PreviewPage(WebDriver driver) {
        this.driver = driver;
    }
    public boolean isNameVisible(){
        boolean namevisible;
        namevisible = driver.findElement(nameInPreview).isDisplayed();
        return  namevisible;
    }
    public boolean isSurnameVisible(){
        boolean surnamevisible;
        surnamevisible = driver.findElement(surnameInPreview).isDisplayed();
        return surnamevisible;
    }
}