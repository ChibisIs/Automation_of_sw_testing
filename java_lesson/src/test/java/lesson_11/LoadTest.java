package lesson_10;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoadTest {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeEach
    public void setupTest() {
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
    public void teardown() {
        driver.quit();
    }

}