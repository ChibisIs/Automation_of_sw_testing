package lesson_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PaySection {
    private WebDriver driver;
    private WebDriverWait wait;

    public PaySection(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement getBlockTitle() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//section[@class='pay']//h2")));
    }

    public List<WebElement> getLogos() {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
            By.xpath("//div[@class='pay__partners']//li//img")));
    }

    public WebElement getLink() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[@class='pay__wrapper']//a")));
    }

    public WebElement getPhoneInput() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//form[@id='pay-connection']//input[@id='connection-phone']")));
    }

    public WebElement getSumInput() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//form[@id='pay-connection']//input[@id='connection-sum']")));
    }

    public WebElement getEmailInput() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//form[@id='pay-connection']//input[@id='connection-email']")));
    }

    public WebElement getPayButton() {
        return wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//form[@id='pay-connection']//button")));
    }

    public WebElement getSelectButton() {
        return wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//section[@class='pay']//button[@class='select__header']")));
    }

    public List<WebElement> getSelectList() {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
            By.xpath("//section[@class='pay']//ul//p")));
    }

    public WebElement getSelectSpan () {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//section[@class='pay']//button[@class='select__header']//span[@class='select__now']")));
    }

    public WebElement getPhoneInternetInput() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//form[@id='pay-internet']//input[@id='internet-phone']")));
    }

    public WebElement getSumInternetInput() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//form[@id='pay-internet']//input[@id='internet-sum']")));
    }

    public WebElement getEmailInternetInput() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//form[@id='pay-internet']//input[@id='internet-email']")));
    }

    public WebElement getScoreInstalmentInput() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//form[@id='pay-instalment']//input[@id='score-instalment']")));
    }

    public WebElement getSumInstalmentInput() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//form[@id='pay-instalment']//input[@id='instalment-sum']")));
    }

    public WebElement getEmailInstalmentInput() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//form[@id='pay-instalment']//input[@id='instalment-email']")));
    }

    public WebElement getScopeArrearsButton() {
        return wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//form[@id='pay-arrears']//input[@id='score-arrears']")));
    }

    public WebElement getSumArrearsInput() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//form[@id='pay-arrears']//input[@id='arrears-sum']")));
    }

    public WebElement getEmailArrearsInput() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//form[@id='pay-arrears']//input[@id='arrears-email']")));
    }

    public WebElement getPaymentForm() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//iframe[@class='bepaid-iframe']")));
    }
}