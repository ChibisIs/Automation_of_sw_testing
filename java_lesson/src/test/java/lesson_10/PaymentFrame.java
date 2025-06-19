package lesson_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PaymentFrame {
    private WebDriver driver;
    private WebDriverWait wait;

    public PaymentFrame(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement getPaymentSum() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[@class='pay-description__cost']//span")));
    }

    public WebElement getPaymentInfo() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[@class='pay-description__text']//span")));
    }

    public WebElement getCCNumberPlaceholder() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//app-card-page//label[@class='ng-tns-c2312288139-1 ng-star-inserted']")));
    }

    public WebElement getCardDatePlaceholder() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//app-card-page//label[@class='ng-tns-c2312288139-4 ng-star-inserted']")));
    }

    public WebElement getCardCVCPlaceholder() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//app-card-page//label[@class='ng-tns-c2312288139-5 ng-star-inserted']")));
    }

    public WebElement getCardHolderPlaceholder() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//app-card-page//label[@class='ng-tns-c2312288139-3 ng-star-inserted']")));
    }

    public List<WebElement> getCardTypeIcons() {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
            By.xpath("//app-card-input//img")));
    }

    public WebElement getCardSubmitButton() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//app-card-page//button[@type='submit']")));
    }
}