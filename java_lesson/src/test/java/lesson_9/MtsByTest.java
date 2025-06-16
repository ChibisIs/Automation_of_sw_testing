import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MtsByTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeEach
    void setupTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
        try {
            WebElement cookieButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='cookie-agree']")));
            cookieButton.click();
        } catch (Exception e) {
            // Если баннер не появился — ничего не делаем
        }
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    void testBlockTitle() {
        WebElement blockTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[@class='pay']//h2")));
        String actual = blockTitle.getText().replace("\n", " ").replaceAll("\\s+", " ").trim(); //удаление лишних пробелов и переноса
        assertEquals("Онлайн пополнение без комиссии", actual, "The title does not match the expectation");
    }

    @Test 
    void testLogos() {
        List<WebElement> logos = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='pay__partners']//li//img")));
        assertFalse(logos.isEmpty());
    }

    @Test 
    void testLink() {
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='pay__wrapper']//a")));
        link.click();
        assertTrue(driver.getCurrentUrl().contains("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"),
                                                   "The link does not lead to the expected URL");
    } 

    @Test 
    void testButton() {
        WebElement phoneNumber = driver.findElement(By.xpath("//input[@placeholder='Номер телефона']"));
        phoneNumber.click();
        phoneNumber.sendKeys("297777777");

        WebElement amount = driver.findElement(By.xpath("//input[@placeholder='Сумма']"));
        amount.click();
        amount.sendKeys("100");

        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='pay-connection']/button")));
        button.click();
        
        WebElement paymentForm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@class='bepaid-iframe']")));
        assertTrue(paymentForm.isDisplayed(), "Payment form is not displayed after clicking the button");}
}