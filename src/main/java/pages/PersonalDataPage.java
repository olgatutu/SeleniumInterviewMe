package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class PersonalDataPage {

    private WebDriver driver;

    By inputFirstName = By.cssSelector("[name='firstName']");
    By inputSureName = By.xpath("//input[@name='lastName']");
    By inputUploadPhoto = By.cssSelector("input[type='file']");
    By inputEmail = By.xpath("//input[@placeholder='twoj.email@przyklad.pl']");
    By inputPhoneNumber = By.xpath("//input[@placeholder='+48 770 001 015']");
    By inputAdres = By.xpath("//div[@class='_240Z9 uzugw']/div[@class='-ok8x']/div[@class='_2fz0M']/textarea[@rows='3']");
    By inputTytulZawodowy = By.xpath("//input[@placeholder='Specjalista ds. Administracji']");
    By buttonZapisz = By.xpath("//div[@class='_2vCLG _3qPjW']");

    public PersonalDataPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setName(String name) {
        driver.findElement(inputFirstName).sendKeys(name);
    }

    public void setSurname(String surname) {
        driver.findElement(inputSureName).sendKeys(surname);
    }

    public void setEmail(String email) {
        driver.findElement(inputEmail).sendKeys(email);
    }

    public void setPhoneNumber(String phoneNumber) {
        driver.findElement(inputPhoneNumber).sendKeys(phoneNumber);
    }

    public void setAdres(String adres) {
        driver.findElement(inputAdres).sendKeys(adres);
    }

    public void setTytulZawodowy(String tytulZawodowy) {
        driver.findElement(inputTytulZawodowy).sendKeys(tytulZawodowy);
    }

    public void setButtonZapisz() {
        driver.findElement(buttonZapisz).click();
    }

    public void uploadPhoto(String path) {
        File file = new File(path);
        driver.findElement(inputUploadPhoto).sendKeys(file.getAbsolutePath());
        driver.findElement(buttonZapisz).click();
    }

    public boolean isNameSet(String name) {
        String valueSet = driver.findElement(inputFirstName).getAttribute("value");
        if (valueSet.equals(name)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmailSet(String email) {
        String valueSet = driver.findElement(inputEmail).getAttribute("value");
        if (valueSet.equals(email) && valueSet.contains("@")) {
            return true;
        } else {
            return false;
        }
    }
}
