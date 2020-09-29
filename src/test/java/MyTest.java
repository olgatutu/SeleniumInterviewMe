import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MyTest {
    private WebDriver driver;
    private PersonalDataPage personalDataPage;
    private MainPage mainPage;
    private ExperiencePage experiencePage;
    private NavigationPanel navigationPanel;
    private PreviewPage previewPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://interviewme.pl/");
        mainPage = new MainPage(driver);
        previewPage = new PreviewPage(driver);
        personalDataPage = new PersonalDataPage(driver);


    }

    @Test
    public void myTest1() throws IOException {
        
       mainPage.createCV();
        personalDataPage.setName("Olga");
        personalDataPage.setSurname("Tuturusz");
        personalDataPage.uploadPhoto("C:\\Users\\48505\\IdeaProjects\\Testowanie\\Selenium\\src\\main\\resources\\olga_foto.png");
        personalDataPage.setEmail("olga.tuturusz@gmail.com");
        personalDataPage.setPhoneNumber("505955715");
        personalDataPage.setTytulZawodowy("Tester oprogramowania");
        personalDataPage.setAdres(" ul. Uranowa 19B/20 81-160 Gdynia");
        Assert.assertTrue(previewPage.isNameVisible());
        Assert.assertTrue(previewPage.isSurnameVisible());
        Assert.assertTrue(personalDataPage.isNameSet("Olga"));
        Assert.assertTrue(personalDataPage.isEmailSet("olga.tuturusz@gmail.com"));
        personalDataPage.setButtonZapisz();

    }


    @After
    public void tearDown() {
        //driver.close();

    }
}