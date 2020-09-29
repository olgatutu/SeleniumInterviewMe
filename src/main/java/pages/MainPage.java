package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    WebDriver driver;

    //Elementy
    By buttonCreateCVNow = By.xpath("//a[@title='Stwórz CV Teraz']");
    By templateConcept = By.xpath("//img[@alt='Szablon CV Concept']");
    By buttonStart = By.xpath("//a[@data-cy='how-it-works-cta']");

    public MainPage(WebDriver driver) {
        this.driver = driver;

    }

    //Funkcje
    public void createCV() {
        driver.findElement(buttonCreateCVNow).click();

        //tutaj bedzie wait
        driver.findElement(templateConcept).click();
        driver.findElement(buttonStart).click();
    }

}
